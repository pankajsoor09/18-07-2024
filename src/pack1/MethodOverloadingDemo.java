package pack1;

public class MethodOverloadingDemo {
	
	public void show () {
		System.out.println("show() method in MethodOverloadingDemo");
	}
	
	//public void show () overloading need  method 
    public String show (String msg) {
    	System.out.println("show(string) method in MethodOverloadingDemo");
    	return msg;
    }
    
    public void show(int number) {
    	System.out.println("show(int) method in MethodOverloadingDemo");
    	System.out.println("Number is "+number);
    }
    
    public static void main(String[] args) {
    	MethodOverloadingDemo demo = new MethodOverloadingDemo();
    	String msg = demo.show("Hello");
    	System.out.println("Message is : "+msg);
    	
    	demo.show();
    	demo.show(100);
    }
    
}
