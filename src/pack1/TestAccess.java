package pack1;

import mypack.AccessDemo;

public class TestAccess extends AccessDemo {  // print in accessed in test access but it become private.so needed to make test/child object  
	
	public static void main(String[] args) {
		
		AccessDemo demo = new AccessDemo();// to use need to import package. and package should be first line
		
		//demo.show();
	    //demo.display ();
	    //demo.print(); need inheritance to access protected 
		
	    demo.myMethod();
	    
	    TestAccess test = new TestAccess();
	    test.print();
	    		
	}

}
