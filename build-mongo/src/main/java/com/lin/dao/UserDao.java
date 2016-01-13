package com.lin.dao;

import com.lin.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2016/pattern1/7.
 */
@Repository
public class UserDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void insert(User user){
        mongoTemplate.insert(user);
    }
}
