package br.com.saks.emprestimoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EmprestimoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmprestimoServiceApplication.class, args);
	}

}
