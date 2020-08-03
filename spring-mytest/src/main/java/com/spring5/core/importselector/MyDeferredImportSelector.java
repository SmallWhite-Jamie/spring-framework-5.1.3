package com.spring5.core.importselector;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * MyDeferredImportSelector
 *
 * @author lizheng 日撸代码三千行，不识加班累，只缘bug狂。
 * @version 1.0
 * @date 2020/8/3 15:40
 */
public class MyDeferredImportSelector implements DeferredImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		System.out.println("selectImports");
		return new String[0];
	}

	@Override
	public Class<? extends Group> getImportGroup() {
		System.out.println("getImportGroup");
		return null;
	}
}
