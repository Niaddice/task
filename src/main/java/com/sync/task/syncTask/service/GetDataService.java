package com.sync.task.syncTask.service;

import com.sync.task.syncTask.bean.TradeData;

import java.util.ArrayList;

public interface GetDataService
{
    ArrayList<String> getProjects();

    ArrayList<TradeData> getTradeData(ArrayList<String> projectIds);
}
