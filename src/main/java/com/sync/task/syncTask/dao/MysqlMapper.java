package com.sync.task.syncTask.dao;

import com.sync.task.syncTask.bean.TradeData;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;


@Mapper
public interface MysqlMapper
{

    TradeData get();


    ArrayList<String> getProjects();
}
