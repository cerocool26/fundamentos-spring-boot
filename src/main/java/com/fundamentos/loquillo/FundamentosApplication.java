package com.fundamentos.loquillo;

import com.fundamentos.loquillo.bean.Mybean;
import com.fundamentos.loquillo.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private ComponentDependency componentDependency;

	private Mybean mybean;

	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, Mybean mybean){
		this.componentDependency = componentDependency;
		this.mybean = mybean;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
		mybean.print();
	}
}
