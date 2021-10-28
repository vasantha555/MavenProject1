Feature: Login Feature

  Scenario Outline: Validating Login Scenario
    Given Navigate to url
    When  Enter valid "<username>" and "<password>"
    And   Click on Login
    Then  Open Login Page
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |














