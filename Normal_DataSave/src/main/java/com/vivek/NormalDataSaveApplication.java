package com.vivek;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vivek.Entity.Boss;
import com.vivek.Repo.BossRepo;

@SpringBootApplication
public class NormalDataSaveApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(NormalDataSaveApplication.class, args);
		BossRepo bean = context.getBean(BossRepo.class);
		Boss b=new Boss();
		b.setBId(1);
		b.setBName("vivek");
		bean.save(b);
		
	}
	

}
