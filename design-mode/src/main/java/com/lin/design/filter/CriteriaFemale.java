package com.lin.design.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/1/14.
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<>();
        for (Person person : persons){
            if (person.getGender().equalsIgnoreCase("female")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
