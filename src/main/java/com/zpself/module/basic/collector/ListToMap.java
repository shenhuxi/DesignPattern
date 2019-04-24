package com.zpself.module.basic.collector;

import com.google.common.collect.Lists;
import com.zpself.module.basic.collector.util.Person;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author zengpeng
 * @date 2019/4/24
 */
public class ListToMap {
    public static void main(String[] args) {

    }

    /**
     * list转换map
     */
    public  static  void listToMap(){
        ArrayList<Person> list = Lists.newArrayList(new Person("王五","王大五，王二五，王二百五"),new Person("李四","李四1，李四2，李四3"));
        Map map  = new HashMap();
        for (Person person : list) {
            map.put(person.getName(),person.getRename());
        }
    }

    /**
     * list转换set
     */
    public  static  void listToSet(){
        ArrayList<Person> list = Lists.newArrayList(new Person("王五","王大五，王二五，王二百五"),new Person("李四","李四1，李四2，李四3"));
        Set<String> collect = (Set<String>)list.stream().
                map(organ -> {return organ.getName();}).collect(Collectors.toSet());
    }
}
