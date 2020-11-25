package com.transfer.tx.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Role;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.AnnotationTransactionAttributeSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.interceptor.TransactionAttributeSource;

import javax.sql.DataSource;

/**
 * @author lizheng
 * @date: 23:36 2019/01/05
 * @Description: ConfigTx
 */
@Configuration
//@EnableAspectJAutoProxy(exposeProxy = true)
@EnableTransactionManagement
@ComponentScan(basePackages = {"com.transfer.tx"})
@MapperScan(basePackages = "com.transfer.tx.mapper")
public class ConfigTx {
    @Bean
    DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUsername("root");
        dataSource.setPassword("ityewm##$t458DW");
        dataSource.setUrl("jdbc:mysql://125.45.191.51:9032/sharp_sword");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return  dataSource;
    }

    @Bean
	PlatformTransactionManager transactionManager() {
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(dataSource());
        return transactionManager;
    }

    @Bean
	JdbcTemplate jdbcTemplate() {
        return new JdbcTemplate(dataSource());
    }

    @Bean
    SqlSessionFactory sqlSessionFactoryBean() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
		ClassPathResource resource = new ClassPathResource("mybatis-config.xml");
		sqlSessionFactoryBean.setConfigLocation(new InputStreamResource(resource.getInputStream()));
        return sqlSessionFactoryBean.getObject();
    }

    // 测试事务publicMethodsOnly
	@Bean("transactionAttributeSource")
	@Role(BeanDefinition.ROLE_INFRASTRUCTURE)
	public TransactionAttributeSource transactionAttributeSource() {
		return new AnnotationTransactionAttributeSource(false);
	}

}
