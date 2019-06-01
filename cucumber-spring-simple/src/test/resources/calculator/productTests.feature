# Cucumber tests of the Calculator business component
Feature: Calculator tests

  Scenario: Test Calculator sum
    When Test that sum(1, 2) equals 3
    And Test that sum(0, 0) equals 0

  Scenario: Test Calculator crazyOperation
    When Test that crazyOperation(1, 2, 3) equals -1
