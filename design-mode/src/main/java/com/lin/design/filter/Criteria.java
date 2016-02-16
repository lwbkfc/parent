package com.lin.design.filter;

import java.util.List;

/**
 * Created by Administrator on 2016/1/14.
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
