Feature: LetsKodeIt HomePage
  Background: Letskodeit HomePage
    Given To load application url

#  Scenario 1
  Scenario: click on radio button
    Given I click on radio button
    Then I wait for page to load
    Then I close browser

#  Scenario 2
  Scenario: click test button
    Given I click on the test button
    Then I close browser

#  Scenario 3
    Scenario:Take screen shoot
    Given I am taking screen shoot
    Then I close browser

#  Scenario 4
  Scenario: Test new Window open
    Given I am opening new Window
    Then I close browser

#  Scenario 5
  Scenario: Test new tab CLose
    Given I am closing the new tab
    Then I close browser

#  Scenario 6
  Scenario: Test alert handing
    Given I am handling the alert
    Then I close browser

#  Scenario 7
  Scenario: Test alert handle cancel
    Given I Cancel the alert handling
    And I close browser

#  Scenario 8
  Scenario: Test get tab
    Given I getting the table to console
    And I close browser

#  Scenario 9
  Scenario: Test mouse hover
    Given I am using mouse hovering
    Then  I close browser

#  Scenario 10
  Scenario: Test iframe
    Given I using iframe then searching on there
    Then I close browser




