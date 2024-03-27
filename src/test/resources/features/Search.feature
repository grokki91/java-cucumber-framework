Feature: Check search phone

  Background: Open main page
    Given user opens the page "https://www.avito.ru/"

  Scenario: Find phone from search input
    When user enters "iphone 15 pro max" in search field
    And user clicks button search
    Then title contains text "iphone 15 pro max"


  Scenario: Find phone from drop-down list
    When user clicks by button categories
    And user selects category electronics
    And user selects subCategory phones
    And user selects company "apple"
    And user select model "iphone 15 pro max"
    And user click button to show results
    Then title contains text "iphone 15 pro max"





