package inheritance_Task_09_5;

public class HybridObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hychild1 h1=new Hychild1();
		h1.a=50;
		h1.b=60;
		h1.parentdata();
		h1.Addition();
		
		HyChild2 h2=new HyChild2();
		
		h2.a=30;
		h2.b=20;
		h2.parentdata();
		h2.Subtraction();
		
		
		HyGrandChild h3=new HyGrandChild();
		h3.a=60;
		h3.b=2;
		h3.parentdata();
		h3.multiplication();
		
	}

}
