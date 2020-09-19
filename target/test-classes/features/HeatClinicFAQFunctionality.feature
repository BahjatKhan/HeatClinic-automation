Feature:This describe the FAQ functionality for HeatClinic Application
  Description:This explain how a user can able to see more about Content Management in HeatClinic Application

  Background:
    Given user not a validated
    When user browse to the "http://heatclinic.shiftedtech.com/"
    Then homepage window should display on maximize size


  Scenario: 1.User can able to redirect to broadleafcommerce website
    When user can able to click on faq button
    Then user click on click here button
    Then user redirect to broadleafCommerce website
