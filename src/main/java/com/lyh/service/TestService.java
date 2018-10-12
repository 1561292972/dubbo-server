package com.lyh.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.lyh.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

@Service(version = "1.0.0")
public class TestService implements TestServiceInterface{

   @Autowired
    private TestMapper testMapper;

    @Override
    public int insert(Map<String, Object> map) {
        return testMapper.insert(map);
    }

    @Override
    public List<Map<String, Object>> queryList(Map<String, Object> map) {
        return testMapper.query(map);
    }
}
