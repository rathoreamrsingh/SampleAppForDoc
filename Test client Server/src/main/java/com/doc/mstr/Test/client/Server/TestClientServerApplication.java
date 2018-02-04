package com.doc.mstr.Test.client.Server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
//@EnableZuulProxy
public class TestClientServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestClientServerApplication.class, args);
	}
}
