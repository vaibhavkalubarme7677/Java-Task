package Test_26_04_2024;
//2.what is the conditional statements and how many are there and explain it with all examples 20marks
public class Conditional_Statments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		    //1. If Statement:
			//An if statement executes a block of code if a specified condition is true.
			int x = 10;
			if (x > 5) {
			 System.out.println("x is greater than 5");
			}
			
			
			//2. If-Else Statement:
			//An if-else statement executes one block of code if the condition is true and another block if the condition is false.
			int s = 3;
			if (s > 5) {
			 System.out.println("s is greater than 5");
			} else {
			 System.out.println("s is not greater than 5");
			}
			
			//3. Else-If Statement:
			//An else-if statement is used to specify multiple conditions. It checks for additional conditions if the preceding 
			//conditions are false.
			int r = 3;
			if (r > 5) {
			 System.out.println("r is greater than 5");
			} else if (r == 5) {
			 System.out.println("r is equal to 5");
			} else {
			 System.out.println("r is less than 5");
			}
			
			
			//4. Nested If Statements:
			//Nested if statements are if statements within other if or else blocks. They allow for more complex conditional logic.
			int a = 10;
			if (a > 5) {
			 System.out.println("a is greater than 5");
			 if (a == 10) {
			 System.out.println("a is equal to 10");
			 }
			} 
			else {
			 System.out.println("a is not greater than 5");
			}
			}
		
			
}	

		
	


