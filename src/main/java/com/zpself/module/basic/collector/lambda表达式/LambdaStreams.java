package com.zpself.module.basic.collector.lambda表达式;

import com.zpself.module.basic.collector.util.Person;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/**
 * @author zengpeng
 * @date 2019/5/16
 */
public class LambdaStreams {
    public static void main(String[] args) {
        baseGrammar();
    }
    /**
     * 1.基本语法：遍历
     */
    private static void baseGrammar() {
        List<Person> persons = Arrays.asList(new Person("狙击手", "猎人",25),
                new Person("飞行员", "男",27),
                new Person("科学家", "女",55),
                new Person("女皇", "女",57),
                new Person("吸血鬼", "女",198),
                new Person("狼人", "女",200));

        System.out.println("----------2.1 lambda遍历---------");
        persons.forEach(person -> System.out.printf("%s %s %s; ", person.getName(), person.getSex(),person.getAge()));

        System.out.println("----------2.2:遍历改变属性值---------");
        //2.2遍历改变属性值
        Consumer<Person> giveRaise = (e) -> e.setAge(e.getAge()  + 1);
        persons.forEach(giveRaise);
        persons.forEach(
                (person) -> System.out.printf("%s %s %s; ", person.getName(), person.getSex(),person.getAge())
        );

        System.out.println("----------2.3过滤的方法:打印age大于50的人 前两人---------");
        //Predicate<Person> filterAge =  (p) -> p.getAge()>50;
        Predicate<Person> filterSex = (p) ->("女").equals(p.getSex());
        persons.stream()
                .filter(filterSex)
                .limit(2)
                .forEach(person -> System.out.printf("%s %s %s; ", person.getName(), person.getSex(),person.getAge()));
        System.out.println();

        System.out.println("----------2.4根据 age 排序,并显示前3个---------");
        Comparator<Person> sortByName  = (p1,p2) -> (p1.getAge()-p2.getAge());
        persons.stream()
                .sorted(sortByName)
                .limit(3)
                .forEach(person -> System.out.printf("%s %s %s; ", person.getName(), person.getSex(),person.getAge()));
        System.out.println();

        System.out.println("----------2.5 获取最大值与最小值---------");
        Comparator<Person> max  = (p1,p2) -> (p1.getAge()-p2.getAge());
        Person person = persons.stream()
                .max(max)
                .get();
        System.out.printf("%s %s %s; ", person.getName(), person.getSex(),person.getAge());
        System.out.println();

        System.out.println("----------2.6 结合 map 方法,我们可以使用 collect 方法来将我们的结果集放到一个字符串,一个 Set 或一个TreeSet中:---------");
        // 2.6.1 name 放到连接成一个字符串
        String str = persons
                .stream()
                .map(Person::getName)
                .collect(Collectors.joining(","));
        System.out.println(str);

        // 2.6.2 name 放到set
        Set<String> set = persons
                .stream()
                .map(Person::getSex)
                .collect(toSet());
        set.forEach(System.out::println);

        //2.6.3 name 放到TreeSet
        TreeSet<String> treeSet = persons
                .stream()
                .map(Person::getSex)
                .collect(toCollection(TreeSet::new));
        treeSet.forEach(System.out::println);

        System.out.println("----------2.7:将对象的两个属性转为Map---------");
        Map<String, Integer> personsMap = persons.stream()
                .collect(toMap(Person::getName, Person::getAge));
        personsMap.forEach((key,value)->System.out.printf("%s %s;",key,value));
        personsMap.forEach((key,value)-> new StringBuilder().append(key).append(value));
        System.out.println();

        System.out.println("----------2.8:计算总的年龄---------");
        int sum = persons.parallelStream()
                .mapToInt(Person::getAge)
                .sum();
        System.out.println(sum);

        System.out.println("----------2.9:我们可以使用summaryStatistics方法获得stream 中元素的各种汇总数据:getMax, getMin, getSum---------");
        IntSummaryStatistics numbers  = persons.stream()
                .mapToInt(Person::getAge)
                .summaryStatistics();
        System.out.println("打印集合中 人物年龄最大值："+numbers .getMax());
        System.out.println("打印集合中 人物年龄最小值："+numbers .getMin());
        System.out.println("打印集合中 人物年龄总和："+numbers .getSum());
        System.out.println("打印集合中 人物年龄平均值："+numbers .getAverage());
    }
}
