package com.renwei.editor;

import com.renwei.entity.Address;

import java.beans.PropertyEditorSupport;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.editor
 * @Author: renwei
 * @CreateTime: 2024-03-07  10:02
 * @Description: TODO
 * @Version: 1.0
 */
public class AddressEditor extends PropertyEditorSupport {
	/**
	 * 构建一个转换编辑器 将String转换为Address
	 *
	 * @param text The string to be parsed.
	 * @throws IllegalArgumentException
	 */
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] split = text.split("-");
		Address address = new Address();
		address.setProvince(split[0]);
		address.setCity(split[1]);
		address.setDistrict(split[2]);
		this.setValue(address);
	}
}
