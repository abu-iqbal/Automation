Feature: User Login to the application
  User should be able to login using valid credentials

  Scenario: Verify the login with valid credentials
    Given user launches the application with valid credentials
    And verify the homepage "My account - My Store" is loaded with the tile