Feature: DynamicLoading

  Scenario: confirm message
    Given dynamic loading link 2 clicked
    When I click start
    Then I expect the result
