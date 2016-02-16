package com.lin.design.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/1/14.
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for (Person person : persons){
            if (person.getGender().equalsIgnoreCase("male")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
