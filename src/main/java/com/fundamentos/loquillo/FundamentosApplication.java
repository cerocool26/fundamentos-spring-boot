package com.fundamentos.loquillo;

import com.fundamentos.loquillo.bean.MyBeanWithProperties;
import com.fundamentos.loquillo.bean.Mybean;
import com.fundamentos.loquillo.component.ComponentDependency;
import com.fundamentos.loquillo.pojo.UserPojo;
import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosApplication implements CommandLineRunner {

	private final Log LOGGER = LogFactory.getLog(FundamentosApplication.class);

	private ComponentDependency componentDependency;

	private Mybean mybean;


	private MyBeanWithProperties myBeanWithProperties;

	private UserPojo userPojo;

	public FundamentosApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency, Mybean mybean, MyBeanWithProperties myBeanWithProperties, UserPojo userpojo){
		this.componentDependency = componentDependency;
		this.mybean = mybean;
		this.myBeanWithProperties = myBeanWithProperties;
		this.userPojo = userpojo;
	}

	public static void main(String[] args) {
		SpringApplication.run(FundamentosApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
		mybean.print();
		System.out.println(myBeanWithProperties.function());
		System.out.println(userPojo.getEmail() + "-" + userPojo.getPassword());
		LOGGER.error("Esto es un error del aplicativo");

	}
}
