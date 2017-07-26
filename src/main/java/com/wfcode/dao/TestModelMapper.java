package com.wfcode.dao;

import com.wfcode.model.TestModel;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * For Mybatis
 *
 * Created by Liuqz on 2017-7-26.
 */
public interface TestModelMapper {

    @Select("select * from testmodel")
    List<TestModel> findAll();

    @Select("select * from testmodel where code=#{code}")
    TestModel findByCode(@Param("code") String code);

}
