package com.zpself.module.IOC.统一资源Resource.resource;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import java.io.IOException;

/**
 * @author zengpeng
 * @date 2019/9/5
 */
public class ResourcePatternResolver_Test {
    public static void main(String[] args) throws IOException {
        ResourceLoader a =new PathMatchingResourcePatternResolver();
        ((PathMatchingResourcePatternResolver) a).getResources("");
    }
}
