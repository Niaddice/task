package com.sync.task.syncTask.service.impl;

import com.sync.task.syncTask.bean.TradeData;
import com.sync.task.syncTask.config.RoutingWith;
import com.sync.task.syncTask.dao.MysqlMapper;
import com.sync.task.syncTask.dao.SqlserverMapper;
import com.sync.task.syncTask.service.GetDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

@Service
public class GetDataServiceImpl implements GetDataService
{

    private final Logger logger = LoggerFactory.getLogger(DataTransferServiceImpl.class);

    @Resource
    private MysqlMapper mysqlMapper;

    @Resource
    private SqlserverMapper sqlserverMapper;

    @Override
    @RoutingWith("mysql")
    public ArrayList<String> getProjects()
    {
        return mysqlMapper.getProjects();
    }

    @Override
    @RoutingWith("sqlserver")
    public ArrayList<TradeData> getTradeData(ArrayList<String> projectIds)
    {
        return sqlserverMapper.getTradeData(projectIds);
    }

}
