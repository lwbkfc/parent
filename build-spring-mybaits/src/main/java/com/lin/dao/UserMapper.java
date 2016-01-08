package com.lin.dao;

import com.lin.po.User;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2016/1/8.
 */
@Repository
public interface UserMapper {
    public User getUserById(Long id);
}
