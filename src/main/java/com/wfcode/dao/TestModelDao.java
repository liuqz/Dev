package com.wfcode.dao;

import com.wfcode.model.TestModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * For JPA
 *
 * Created by Liuqz on 2017-7-26.
 */
@Repository
public interface TestModelDao extends JpaRepository<TestModel, String> {
}
