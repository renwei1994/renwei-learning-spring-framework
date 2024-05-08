package com.renwei.entity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.entity
 * @Author: renwei
 * @CreateTime: 2024-03-29  10:33
 * @Description: TODO
 * @Version: 1.0
 */

public class ZhongJun implements InitializingBean {
	private GongZi gongZi;

	public ZhongJun() {
		System.err.println(" this is ZhongJun constructor");
	}

	@Autowired
	public void setGongZi(GongZi gongZi) {
		this.gongZi = gongZi;
		System.err.println(" this is ZhongJun setGongZi");
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.err.println(" this is ZhongJun afterPropertiesSet");
	}

	public void init() {
		System.err.println(" this is ZhongJun init");
	}
}
