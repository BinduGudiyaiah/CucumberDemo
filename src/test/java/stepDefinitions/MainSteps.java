package stepDefinitions;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {

	@Given("User is on Orange HRMs page")
	public void user_is_On_ORange_HRMs_Page() {
		
		System.out.println("User landed on Orange HRMs Login page");
		
	}

	@When("User Login into Orange HRMs application")
	public void user_is_on_Login_Page() {
		
		System.out.println("User Logged in successfully");
		
	}

	@Then("Home page is displayed")
	public void verify_Login() {
		
		System.out.println("Home page is displayed");
		
	}

	// {string} -- this is only for String
	// (.+) -- this is called Regex pattern. This will accept any kind of data like
	// int, double, String etc
	// Regex -- Regular expression if we are passing any Regex then we need to start
	// with ^ and end with $ "^$". With in double quotes
	@When("^User Login into Orange HRMs application with (.+) and password (.+)$")
	public void user_login_into_orange_hr_ms_application_with_and_password(String username, String password) {

		System.out.println(username + "User name and Password is" + password);

	}

	@Then("UserName displayed in Home Page")
	public void user_name_displayed_in_home_page() {

	}

	@Given("User is on Practice landing page")
	public void user_is_on_practice_landing_page() {

	}

	@When("User Signup into application")
	public void user_signup_into_application(List<String> data) {
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
	}

	@Then("Cards are displayed")
	public void cards_are_displayed() {
		System.out.println("Cards are displayed");
	    
	}
	
	@Then("Home Page is displayed")
	public void home_page_is_displayed() {
	    System.out.println("Home Page is displayed");
	}
	
	@When("launch the browser from config variables")
	public void launch_the_browser_from_config_variables() {
	    System.out.println("launch the browser from config variables");
	}
	@When("hit the home page url of banking site")
	public void hit_the_home_page_url_of_banking_site() {
	    System.out.println("hit the home page url of banking site");
	}
	@Given("User is on NetBAnking landing page")
	public void user_is_on_net_b_anking_landing_page() {
	 System.out.println("User is on NetBAnking landing page");   
	}
	@When("User login into application with {string} and password {string}")
	public void user_login_into_application_with_and_password(String username, String password) {
		System.out.println(username + "User name and Password is" + password);
	}
	
	@Given("User is on NetBanking Landing page")
	public void user_is_on_net_banking_landing_page() {
	    System.out.println("User is on NetBanking Landing page");
	}
	@When("User Login into application with {string} and password {int}")
	public void user_login_into_application_with_and_password(String string, Integer int1) {
	    System.out.println("User Login into application with"+ string + "and" + int1 +"Password");
	    	
	}
	
}
