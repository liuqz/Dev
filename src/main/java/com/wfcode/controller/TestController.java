package com.wfcode.controller;

import com.wfcode.dao.TestModelDao;
import com.wfcode.model.TestModel;
import com.wfcode.service.ITestModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Vector;

/**
 * Created by Liuqz on 2017-7-26.
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestModelDao dao;

    @Autowired
    private ITestModelService service;

    @RequestMapping(value = "/testmodel/save", method = RequestMethod.GET)
    public Object testModelSave() {
        List<TestModel> list = new Vector<TestModel>();
        for(int i=1; i<=3; i++){
            TestModel model = new TestModel();
            model.setCode("test0" + String.valueOf(i));
            model.setName("测试0" + String.valueOf(i));
            list.add(model);
        }
        return dao.save(list);
    }

    @RequestMapping(value = "/testmodel/list", method = RequestMethod.GET)
    public Object testModelRead() {
        return dao.findAll();
    }

    @RequestMapping(value = "/testmodel/listall", method = RequestMethod.GET)
    public Object testModelLoad() {
        return service.findAll();
    }

    @RequestMapping(value = "/testmodel/one/{code}", method = RequestMethod.GET)
    public Object testModelReadOne(@PathVariable String code){
        return service.findByCode(code);
    }
}
