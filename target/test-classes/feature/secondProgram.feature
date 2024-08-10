
Feature: Application Login

Background: 

When launch the browser from config variables
And hit the home page url of banking site

@RegressionTest @NetBanking
Scenario: User Page default login

Given User is on NetBanking Landing page
When User Login into application with "user" and password 9876
Then Home page is displayed
And Cards are displayed

@SmokeTest @RegressionTest @Mortgage
Scenario Outline: Mortgage User page default login

Given User is on NetBAnking landing page
When User login into application with "<Username>" and password "<Passowrd>"
Then Home page is displayed
And Cards are displayed

Examples: 
	| Username | Password |
	| debituser| hello12  |
	| credituser| abc123 |