package mypack;

public class Calculator {
	
	public void add(int num1,int num2) {
		
		System.out.println("Addition of "+num1+" and "+num2+"is : "+(num1+num2));
	}
public void add(int num1,int num2,int num3) {
		
		System.out.println("Addition of "+num1+" , "+num2+" and "+num3+"is : "+(num1+num2+num3));
	}

public float add(int num1,float num2) {
	return num1+num2;
}
public float add(float num1,int num2) {
	return num1+num2;
}

public static void main(String[] args) {
	Calculator calculator = new Calculator();
	
	float result=calculator.add(11.9f, 5);
	System.out.println("Addition of 11.9 and 5 is : "+result);
	calculator.add(20, 7);
	result=calculator.add(9, 25.4f);
	System.out.println("Addition of 9 and 25.4 is : "+result);
	calculator.add(9,18,27);
}

}

/*polymorphism 

static -- method overloading = same name different signature..return type doesn't matter...static -- at compile time


dynamic -- method overriding --dynamic at run time
*/
