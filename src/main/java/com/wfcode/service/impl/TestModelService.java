package com.wfcode.service.impl;

import com.wfcode.dao.TestModelMapper;
import com.wfcode.model.TestModel;
import com.wfcode.service.ITestModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Liuqz on 2017-7-26.
 */
@Service("testModelService")
public class TestModelService implements ITestModelService {

    @Resource
    private TestModelMapper mapper;

    @Override
    public List<TestModel> findAll() {
        return mapper.findAll();
    }

    @Override
    public TestModel findByCode(String code) {
        return mapper.findByCode(code);
    }
}
