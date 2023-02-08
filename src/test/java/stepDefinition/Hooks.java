package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before("@RegressionTest")
	public void before_Validation()
	{
		System.out.println("check the browser name");
	}
	@After("@RegressionTest")
	public void after_Validation()
	{
		System.out.println("close the browser");
	}
	@Before("@SmokeTest")
	public void before_ValidationSmoke()
	{
		System.out.println("check the browser name");
	}
	@After("@SmokeTest")
	public void after_ValidationSmoke()
	{
		System.out.println("close the browser");
	}

}
