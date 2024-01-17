package com.in28minutes.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.learnspringframework.game.GameRunner;

@SpringBootApplication
// Automatically does a @componentscan on current package so dont need to include it.
// Can input different package name in () to scan another package. {} is array of the package name so u can scan multiple packages.
//@ComponentScan({"com.in28minutes.learnspringframework", "com.in28minutes.dummy"})
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {

//		Creates Sprint Application Context
//		Will Create an instance of all component
		ConfigurableApplicationContext context = 
				SpringApplication.run(LearnSpringFrameworkApplication.class, args);

		//MarioGame,GameRunner
//		How to get specific bean:
//		Any instance of any component spring creates is called a bean
//		Any Instance created by Spring is a singleton
		GameRunner runner = context.getBean(GameRunner.class);
		
//		Commented Example below is Tightly Coupled
//		Not needed as @Autowired and @Component is already going to create them
//		MarioGame game = new MarioGame();
		//SuperContraGame game = new SuperContraGame();
//		GameRunner runner = new GameRunner(game);
		
		runner.runGame();
		
//		MyWebController controller = context.getBean(MyWebController.class);
//		System.out.println(controller.returnValueFromBusinessService());
	}

}

//Maven download Spring and its dependencys