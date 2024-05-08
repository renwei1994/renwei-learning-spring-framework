package com.renwei.Supplier;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.Supplier
 * @Author: renwei
 * @CreateTime: 2024-04-16  15:12
 * @Description: TODO
 * @Version: 1.0
 */
public class SupplierBeanUtil {
	public static SupplierBean getSupplierBean(){
		SupplierBean supplierBean = new SupplierBean();
		supplierBean.setName("renwei");
		return supplierBean;
	}
}
