@Login
Feature: Facebook user login functionality

  @Login1
  Scenario: Login user
    Given I am in facbook login page
    When I fill the username as "testautomationrun@gmail.com" and password as "Enavik2017!"
    Then It should navigate me to the facebook home page
