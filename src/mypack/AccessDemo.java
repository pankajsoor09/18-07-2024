package mypack;

public class AccessDemo {
	
	private String msg;
	
	private void show() {
		
		System.out.println("show() with private access");
		System.out.println("message is :"+msg);
	}
void display() {
	System.out.println("display() with default/package access");
}
protected void print () {
	System.out.println("print() with protected access");
}
public void myMethod() {
	System.out.println("myMethod with public access ");
}
	public static void main(String[] args) {
		
		AccessDemo demo = new AccessDemo();
		demo.show();
		demo.display();
		demo.print();
		demo.myMethod();
	}
}