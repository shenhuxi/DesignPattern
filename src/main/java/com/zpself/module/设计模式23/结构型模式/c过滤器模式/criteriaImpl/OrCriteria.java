package com.zpself.module.设计模式23.结构型模式.c过滤器模式.criteriaImpl;

import com.zpself.module.设计模式23.结构型模式.c过滤器模式.Criteria;
import com.zpself.module.设计模式23.结构型模式.c过滤器模式.Person;

import java.util.List;
 
public class OrCriteria implements Criteria {
 
   private Criteria criteria;
   private Criteria otherCriteria;
 
   public OrCriteria(Criteria criteria, Criteria otherCriteria) {
      this.criteria = criteria;
      this.otherCriteria = otherCriteria; 
   }
 
   @Override
   public List<Person> meetCriteria(List<Person> persons) {
      List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
      List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);
 
      for (Person person : otherCriteriaItems) {
         if(!firstCriteriaItems.contains(person)){
           firstCriteriaItems.add(person);
         }
      }  
      return firstCriteriaItems;
   }
}