package com.zpself.module.设计模式23.结构型模式.c过滤器模式;

import java.util.List;
 
public interface Criteria {
   public List<Person> meetCriteria(List<Person> persons);
}