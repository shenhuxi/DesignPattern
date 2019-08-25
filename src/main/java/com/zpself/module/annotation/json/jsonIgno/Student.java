package com.zpself.module.annotation.json.jsonIgno;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

/**
 * @author zengpeng
 * @date 2019/8/23
 */
@Data
public class Student {


    private String name;

    private int age;

    @JsonBackReference()
    private Teaccher teaccher;
}
