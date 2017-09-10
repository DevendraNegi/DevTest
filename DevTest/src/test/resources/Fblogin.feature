@Login
Feature: Facebook user login functionality

  @Login1
  Scenario: Login user
    Given I am in facbook login page
    When I fill the username as "testautomationrun@gmail.com" and password as "Enavik2017!"
    Then It should navigate me to the facebook home page

  @Login2
  Scenario: Login user
    Given I am in facbook login page
    When I fill the username as "testautomationrun@gmail.com" and password as "Enavik2017!"
    Then It should navigate me to the facebook home page
    When I compose an email to "testautomationrun@gmail.com" with information "FYI"
    Then I should be eble to see this email in sent items
