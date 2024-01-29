package steps;

public class Test {
	
	String firstname;
	String lastname;
	
	
	public  void setName(String fn , String ln)
	{
		System.out.println(fn+" "+ln);
		
		firstname = fn;
		lastname = ln;
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		
		t.setName("Jacob", "Lawson");
		
		
	}

}
