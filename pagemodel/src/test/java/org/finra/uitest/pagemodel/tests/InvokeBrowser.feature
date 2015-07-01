Feature: Login
  Scenario: Login to facebook
    Given a user
    And username 'user' and password 'pass'
    When user navigate to url 'www.facebook.com'
    And user clicks 'Login' button
    Then user should be able to navigate to home page