package com.renwei.DeferredImportSelector;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.function.Predicate;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.DeferredImportSelector
 * @Author: renwei
 * @CreateTime: 2024-04-23  10:45
 * @Description: TODO
 * @Version: 1.0
 */
public class MyDeferredImportSelector implements DeferredImportSelector {

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{"com.renwei.DeferredImportSelector.ImportEntity"};
	}

	@Override
	public Predicate<String> getExclusionFilter() {
		return DeferredImportSelector.super.getExclusionFilter();
	}
}
