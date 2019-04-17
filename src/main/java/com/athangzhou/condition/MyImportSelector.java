package com.athangzhou.condition;

import java.util.Set;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector{

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		// TODO Auto-generated method stub
	     Set<String> s = importingClassMetadata.getAnnotationTypes();
		return new String[] {"com.athangzhou.bean.Red"};
	}

}
