Feature: HomePage
  Background: Amazon
    Given I am at amazon.com

#    Senario=1
  Scenario:
    Given I am Searching iPhone11
    Then I am going back to Home

#    Senario 2
    Scenario:
    Given I am on Todays Deal page
    Then I am on using Radio button of Amazon Device page

# Senario 3
  Scenario:
    Given I am Hovering mouse on Account&List
    And I am clicking Sign in button
    Then And Inputting email and password

# Senario 4
  Scenario:
    Given I am on Amazon Garage page
    Then Hovering one by one Each tab

# Senario 5
  Scenario:
    Given I am on Amazon Footer page
    Then Get the text from the Footer Licence

# Senario 6
  Scenario:
    Given I am Scrolling down
    Then Get text and Assert it Footer Licence

# Senario 7
  Scenario:
    Given Right Click from the mouse
    Then Then close the browser

# Senario 8
  Scenario:
    Given I am Clicking feedback button
    Then I am clicking the cancel button

# Senario 9
  Scenario:
    Given I am hovering AccountAndListArray
    And I am going sign in page
    Then Opening new tab called Condition use

# Senario 10
  Scenario:
    Given I am Changing to spanish language
    And I am taking screenShoot
    Then Browser close