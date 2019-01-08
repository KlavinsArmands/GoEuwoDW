Feature: This feature is about successful booking of trip
  Scenario: Successful booking
    Given I am in homepage
    And I set Marseille as departure place
    And I set Nice as arrival place
    And I unselect accommodation search
    When I click Search button
    And I select departure date
    And I select first Trains available
    And I click Go To Passenger Details button
    And I fill in Passenger Details page
    And I click Review journey details
    Then Review and Pay page is visible