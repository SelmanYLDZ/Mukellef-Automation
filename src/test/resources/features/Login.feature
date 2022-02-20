@login
  Feature: Automation login functionality
    Background:
      Given the user is on the home page

      @wip
      Scenario: Login as authorized
        When the user logs in with valid credentials
        Then Mukelef  panel page should be displayed

