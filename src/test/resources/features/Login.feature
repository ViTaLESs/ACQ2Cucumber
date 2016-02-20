@Login
Feature: Login to the System
  TC-123 Login test cases

  Scenario: Test1 - Positive
    Given I navigate to ellos website
    And I click Login link
    When I write Email address "b.handozhynski@gmail.com"
    And I write password "123456"
    And I click on button Login
    Then I see that I am logged in
    And I logged out






