package utilities;

import io.cucumber.java.*;

public class myHooks {
	@Before
	public void setup() {
		System.out.println(" ***Chrome browser is opened***");
	}

	@After
	public void teardown() {
		System.out.println(" ***Chrome browser is closed***");
	}
}