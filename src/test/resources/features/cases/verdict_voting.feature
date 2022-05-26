Feature: Verdict Voting

  Scenario Outline: Voting for a verdict
  Given Paul is finding the truth
    And he chooses the making a case against Kevin case
    And he judges
  When he votes "<verdict>"
  Then his verdict should be confirmed
  Examples:
  | verdict |
  | guilty |
  | not guilty |