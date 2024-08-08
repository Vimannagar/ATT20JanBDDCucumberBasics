package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class AppHooks {
//		
//	@After(order = 1)
//	public void afterHook1()
//	{
//		System.out.println("After hook1 is executing ");
//	}
//
//	@After(order = -2)
//	public void afterHook2()
//	{
//		System.out.println("After hook2 is executing ");
//	}
//
//	
//	@Before(order = 1)
//	public void beforeHook1()
//	{
//		System.out.println("Before hook1 is executing");
//	}
//	
//	
//	@Before(order = 0)
//	public void beforeHook2()
//	{
//		System.out.println("Before hook2 is executing");
//	}
//	
//	
//	@BeforeStep(order = 0)
//	public void beforeStep1()
//	{
//		System.out.println("Before Step1 is executing");
//	}
//	
//	@BeforeStep(order = 1)
//	public void beforeStep2()
//	{
//		System.out.println("Before Step2 is executing");
//	}
//	
//	@AfterStep
//	public void afterStep()
//	{
//		System.out.println("After Step is executing");
//	}
	
	@BeforeAll(order = 1)
	public static void beforeAllHook1()
	{
		System.out.println("Before all hook1");
	}
	
	@BeforeAll(order = 2)
	public static void beforeAllHook2()
	{
		System.out.println("Before all hook2");
	}
	
	@AfterAll
	public static void afterAllHook()
	{
		System.out.println("After all hook");
	}
	
	
	@Before("@sanity")
	public void beforeHook()
	{
		System.out.println("Before hook ");
	}
	
	@After("@regression")
	public void afterHook()
	{
		System.out.println("After hook");
		
	}
	
	
}
