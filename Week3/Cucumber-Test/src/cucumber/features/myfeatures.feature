Feature: Test Selenium

  Scenario: My first login
    Given I am on the youtube website 
    When I press the "Sign in" button
    And I enter the right username and password
      | Username | byztrkk@gmail.com |
     | Password | 123123                |
    And press "Sign in" button
    And click the profile icon
    Then it will display the name of the user
    And close browser
    
  Scenario: My second login
    Given I am on the youtube website
    When I press the "Sign in" button
    And I enter the right username and password
      | Username | byztrkk@gmail.com |
      | Password | 123123                |
    And press "Sign in" button
    And click "Popular Films Videos" button
    Then it will display the video "Disney's Fren Fever Trailer"
    And close browser