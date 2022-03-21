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
@Hooks
  Feature: Simple Login feature
 
  Scenario Outline: This your scenario outline
    Given proceed to login page
    When user enters the "<UserName>" and password "<Password>"
    Then clicked button

    Examples: 
      | UserName  | Password |
      | Admin     | admin1234 |
      | Admin     | admin123 |
