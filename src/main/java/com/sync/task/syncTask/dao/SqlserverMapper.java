package com.sync.task.syncTask.dao;

import com.sync.task.syncTask.bean.TradeData;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

public interface SqlserverMapper
{

    ArrayList<TradeData> getTradeData(@Param("projectIds") ArrayList<String> projectIds);
}
