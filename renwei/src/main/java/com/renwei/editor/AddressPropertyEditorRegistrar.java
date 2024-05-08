package com.renwei.editor;

import com.renwei.entity.Address;
import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.editor
 * @Author: renwei
 * @CreateTime: 2024-03-07  10:07
 * @Description: TODO
 * @Version: 1.0
 */
@Component
public class AddressPropertyEditorRegistrar implements PropertyEditorRegistrar {
	/**
	 * 把编辑器通过注册器注册到注册表中
	 *
	 * @param registry the {@code PropertyEditorRegistry} to register the
	 *                 custom {@code PropertyEditors} with
	 */
	@Override
	public void registerCustomEditors(PropertyEditorRegistry registry) {
		registry.registerCustomEditor(Address.class, new AddressEditor());
	}
}
