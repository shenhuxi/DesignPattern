package com.zpself.module.设计模式23.结构型模式.c过滤器模式.criteriaImpl;

import com.zpself.module.设计模式23.结构型模式.c过滤器模式.Criteria;
import com.zpself.module.设计模式23.结构型模式.c过滤器模式.Person;

import java.util.ArrayList;
import java.util.List;
 
public class CriteriaMale implements Criteria {
 
   @Override
   public List<Person> meetCriteria(List<Person> persons) {
      List<Person> malePersons = new ArrayList<Person>(); 
      for (Person person : persons) {
         if(person.getGender().equalsIgnoreCase("MALE")){
            malePersons.add(person);
         }
      }
      return malePersons;
   }
}