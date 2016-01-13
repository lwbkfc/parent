package com.lin.dao;

import com.lin.po.User;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2016/pattern1/8.
 */
@Repository
public interface UserMapper {
    public User getUserById(Long id);
}
