Feature: Cartier tests

  Scenario: Searching for a Cartier Love Bracelet
    Given I open url "https://www.cartier.com/"
    Then I press enter for element with xpath "//nav[@id='navigation']//..//button[@for='siteSearch']"
    Then I type "Love Bracelet" into element with xpath "//input[@id='siteSearch']"
    Then I click on element with xpath "//button[@aria-label='Submit search']"
    Then element with xpath "//div[@class='search-results__main ']//input[@data-search-component='query-input']" should be displayed
    Then element with xpath "//div[@id='product-search-results']" should contain text "Love Bracelet"