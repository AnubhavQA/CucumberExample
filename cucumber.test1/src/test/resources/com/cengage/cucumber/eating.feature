Feature: Eat cucumbers
  In order to stave off hunger and lose weight
  As a dieter
  I should be able to eat cucumbers

  Scenario Outline: Eat some cucumbers
    Given I have <start> cucumbers
    When I eat <eat> cucumbers
    Then I should have <remaining> cucumbers
    And I should not want more cucumbers
    And I should not feel uncomfortably full

    Examples:
      | start | eat | remaining |
      |   12  |  7  |     5     |
      |   20  |  5  |    15     |
      |    3  |  3  |     0     |

  Scenario: Ten cucumbers are too many
    Given I have 25 cucumbers
    When I try to eat 10 cucumbers
    Then I should have 15 cucumbers
    And I should not want more cucumbers
    And I should feel uncomfortably full

  Scenario: Too many cucumbers II
    Given I have 25 cucumbers
    When I try to eat 11 cucumbers
    Then I should have 15 cucumbers
    And I should not want more cucumbers
    And I should feel uncomfortably full

  Scenario: Not enough cucumbers
    Given I have 3 cucumbers
    When I try to eat 4 cucumbers
    Then I should have 0 cucumbers
    And I should want 1 cucumber
    And I should not feel uncomfortably full

  Scenario: Too much is never enough
    Given I have 9 cucumbers
    When I try to eat 11 cucumbers
    Then I should have 0 cucumbers
    And I should want 2 cucumbers
    And I should not feel uncomfortably full
