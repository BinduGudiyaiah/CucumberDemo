
Feature: Application Login
#
#Scenario: Login Page
#
    #Given User is on Orange HRMs page
    #When User Login into Orange HRMs application with "admin" and password "admin123"
    #Then Home page is displayed
    
#Reusable
@SmokeTest
Scenario: UserName displayed in Home Page 

		Given User is on Orange HRMs page
    When User Login into Orange HRMs application with "admin" and password "admin123"
    Then Home page is displayed
    And UserName displayed in Home Page

#Parameterization Here we are passing parameters in <>
#To use multiple values We need to give them in Scenario outline and mention them within Examples with delimiter
 Scenario Outline: User Page Default login
 		Given User is on Orange HRMs page
    When User Login into Orange HRMs application with <Username> and password "<Password>" 
    Then Home page is displayed
    And UserName displayed in Home Page
 Examples: 
 | Username | Password |
 | admin1   | admin123 |
 | admin2   | admin12  |
 
 @RegressionTest
 Scenario: User Page Signup
 Given User is on Practice landing page
 When User Signup into application
 | rahul |
 | shetty |
 | b@gmail.com |
 |9483259534 |
 Then Home Page is displayed
 And Cards are displayed