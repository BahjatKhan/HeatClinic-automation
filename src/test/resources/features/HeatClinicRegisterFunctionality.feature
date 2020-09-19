Feature:This describe the Register functionality for HeatClinic Application
  Description:This explain how a user can able to Register in HeatClinic Application

  Background:
   Given user not a validated
    When user browse to the "http://heatclinic.shiftedtech.com/"
    Then homepage window should display on maximize size
    When user click on Register button
    Then register page should display

  Scenario Outline: 1.User can able to register with valid email address
    Then user enter valid "<Email>" address
    Then user enter valid "<First Name>"
    Then user enter valid "<Last Name>"
    Then user enter "<Password>"
    Then user enter "<Confirmed Password>"
    Then user able to click on register button
    Then success message for registration will show up
    Examples:
    |Email              |First Name      |Last Name    |Password   |Confirmed Password|
    |shiftqa01#gmail.com|Bahjat          |Khan         |xyz        |xyz               |

  Scenario Outline: 2 User cannot able to register with invalid email address
    Then user enter "<Invalid Email>" address
    Then user enter valid "<First Name>"
    Then user enter valid "<Last Name>"
    Then user enter "<Password>"
    Then user enter "<Confirmed Password>"
    Then user unable to click on register button
    Examples:
      |Invalid Email|First Name|Last Name|Password|Confirmed Password|
      |abc          | Bahjat   |  Khan   |  xyz   |xyz               |

  Scenario Outline: 3.User cannot able to register if passwords didn't match
    Then user enter valid "<Email>" address
    Then user enter valid "<First Name>"
    Then user enter valid "<Last Name>"
    Then user enter "<Password>"
    Then user enter "<Confirmed Password>"
    Then user unable to click on register button
    Examples:
      |Email|First Name|Last Name|Password|Confirmed Password|
      |shiftqa01#gmail.com   |Bahjat            |         |        |                  |

  Scenario Outline: 4.User cannot able to register if email address box is null
    Then user enter valid "<Null Email>" address
    Then user enter valid "<First Name>"
    Then user enter valid "<Last Name>"
    Then user enter "<Password>"
    Then user enter "<Confirmed Password>"
    Then user unable to click on register button
    Examples:
      |Null Email|First Name|Last Name|Password|Confirmed Password|
      |          |Bahjat            |         |        |                  |

  Scenario Outline: 5.User cannot able to register if first name box is null
    Then user enter valid "<Email>" address
    Then user enter valid "<Null First Name>"
    Then user enter valid "<Last Name>"
    Then user enter "<Password>"
    Then user enter "<Confirmed Password>"
    Then user unable to click on register button
    Examples:
      |Email              |Null First Name|Last Name|Password|Confirmed Password|
      |shiftqa01#gmail.com|               |         |        |                  |

  Scenario Outline:6.User cannot able to register if last name box is null
    Then user enter valid "<Email>" address
    Then user enter valid "<First Name>"
    Then user enter valid "<Null Last Name>"
    Then user enter "<Password>"
    Then user enter "<Confirmed Password>"
    Then user unable to click on register button
    Examples:
      |Email              |First Name|Null Last Name|Password|Confirmed Password|
      |shiftqa01#gmail.com|Bahjat    |              |        |                  |

  Scenario Outline:7.User cannot able to register if password box is null
    Then user enter valid "<Email>" address
    Then user enter valid "<First Name>"
    Then user enter valid "<Last Name>"
    Then user enter "<Null Password>"
    Then user enter "<Confirmed Password>"
    Then user unable to click on register button
    Examples:
      |Email|First Name|Last Name|Null Password|Confirmed Password|
      |shiftqa01#gmail.com     |          |         |             |                  |
  Scenario Outline:8.User cannot able to register if confirmed password box is null
    Then user enter valid "<Email>" address
    Then user enter valid "<First Name>"
    Then user enter valid "<Last Name>"
    Then user enter "<Password>"
    Then user enter "<Null Confirmed Password>"
    Then user unable to click on register button
    Examples:
      |Email|First Name|Last Name|Password|Null Confirmed Password|
      |shiftqa01#gmail.com     |          |         |             |                  |