Feature: Automate the FLEA Market

  @flea1
  Scenario: Landing Page
    Given I visit FLEA Market in the "qa" Environment
    Then I verify title is "e-commerce – Automation Practice Website" for the page
    When I verify and Click on "Mac" Category on the Top Bar
    Then I verify Cart Icon is present
    Then I verify Image Slider is present
    Then I verify Contact button functionality

  @flea2
  Scenario Outline: Landing page category tests
    Given I visit FLEA Market in the "qa" Environment
    Then I verify title is "e-commerce – Automation Practice Website" for the page
    Then I verify and Click on "<name>" Category on the Top Bar
    Examples:
    | name           |
    | Mac            |
    | iPhone         |
    | Watch          |
    | Accessories    |

  @flea3
  Scenario: Product Page
    Given I visit FLEA Market in the "qa" Environment
    Then I verify title is "e-commerce – Automation Practice Website" for the page
    When I wait and click on a product "Apple Watch Series 6" on the Landing Page
    When I verify Description contains text "Apple Watch Series 6"
    When I add "2" items to Cart and verify Cart

  @flea4
  Scenario Outline: Product Page Outline
    Given I visit FLEA Market in the "qa" Environment
    Then I verify title is "e-commerce – Automation Practice Website" for the page
    When I wait and click on a product "<product>" on the Landing Page
    When I verify Description contains text "<product>"
    When I add "2" items to Cart and verify Cart
    Examples:
      | product               |
      | Apple Watch Series 6  |
      | AirPods Pro           |
      | iMac                  |
      | IPhone 12             |
      | IPhone XR             |
      | Macbook Air           |