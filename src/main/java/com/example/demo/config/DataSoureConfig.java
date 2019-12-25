package com.example.demo.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;

@Configuration
@MapperScan(basePackages = "com.example.demo.mapper", sqlSessionFactoryRef = "masterSqlSessionFactory")
public class DataSoureConfig {

	@Primary
	@Bean(name = "masterDataSource") 
	@ConfigurationProperties("spring.datasource.druid.mysql")
	public DataSource dataSource() {
		return DruidDataSourceBuilder.create().build();
	}

	@Primary
	@Bean(name = "masterTransactionManager")
	public DataSourceTransactionManager TransactionManager(@Qualifier("masterDataSource") DataSource DataSource) {
		return new DataSourceTransactionManager(DataSource);
	}

	@Primary
	@Bean(name = "masterSqlSessionFactory")
	public SqlSessionFactory SqlSessionFactory(@Qualifier("masterDataSource") DataSource DataSource) throws Exception {
		final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(DataSource);
		return sessionFactory.getObject();
	}
}