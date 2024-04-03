Feature: Check search phone

  Background: Open main page
    Given I open the page "https://www.avito.ru/"

  @findFromInput
  Scenario: Find phone through the search input
    When I enter "iphone 15 pro max" in search field
    And I click button search
    Then title has text "iphone 15 pro max"

  @findFromDropList
  Scenario: Find phone through the drop-down list
    When I click by button categories
    And I select category electronics
    And I select subCategory phones
    And I select company "apple"
    And I select model "iphone 15 pro max"
    And I click button to show results
    Then title has text "iphone 15 pro max"

  @findFromSection
  Scenario: Find phone through the section
    When I click by section Electronic
    And I select category Phones
    And I select company "apple"
    And I select model "iphone 15 pro max"
    And I click button to show results
    Then title has text "iphone 15 pro max"



