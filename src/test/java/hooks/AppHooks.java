package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHooks {
		
	@After
	public void afterHook()
	{
		System.out.println("After hook is executing ");
	}

	
	@Before
	public void beforeHook()
	{
		System.out.println("Before hook is executing");
	}
}
