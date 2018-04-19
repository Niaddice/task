package com.sync.task;

import com.sync.task.syncTask.service.impl.DataTransferServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = TaskApplication.class)
public class TaskApplicationTests
{

    @Autowired
    private DataTransferServiceImpl dataTransferService;

    @Test
    public void contextLoads()
    {
        dataTransferService.dataTransfer();
    }

}
