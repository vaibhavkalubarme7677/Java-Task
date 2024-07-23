package Task_25_4;

public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//85 to 100 A, 70 to 84 B, 55 to 69 C, 35 to 54 D, 34 to 1 Fail
		
		int g=35;
		
		if(g<=100 && g>=85)
		{
			System.out.println("A Grade");
		}
		else if(g<=84 && g>=70)
		{
			System.out.println("B Grade");
		}
		else if(g<=69 && g>=55)
		{
			System.out.println("C Grade");
		}
		else if(g<=54 && g>=35)
		{
			System.out.println("D Grade");
		}
        else if(g<=34 && g>=1)
		{
			System.out.println("Fail");
		}
		else 
		{
			System.out.println("Invalid Input");
		}
		
	}
}