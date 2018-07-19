package spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorld {
 private String message;
 @PostConstruct 
 public void init(){    

	        System.out.println("Init Method");

	    }




	    public String getMessage() {

	        return message;

	    }




	    public void setMessage(String message) {

	        this.message = message;

	    }

	    @PreDestroy

	    public void destroy(){

	        System.out.println("destroy Method");

	    }

	}

