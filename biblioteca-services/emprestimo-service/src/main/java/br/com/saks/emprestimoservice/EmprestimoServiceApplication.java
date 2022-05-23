package br.com.saks.emprestimoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EmprestimoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmprestimoServiceApplication.class, args);
	}
        
}
