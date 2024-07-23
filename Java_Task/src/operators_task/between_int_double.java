package operators_task;

public class between_int_double {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int    a= 20;
		double b= 10.50;
		
		System.out.println("Arthimetic Operators---------------");
		System.out.println("Addition a+b= "+(a+b));
		System.out.println("Substraction a-b= "+(a-b));
		System.out.println("Multiplaction a*b= "+(a*b));
		System.out.println("division a/b= "+(a/b));
		System.out.println("Reminder a%b= "+(a%b));
		
		System.out.println("Relational Operators---------------");
		System.out.println(a+ " < "+b+" = "+(a<b));
		System.out.println(a+ " > "+b+" = "+(a>b));
		System.out.println(a+ " <= "+b+" = "+(a<=b));
		System.out.println(a+ " >= "+b+" = "+(a>=b));
		System.out.println(a+ " == "+b+" = "+(a==b));
		System.out.println(a+ " != "+b+" = "+(a!=b));
		
		System.out.println("Logical Operators---------------");
		System.out.println((a>b)&&(a<b));
		System.out.println((a>b)||(a<b));
		System.out.println((a>b)!=(a<b));
		
		System.out.println("Increment/Decrement Operators---------------");
		a++;
		System.out.println("Value of a= "+a);
		a--;
		System.out.println("Value of a= "+a);
		b+=2;
		System.out.println("Value of b= "+b);
		b-=2;
		System.out.println("Value of b= "+b);
		
	}

}
