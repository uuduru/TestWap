Feature: Test Google search functionnality

  Scenario: Validate google search is working
    Given browser is open
    And user is on search page
    When user enters a Wap in search box
    Then User gets to the page
