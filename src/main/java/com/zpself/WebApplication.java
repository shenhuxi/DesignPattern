package com.zpself;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpRequest;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zengpeng
 * on 2019/3/28
 */
@SpringBootApplication
@RestController
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
    /**
     * 上传
     */
    @GetMapping("/upload")
    public String upload(ServerHttpRequest request){
        ServerHttpRequest request2 = request.mutate().header("ssa", "sds").build();
        return "upload";
    }
    /**
     * 下载
     */
    @GetMapping("/download")
    public String download(){
        return "download";
    }

}
