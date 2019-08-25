package com.zpself.module.annotation.json.jsonIgno;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import java.util.List;

/**
 * @author zengpeng
 * @date 2019/8/23
 */
@Data
public class Teaccher {
    private String name;

    private int age;
    @JsonManagedReference()
    private List<Student> students ;
}
