package com.spring5.core.config;

import com.spring5.core.bean.Stu;
import com.spring5.core.importselector.MyDeferredImportSelector;
import com.spring5.core.importselector.MyImportSelector;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;

/**
 * @author lizheng
 * @date: 1:25 2018/12/16
 * @Description: TestConfig
 */
@Configuration
@ComponentScan(value = "com.spring5.core", excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class),
		@ComponentScan.Filter(type = FilterType.CUSTOM, classes = MyTypeFilter.class)
})
@Import({MyImportBeanDefinitionRegistrar.class, MyImportSelector.class, MyDeferredImportSelector.class})
public class TestConfig extends AConfig {

//	@Scope("prototype")
//	@Lazy


	static class D {
		public D() {
			System.out.println("DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDS----------------------------------------------------");
		}
	}

	static class Inner {

		static class InnerInner {
			@Bean()
			public D d() {
				return new D();
			}
		}

//		@Bean()
//		public D d() {
//			return new D();
//		}
	}
	//

	@Conditional(StuCondition.class)
	@Bean()
	public Stu stu1() {
		Stu stu= new Stu();
		stu.setName("wu");
		stu.setSex("女");
		return stu;
	}

	@Bean()
	public MyFactoryBean myFactoryBean () {
		return new MyFactoryBean();
	}

}
