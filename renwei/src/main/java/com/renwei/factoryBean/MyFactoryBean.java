package com.renwei.factoryBean;

import com.renwei.annotate.Normal;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.factoryBean
 * @Author: renwei
 * @CreateTime: 2024-04-02  09:22
 * @Description: TODO
 * @Version: 1.0
 */
@Component
public class MyFactoryBean implements FactoryBean<Normal> {
	@Override
	public Normal getObject() throws Exception {
		return new Normal();
	}

	@Override
	public Class<Normal> getObjectType() {
		return Normal.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}
}
