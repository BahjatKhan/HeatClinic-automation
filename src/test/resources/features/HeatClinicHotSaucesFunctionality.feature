Feature:This describe the FAQ functionality for HeatClinic Application
  Description:This explain how a user can able to add,view and buy Hot Sauces in HeatClinic Application

  Background:
    Given user not a validated
    When user browse to the "http://heatclinic.shiftedtech.com/"
    Then homepage window should display on maximize size
    When user able to click on "HotSauce.button"
    Then "HotSauce.pageTitle" should display


