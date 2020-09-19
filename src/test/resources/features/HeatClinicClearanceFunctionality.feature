Feature:This describe the Clearance functionality for HeatClinic Application
  Description:This explain how a user can view,add and remove Clearance product.

  Background:
    Given user not a validated
    When user browse to the "http://heatclinic.shiftedtech.com/"
    Then homepage window should display on maximize size
    When user able to click on Clearance button
    Then Clearance page should display
    Then in single page user able to see five products


  Scenario:1.User can click and view price on "Green Ghost" product and navigate back to clearance page
    Then user can able to see Green Ghost product name
    Then user can able to see price tag for Green Ghost product
    When user click on Green Ghost product
    Then Green Ghost product page should display
    Then user can navigate back to previous page

  Scenario:2.User can click and view price on "Blazin' Saddle XXX Hot Habanero Pepper Sauce" product and navigate back to clearance page
    Then user can able to see Blazin'Saddle XXX Hot Habanero Pepper Sauce product name
    Then user can able to see price tag Blazin'Saddle XXX Hot Habanero Pepper Sauce product
    When user click on Blazin' Saddle XXX Hot Habanero Pepper Sauce product
    Then Blazin' Saddle XXX Hot Habanero Pepper Sauce product page should display
    Then user can navigate back to previous page

  Scenario:3.User can click and view price on "Dr. Chilemeister's Insane Hot Sauce" product and navigate back to clearance page
    Then user can able to see Dr. Chilemeister's Insane Hot Sauce product name
    Then user can able to see price tag Dr. Chilemeister's Insane Hot Sauce product
    When user click on  Dr. Chilemeister's Insane Hot Sauce product
    Then Dr. Chilemeister's Insane Hot Sauce product page should display
    Then user can navigate back to previous page

  Scenario:4.User can click and view price on "Bull Snort Cowboy Cayenne Pepper Hot Sauce" product and navigate back to clearance page
    When user scroll down the page
    Then user can able to see Bull Snort Cowboy Cayenne Pepper Hot Sauce product name
    Then user can able to see price tag Bull Snort Cowboy Cayenne Pepper Hot Sauce product
    Then user able to click on Bull Snort Cowboy Cayenne Pepper Hot Sauce product
    Then Bull Snort Cowboy Cayenne Pepper Hot Sauce product page should display
    Then user can navigate back to previous page

  Scenario:5.User can click and view price on "Hurtin' Jalepeno Hot Sauce" product and navigate back to clearance page
    When user scroll down the page
    Then user can able to see Hurtin' Jalepeno Hot Sauce product name
    Then user can able to see price tag Hurtin' Jalepeno Hot Sauce product
    Then user able to click on Hurtin'Jalepeno Hot Sauce product
    Then Hurtin' Jalepeno Hot Sauce product page should display
    Then user can navigate back to previous page