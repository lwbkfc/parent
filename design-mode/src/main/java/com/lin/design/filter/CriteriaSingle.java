package com.lin.design.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/1/14.
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person person : persons){
            if (person.getGender().equalsIgnoreCase("single")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
