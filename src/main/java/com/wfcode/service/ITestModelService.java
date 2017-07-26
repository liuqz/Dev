package com.wfcode.service;

import com.wfcode.model.TestModel;

import java.util.List;

/**
 * Created by Liuqz on 2017-7-26.
 */
public interface ITestModelService {
    public List<TestModel> findAll();
    public TestModel findByCode(String code);
}
