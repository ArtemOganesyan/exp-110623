Feature: Reddit tests
  
  Scenario: Reddit search
    Given I open url "https://www.reddit.com"
    Then client type "Cucumber" in the element "search"
    Then element with xpath "//*[@id='main-content']" should contain text "Cucumber"