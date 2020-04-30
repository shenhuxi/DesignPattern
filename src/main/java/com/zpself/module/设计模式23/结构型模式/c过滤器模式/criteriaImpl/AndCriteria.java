package com.zpself.module.设计模式23.结构型模式.c过滤器模式.criteriaImpl;

import com.zpself.module.设计模式23.结构型模式.c过滤器模式.Criteria;
import com.zpself.module.设计模式23.结构型模式.c过滤器模式.Person;

import java.util.List;
 
public class AndCriteria implements Criteria {
 
   private Criteria criteria;
   private Criteria otherCriteria;
 
   public AndCriteria(Criteria criteria, Criteria otherCriteria) {
      this.criteria = criteria;
      this.otherCriteria = otherCriteria; 
   }
 
   @Override
   public List<Person> meetCriteria(List<Person> persons) {
      List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);     
      return otherCriteria.meetCriteria(firstCriteriaPersons);
   }
}