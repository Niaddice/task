package com.sync.task.syncTask.service.impl;

import com.sync.task.syncTask.bean.TradeData;
import com.sync.task.syncTask.service.DataTransferService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Component
public class DataTransferServiceImpl implements DataTransferService
{

    private final Logger logger = LoggerFactory.getLogger(DataTransferServiceImpl.class);

    @Autowired
    private GetDataServiceImpl getDataService;

    @Autowired
    private SetDataServiceImpl setDataService;

    @Override
    @Transactional
    public void dataTransfer()
    {
        ArrayList<String> projectIds = getDataService.getProjects();
        logger.info("获取到项目ID集合："+projectIds.toString());
        ArrayList<TradeData> tradeData = getDataService.getTradeData(projectIds);
        logger.info("获取到 " + tradeData.size() + " 条数据！");
    }
}
