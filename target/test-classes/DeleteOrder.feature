Feature: Delete order
    Make sure that Delete Selected button removes order

Scenario: Delete selected order
    Given I have launched the Orders application
    And I have logged in using the name "Tester" and password "test"
    When I select "Mark Smith" order
    And Click Delete Selected button
    Then "Mark Smith" order should be removed from list
