package com.renwei.DeferredImportSelector;

import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * @BelongsProject: spring
 * @BelongsPackage: com.renwei.DeferredImportSelector
 * @Author: renwei
 * @CreateTime: 2024-04-23  10:49
 * @Description: TODO
 * @Version: 1.0
 */
@Component
@Import(MyDeferredImportSelector.class)
public class MyImport {
}
