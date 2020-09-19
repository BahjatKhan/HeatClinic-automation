Feature:This describe the Merchandise functionality for HeatClinic Application
  Description:This explain how a user can view,add and remove merchandise product.

  Background:
    Given user not a validated
    When user browse to the "http://heatclinic.shiftedtech.com/"
    Then homepage window should display on maximize size
    When user mouse hover on merchandise button
    Then user can click on men feature button
    Then merchandise page should display



  Scenario: 1.User can able to view Hawt Like a Habanero Shirt (Men's) product and can navigate back to merchandise page
    When user able to click on Hawt Like a Habanero Shirt (Men's) t-shirt button
    Then Habanero Shirt (Men's) page should display
    And  user can navigate back to previous page
    Then merchandise page should display

  Scenario: 2. User can able to view  Heat Clinic Hand-Drawn (Men's) product can navigate back to merchandise page
    When user able to click Heat Clinic Hand-Drawn (Men's) t-shirt button
    Then Heat Clinic Hand-Drawn (Men's) page should display
    And  user can navigate back to previous page
    Then merchandise page should display

  Scenario: 3.User can able to view Heat Clinic Mascot (Men's) product can navigate back to merchandise page
    When user click Heat Clinic Mascot (Men's) product
    Then Heat Clinic Mascot (Men's) page should display
    And  user can navigate back to previous page
    Then merchandise page should display

  Scenario: 4.All products price on the product picture on merchandise men page is visible
    Then on the product picture price "$14.99" for Hawt Like a Habanero Shirt (Men's) product would be visible for user
    And on the product picture price "$15.99" for Heat Clinic Hand-Drawn (Men's) product would be visible for user
    And on the product picture price "$15.99" for Heat Clinic Mascot (Men's) product would be visible for user

  Scenario: 5.On the Habanero Shirt (Men's) product page user can select Red color and Red color product will show
    When user able to click on Hawt Like a Habanero Shirt (Men's) t-shirt button
    Then Habanero Shirt (Men's) page should display
    Then user can select Red color
    And Shirt color will be red
    And Red color t-shirt will display

  Scenario: 6.On the Habanero Shirt (Men's) product page user can select Black color and Black color product will show
    When user able to click on Hawt Like a Habanero Shirt (Men's) t-shirt button
    Then Habanero Shirt (Men's) page should display
    Then user can select Black color
    And Shirt color will be Black
    And Black color t-shirt will display

  Scenario Outline: 7.Three t-shirt image will be visible under the main t-shirt image
    When user able to click on Hawt Like a Habanero Shirt (Men's) t-shirt button
    Then Habanero Shirt (Men's) page should display
    When user able to click all the following "<t-shirt colors>"
    Examples:
      |t-shirt colors|
      |Black         |
      |Red           |
      |Silver        |

  Scenario Outline: 8.User can able select sizes from size box chart
    When user able to click on Hawt Like a Habanero Shirt (Men's) t-shirt button
    Then Habanero Shirt (Men's) page should display
    When Shirt size will display while user clicks following "<Sizes>"
    Examples:
      |Sizes|
      |S    |
      |M    |
      |L    |
      |XL   |


  Scenario: 9.Verify the description for Habanero Shirt product
    When user able to click on Hawt Like a Habanero Shirt (Men's) t-shirt button
    Then Habanero Shirt (Men's) page should display
    And user can view the description for Habanero Shirt product

  Scenario: 10.User cannot buy product if no options were selected
    When user able to click on Hawt Like a Habanero Shirt (Men's) t-shirt button
    Then Habanero Shirt (Men's) page should display
    When user click on buy now product
    But cannot proceed for checkout page

  Scenario: 11.User can view the price on product page
    When user able to click on Hawt Like a Habanero Shirt (Men's) t-shirt button
    Then Habanero Shirt (Men's) page should display
    Then user can view price tag on the product page

  Scenario: 12.Product title page should display on product page
    When user able to click on Hawt Like a Habanero Shirt (Men's) t-shirt button
    Then Habanero Shirt (Men's) page should display
    Then Product title "Hawt Like a Habanero Shirt (Men's)" should display on product page

  Scenario: 13.User click on Red box shirt color but avoid Shirt size,user cannot proceed to checkout
    When user able to click on Hawt Like a Habanero Shirt (Men's) t-shirt button
    Then Habanero Shirt (Men's) page should display
    Then user can select Red color
    When user click on buy now product
    But cannot proceed for checkout page

  Scenario: 14.User click on Black box shirt color but avoid Shirt size,user cannot proceed to checkout
    When user able to click on Hawt Like a Habanero Shirt (Men's) t-shirt button
    Then Habanero Shirt (Men's) page should display
    Then user can select Black color
    When user click on buy now product
    But cannot proceed for checkout page

