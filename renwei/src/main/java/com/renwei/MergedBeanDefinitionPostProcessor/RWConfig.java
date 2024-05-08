package com.renwei.MergedBeanDefinitionPostProcessor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.MergedBeanDefinitionPostProcessor
 * @Author: renwei
 * @CreateTime: 2024-04-22  11:02
 * @Description: TODO
 * @Version: 1.0
 */
@Component
public class RWConfig {
	@Autowired
	RW1 rw1;
	@Resource
	RW2 rw2;
}
