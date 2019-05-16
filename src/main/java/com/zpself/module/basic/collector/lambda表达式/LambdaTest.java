package com.zpself.module.basic.collector.lambda表达式;

import com.zpself.module.basic.collector.instance.Fly;
import com.zpself.module.basic.collector.util.Person;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;

/**
 * @author zengpeng
 * @date 2019/5/16
 */
public class LambdaTest {
    public static void main(String[] args) {
        //1.基本语法：遍历
        //baseGrammar();
        //2.匿名内部类
        //innerClass();

        //2.1匿名内部类:线程 Thread
        //innerClassThread();

        //2.匿名内部类:实现的方法有参数
        innerClassComparator();
    }

    /**
     * 2.1匿名内部类
     * Anonymous Inner Class
     */
    private static void innerClass() {
        // 1.使用匿名内部类
        Fly swan = new Fly() {
            @Override
            public void fly() {
                System.out.println("这是天鹅的飞舞！");
            }

        };
        swan.fly();

        //2.使用lambda ==貌似只支持接口剩下一个接口未实现
        Fly duck = () -> System.out.println("这是鸭子的飞舞！");
        duck.fly();
    }
    /**
     * 2.1匿名内部类：线程 Thread
     * Anonymous Inner Class
     */
    private static void innerClassThread() {
        // 1.使用匿名内部类
        Thread swan = new Thread() {
            @Override
            public void run() {
                System.out.println("这是天鹅的飞舞！");
            }
        };
        swan.start();

        //2.使用lambda ==貌似只支持接口
        Thread duck = new Thread(() -> System.out.println("这是鸭子的飞舞！"));
        duck.start();
    }
    /**
     * 2.1匿名内部类：实现的方法有参数
     * Anonymous Inner Class
     */
    private static void innerClassComparator() {
        // 1.使用匿名内部类
        Comparator swan = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };

        //2.使用lambda ==貌似只支持接口
        Comparator<String> sortByName  = (String s1,String s2) -> (s1.compareTo(s2));
    }
    /**
     * 1.基本语法：遍历
     */
    private static void baseGrammar() {
        List<Person> persons = Arrays.asList(new Person("狙击手", "猎人"),
                new Person("飞行员", "远程支援"));
        //1.for循环
        for (Person person : persons) {
            System.out.println(person.getName());
        }
        //2.lambda
        persons.forEach(
                (person) -> System.out.println(person.getName())
        );
        //3.java 8 中使用双冒号操作符(double colon operator)
        List<String> strs = Arrays.asList("1","2");
        strs.forEach(System.out::println);
    }
}
