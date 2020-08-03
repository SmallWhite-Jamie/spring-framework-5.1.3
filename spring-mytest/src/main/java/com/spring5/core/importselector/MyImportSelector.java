package com.spring5.core.importselector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * MyImportSelector
 *
 * @author lizheng 日撸代码三千行，不识加班累，只缘bug狂。
 * @version 1.0
 * @date 2020/8/3 15:39
 */
public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		System.out.println("MyImportSelector selectImports");
		return new String[0];
	}
}
