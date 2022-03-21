package org.hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@Before
	public void before(Scenario sc) {
		String name = sc.getName();
		System.out.println(name);
		System.out.println("Before");
	}
	@After
	public void after(Scenario sc) {
		System.out.println(sc.getStatus());;
		System.out.println("After");
	}

}
