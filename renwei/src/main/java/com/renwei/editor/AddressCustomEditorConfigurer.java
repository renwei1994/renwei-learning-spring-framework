package com.renwei.editor;

import com.renwei.entity.Address;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.beans.PropertyEditor;
import java.util.HashMap;
import java.util.Map;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.editor
 * @Author: renwei
 * @CreateTime: 2024-03-07  10:13
 * @Description: TODO
 * @Version: 1.0
 */
@Configuration
public class AddressCustomEditorConfigurer {
	/**
	 * 把注册器交给spring中BeanFactoryPostProcessor
	 *
	 * @param registrar
	 * @return
	 */
	@Bean
	public static CustomEditorConfigurer customEditorConfigurer(PropertyEditorRegistrar registrar) {
		CustomEditorConfigurer configurer = new CustomEditorConfigurer();
		configurer.setPropertyEditorRegistrars(new PropertyEditorRegistrar[]{registrar});
		return configurer;
	}

	/**
	 * 把注册器交给spring中BeanFactoryPostProcessor
	 *
	 * @param registrar
	 * @return
	 */
//	@Bean
//	public static CustomEditorConfigurer customEditorConfigurer() {
//		CustomEditorConfigurer configurer = new CustomEditorConfigurer();
//		Map<Class<?>, Class<? extends PropertyEditor>> hashMap = new HashMap<>();
//		hashMap.put(Address.class, AddressEditor.class);
//		configurer.setCustomEditors(hashMap);
//		return configurer;
//	}

	@Bean
	public PropertyEditorRegistrar addressPropertyEditorRegistrar() {
		return new AddressPropertyEditorRegistrar();
	}


}
