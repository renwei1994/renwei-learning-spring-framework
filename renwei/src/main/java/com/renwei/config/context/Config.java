package com.renwei.config.context;

import com.renwei.entity.ZhongJun;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.config.context
 * @Author: renwei
 * @CreateTime: 2024-03-29  10:34
 * @Description: TODO
 * @Version: 1.0
 */
@Configuration
public class Config {
	@Bean(initMethod = "init")
	public ZhongJun zhongJun() {
		return new ZhongJun();
	}
}
