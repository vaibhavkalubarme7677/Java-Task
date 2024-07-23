package Class_25_4;

public class Nested_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int m= 95;
		 if (m>=85 && m<=100)
		 {
			 System.out.println("A Grade");
			 if (m>=95 && m<=100)
			 {
				 System.out.println("1st Rank");
			 }
			 else if (m>=90 && m<=94)
			 {
				 System.out.println("2nd Rank");
			 }
			 else 
			 {
				 System.out.println("3rd Rank");
			 }
		 }
		 else 
		 {
			 System.out.println("Mark is not between 85 to 100.");
		 }
	}

}
