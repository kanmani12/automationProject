#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Blue Link Web Application Chat

  Background: 
    Given validate the login
    When After user login application selected chat icon
    Then display chat details of loged in user

  Scenario: 
    Given Message box add button validation
    When User clicks add button
    Then Display people details for adding into chat group
    And check the selected people is added

  Scenario Outline: Message box search input box
    Given User Enter in input
    When User Enters the <name> in the search box
    Then it should short out the names in the chatbox list
    And check the enter name are display in the list

    Examples: 
      | name   |
      | John   |
      | Gates  |
      | Miller |
      | joe    |
