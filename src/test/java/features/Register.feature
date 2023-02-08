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
Feature: Blue Link Web application Register
 

  @SmokeTest
  Scenario: Home page register new user
    Given User on Home Landing page for Register
    When User Register into application with followin details
    | John | Maxwell | john@abc.com | Asia | 333232 |
    Then User Need to  register success
    And It should display Message user register successfully


