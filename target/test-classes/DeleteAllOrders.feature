Feature: Delete all orders
    Make sure that Check All and Delete Selected buttons remove all orders

Scenario: Delete all orders
    Given I have launched the Orders application
    And I have logged in using the name "Tester" and password "test"
    When I click Check All button
    And Click Delete Selected button
    Then I should see "List of orders is empty" label
