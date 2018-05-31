package io.selva.Higginbothams.Higginbothams;

import io.selva.Higginbothams.Higginbothams.Controller.HigginsController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = HigginsController.class)
//@ComponentScan(basePackages = "io.selva.higginbathams.*")
public class HigginbothamsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HigginbothamsApplication.class, args);
	}
}
