package com.craftsman.restservice;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.appinfo.MyDataCenterInfo;
import com.netflix.discovery.shared.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.nativex.hint.TypeHint;

@TypeHint(types = InstanceInfo.class, typeNames = "com.netflix.appinfo.InstanceInfo$PortWrapper")
@TypeHint(types = Application.class, typeNames = "com.netflix.discovery.shared.Application")
@TypeHint(types = MyDataCenterInfo.class, typeNames = "com.netflix.appinfo.MyDataCenterInfo")
@SpringBootApplication
public class RestServiceApp {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApp.class, args);
	}
}
