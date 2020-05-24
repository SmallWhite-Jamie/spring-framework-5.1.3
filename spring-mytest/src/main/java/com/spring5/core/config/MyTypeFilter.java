package com.spring5.core.config;

import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author lizheng
 * @date: 23:17 2018/12/16
 * @Description: MyTypeFilter
 */
public class MyTypeFilter implements TypeFilter {
	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
		AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
//		System.out.println(annotationMetadata);
		ClassMetadata classMetadata = metadataReader.getClassMetadata();
		System.out.println("------>" + classMetadata.getClassName());
//		Resource resource = metadataReader.getResource();
		if (classMetadata.getClassName().contains("D")) {
			return true;
		}
		return false;
	}
}
