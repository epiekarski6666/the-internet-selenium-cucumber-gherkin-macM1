Feature: DynamicLoading

  Scenario Outline: confirm message
    Given homepage link
    When I click sinle feature
    When I click start
    Then I expect the result
    Examples:
      |  |