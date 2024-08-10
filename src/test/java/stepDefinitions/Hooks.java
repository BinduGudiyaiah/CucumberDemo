package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	/*
	 * 
	 * Test runner 1st checks for @Before
	 * then checks for the Background in every feature file
	 * then it will go for the scenario execution
	 * then it will check for @After this executes after each scenario
	 */
	public class hooks {

	//In hooks if you have one @Before method this will blindly execute before each and every scenario in all the feature files.
	//We can change the execution as per our requirement. We can provide the required tags and the scenarios which have those tags only those scenarios are executed.
		@Before("@NetBanking")
		public void newBankingSetup() {
			System.out.println("-------------");
			System.out.println("setup the enteries in Netbanking Database ");
		}
		
		@Before("@Mortgage")
		public void mortgageSetup() {
			System.out.println("setup the enteries in Mortgage Database ");
		}
		
		@After
		public void tearDown() {
			System.out.println("clear the enteries");
		}
		
	}

}
