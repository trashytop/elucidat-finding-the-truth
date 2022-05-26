Feature: Scoring

  -- check with BAs - one point per successful verdict?
  @wip
  Scenario: Score should be an integer that is either positive or zero
    Given Paul is finding the truth
    When he views his score
    Then he should see an integer that is either positive or zero


