package accessA;

public class AccessClassAA {

    public int publicint = 45;
	private int privateint = 567;
	protected int protectedint = 345;
    int defaultint = 2345;   //default 
	
	
     	public void PublicMethod()
    	{
    		System.out.println("Public Method");
    	}
    	
    	private void PrivateMethod()
    	{
    		System.out.println("Private Method");
    	}
    	
    	protected void ProtectedMethod()
    	{
    		System.out.println("Protected Method");
    	}
    	
    	void DefaultMethod()
    	{
    		System.out.println("Default Method");
    	}
 
      
        public static void main(String[] args) {
        // TODO Auto-generated method stub 
    
        System.out.println("=======Variables=======");
        AccessClassAA obj = new AccessClassAA();
    	System.out.println(obj.publicint);
    	System.out.println(obj.privateint);
    	System.out.println(obj.protectedint);
    	System.out.println(obj.defaultint);
    	System.out.println("=======Methods=======");
    	obj.PublicMethod();
    	obj.PrivateMethod();
    	obj.ProtectedMethod();
    	obj.DefaultMethod();
    		
       }
}

	
	

