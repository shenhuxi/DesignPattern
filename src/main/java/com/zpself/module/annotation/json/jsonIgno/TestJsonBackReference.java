package com.zpself.module.annotation.json.jsonIgno;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zengpeng
 * @date 2019/8/23
 */
public class TestJsonBackReference {
    public static void main(String[] args) throws IOException {
        List<Student> students = new ArrayList<>();
        Student xh = new Student();
        xh.setName("小红");
        xh.setAge(20);
        Student xm = new Student();
        xm.setName("小明");
        xm.setAge(22);
        students.add(xh);
        students.add(xm);

        Teaccher teaccher = new Teaccher();
        teaccher.setAge(40);
        teaccher.setName("郭老师");
        teaccher.setStudents(students);



        //开始转换
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(teaccher);
        System.out.println(json);

        Teaccher readValue = mapper.readValue(json, Teaccher.class);
        System.out.println(readValue);
    }
}
