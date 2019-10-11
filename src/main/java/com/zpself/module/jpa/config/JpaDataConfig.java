package com.zpself.module.jpa.config;

import com.zpself.module.jpa.repository.MyRepositoryFactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;


@Configuration
@EnableJpaRepositories(basePackages = {"com.zpself.module.**.repository"},
                            repositoryFactoryBeanClass = MyRepositoryFactoryBean.class)
@EnableSpringDataWebSupport
public class JpaDataConfig {  
  
}  