package com.craftsman.reactservice;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.appinfo.MyDataCenterInfo;
import com.netflix.discovery.shared.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.nativex.hint.TypeHint;
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer;
import org.springframework.r2dbc.connection.init.ResourceDatabasePopulator;

import io.r2dbc.spi.ConnectionFactory;
import lombok.extern.slf4j.Slf4j;

@TypeHint(types = InstanceInfo.class, typeNames = "com.netflix.appinfo.InstanceInfo$PortWrapper")
@TypeHint(types = Application.class, typeNames = "com.netflix.discovery.shared.Application")
@TypeHint(types = MyDataCenterInfo.class, typeNames = "com.netflix.appinfo.MyDataCenterInfo")
@Slf4j
@SpringBootApplication
public class ReactServiceApp {

	public static void main(String[] args) {
		SpringApplication.run(ReactServiceApp.class, args);
	}
	
	
    @Bean
    ConnectionFactoryInitializer initializer(ConnectionFactory connectionFactory) {
    	log.info("Initialize connectionFactory");
        ConnectionFactoryInitializer initializer = new ConnectionFactoryInitializer();
        initializer.setConnectionFactory(connectionFactory);
        initializer.setDatabasePopulator(new ResourceDatabasePopulator(new ClassPathResource("./db/schema.sql")));

        return initializer;
    }
}
