package accessB;

import accessA.AccessClassAA;

public class AccessClassBB extends AccessClassAA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 System.out.println("=======Variables=======");
		    AccessClassBB obj = new AccessClassBB();
	    	System.out.println(obj.publicint);
	 //   	System.out.println(obj.privateint);
	    	System.out.println(obj.protectedint);
	//    	System.out.println(obj.defaultint);
	    	System.out.println("=======Methods=======");
	    	obj.PublicMethod();
	//    	obj.PrivateMethod();
	    	obj.ProtectedMethod();
	//    	obj.DefaultMethod();
		
	}

}
/* Private   - Within same class only
   Public    - Everywhere
   Defalut   - Within package
   Protected - within package and outside package only through inhetitance
*/