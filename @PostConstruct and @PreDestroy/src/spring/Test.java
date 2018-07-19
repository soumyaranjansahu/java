package spring;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




	public class Test {




	      public static void main(String[] args) {

	         // AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("Beans.xml");

	                   ConfigurableApplicationContext context =

	            new ClassPathXmlApplicationContext(new String[] {"bean.xml"});

	                

	          HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");

	          

	          System.out.println(helloWorld.getMessage());

	                     //context.registerShutdownHook();

	          context.close();

	         //if we comment above line it will not call destroy() method. 

	    }

	}


