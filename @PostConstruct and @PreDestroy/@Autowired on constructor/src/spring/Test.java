package spring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

      public static void main(String[] args) {
          ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
          Employee emp = (Employee)context.getBean("emp");
          emp.show();
    }

}