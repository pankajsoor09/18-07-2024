package mypack;

public class AccessTest {
	
	public static void main(String[] args) {
		
		AccessDemo demo = new AccessDemo();
		//demo.show();      cannot be because of private
		demo.display();
		demo.print();
		demo.myMethod();
	}

}

