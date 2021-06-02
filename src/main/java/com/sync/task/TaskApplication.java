package com.sync.task;

import com.sync.task.syncTask.config.RoutingDataSource;
import com.sync.task.syncTask.service.impl.DataTransferServiceImpl;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;


@SpringBootApplication
@MapperScan("com.sync.task.syncTask.dao")
public class TaskApplication
{

    private final Logger logger = LoggerFactory.getLogger(DataTransferServiceImpl.class);

    @Bean("mysql1")
    @ConfigurationProperties(prefix = "spring.datasource")
    DataSource masterDataSource() {
        logger.info("create mysql datasource...");
        return DataSourceBuilder.create().build();
    }

    @Bean("sqlserver")
    @ConfigurationProperties(prefix = "custom.datasource")
    DataSource slaveDataSource() {
        logger.info("create sqlserver datasource...");
        return DataSourceBuilder.create().build();
    }

    @Bean
    @Primary
    DataSource primaryDataSource(
            @Autowired @Qualifier("mysql") DataSource masterDataSource,
            @Autowired @Qualifier("sqlserver") DataSource slaveDataSource
    ) {
        logger.info("create routing datasource...");
        Map<Object, Object> map = new HashMap<>();
        map.put("mysql", masterDataSource);
        map.put("sqlserver", slaveDataSource);
        RoutingDataSource routing = new RoutingDataSource();
        routing.setTargetDataSources(map);
        routing.setDefaultTargetDataSource(masterDataSource);
        return routing;
    }

    public static void main(String[] args)
    {
        SpringApplication.run(TaskApplication.class, args);
    }
}
