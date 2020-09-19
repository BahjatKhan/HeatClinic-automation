Feature:This describe the Login functionality for HeatClinic Application
  Description:This explain how a user can able to Login on HeatClinic Application
  Background:
    Given user not a validated
    When user browse to the "http://heatclinic.shiftedtech.com/"
    Then homepage window should display on maximize size
    Then user can able to click login button
    And login page should display
    Then user can able to view Already a member message


  Scenario:1.User can able to login with valid email with valid password
    Then user can enter valid email address on "LoginPage.Email_TextBox"
    And user can enter invalid email address on "LoginPage.Password_TextBox"
    And user can click on "LoginPage_"