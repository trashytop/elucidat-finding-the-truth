Feature: Case Selection

  Scenario: Selecting a case
    Given Paul is finding the truth
    When he chooses the who is to blame? case
    Then he should see a description containing "been in an accident"

  @wip
  Scenario: Number of cases is consistent
    Given Paul is finding the truth
    When he counts the number of cases offered
    Then the number of cases should match the number of cases mentioned in the intro