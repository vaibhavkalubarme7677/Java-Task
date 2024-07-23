package Test_26_04_2024;
//4.what is the operator what are the different types of operator and explain with examples 10 marks
public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a= 20.44;
		double b= 10.96;
		
		System.out.println("Arthimetic Operators");
		System.out.println("Addition a+b= "+(a+b));
		System.out.println("Substraction a-b= "+(a-b));
		System.out.println("Multiplaction a*b= "+(a*b));
		System.out.println("division a/b= "+(a/b));
		System.out.println("Reminder a%b= "+(a%b));
		
		System.out.println("Relational Operators");
		System.out.println(a+ " < "+b+" = "+(a<b));
		System.out.println(a+ " > "+b+" = "+(a>b));
		System.out.println(a+ " <= "+b+" = "+(a<=b));
		System.out.println(a+ " >= "+b+" = "+(a>=b));
		System.out.println(a+ " == "+b+" = "+(a==b));
		System.out.println(a+ " != "+b+" = "+(a!=b));
		
		System.out.println("Logical Operators");
		System.out.println((a>b)&&(a<b));
		System.out.println((a>b)||(a<b));
		System.out.println((a>b)!=(a<b));
		
		System.out.println("Increment/Decrement Operators");
		a++;
		System.out.println("Value of a= "+a);
		a--;
		System.out.println("Value of a= "+a);
	}

}
