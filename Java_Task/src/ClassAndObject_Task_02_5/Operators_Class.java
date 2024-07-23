package ClassAndObject_Task_02_5;

public class Operators_Class {

	int a= 20;
	int b= 40;
	
	void op1()
	{
		System.out.println("============Arthimetic Operators============");
		System.out.println("Addition a+b= "+(a+b));
		System.out.println("Substraction a-b= "+(a-b));
		System.out.println("Multiplaction a*b= "+(a*b));
		System.out.println("division a/b= "+(a/b));
		System.out.println("Reminder a%b= "+(a%b));
	}
	void op2()
	{
		System.out.println("============Relational Operators============");
		System.out.println(a+ " < "+b+" = "+(a<b));
		System.out.println(a+ " > "+b+" = "+(a>b));
		System.out.println(a+ " <= "+b+" = "+(a<=b));
		System.out.println(a+ " >= "+b+" = "+(a>=b));
		System.out.println(a+ " == "+b+" = "+(a==b));
		System.out.println(a+ " != "+b+" = "+(a!=b));
	}
	void op3()
	{
		System.out.println("============Logical Operators============");
		System.out.println((a>b)&&(a<b));
		System.out.println((a>b)||(a<b));
		System.out.println((a>b)!=(a<b));	
	}
	void op4()
	{
		System.out.println("============Increment/Decrement Operators============");
		a++;
		System.out.println("Value of a= "+a);
		a--;
		System.out.println("Value of a= "+a);
	}
}
