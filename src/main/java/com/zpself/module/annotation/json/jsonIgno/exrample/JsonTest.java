package com.zpself.module.annotation.json.jsonIgno.exrample;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;


public class JsonTest {  
    static TreeNode node;
  
    @BeforeClass
    public static void setUp() {  
        TreeNode node1 = new TreeNode("node1");  
        TreeNode node2 = new TreeNode("node2");  
        TreeNode node3 = new TreeNode("node3");  
        TreeNode node4 = new TreeNode("node4");  
        TreeNode node5 = new TreeNode("node5");  
        TreeNode node6 = new TreeNode("node6");  
  
        node1.addChild(node2);  
        node2.setParent(node1);  
        node2.addChild(node3);  
        node3.setParent(node2);  
        node2.addChild(node4);  
        node4.setParent(node2);  
        node3.addChild(node5);  
        node5.setParent(node3);  
        node5.addChild(node6);  
        node6.setParent(node5);  
  
        node = node3;  
    }  
  
    @Test
    public void test() throws JsonGenerationException, JsonMappingException, IOException {
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(node);  
        System.out.println(json);

        TreeNode readValue = mapper.readValue(json, TreeNode.class);  
        System.out.println(readValue.name);
        System.out.println(readValue);
    }
  
    @AfterClass
    public static void tearDown() {  
        node = null;  
    }  
}  
