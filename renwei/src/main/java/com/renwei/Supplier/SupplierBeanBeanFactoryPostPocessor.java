package com.renwei.Supplier;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.Supplier
 * @Author: renwei
 * @CreateTime: 2024-04-16  15:10
 * @Description: TODO
 * @Version: 1.0
 */
@Component
public class SupplierBeanBeanFactoryPostPocessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		AbstractBeanDefinition supplierBean =
				(AbstractBeanDefinition) beanFactory.getBeanDefinition("supplierBean");
		supplierBean.setInstanceSupplier(SupplierBeanUtil::getSupplierBean);
	}
}
