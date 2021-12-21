package com.singleton;

public class TestLogger {
	   public static void main(String[] args) {
	  System.out.println("-------singleton----------");
      //Logger obj1= new Logger();
      // Logger obj2= new Logger();
	// it will create only on object in first call then it will pass the same objec becaause logger != null
	  Logger obj1 = Logger.getInstance();
	  Logger obj2 = Logger.getInstance();
	  //it the same object
	    System.out.println("Hash code of obj1: "+obj1.hashCode());
	    System.out.println("Hash code of obj2: "+obj2.hashCode());
	 
	   System.out.println("-------non singleton----------");
       TestLogger obj3 = new TestLogger();
       TestLogger obj4 = new TestLogger();
       System.out.println("Hash code of obj3: "+obj3.hashCode());
	    System.out.println("Hash code of obj4: "+obj4.hashCode());
	   }
}