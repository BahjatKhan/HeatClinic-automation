Feature:This describe the Search functionality for HeatClinic Application
  Description:This explain how a user can able to Search on HeatClinic Application

  Background:
    Given user not a validated
    When user browse to the "http://heatclinic.shiftedtech.com/"
    Then homepage window should display on maximize size
    When user type on search box

#  Scenario:1.Search results displayed should be relevant to search keyword
#    When user search