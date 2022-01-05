Feature: Current Job Openings

Scenario Outline: Review if Senior QA Engineer position exists
    Given I want to know if Senior QA Engineer position is available
    When filter by Department "<department>"
    And filter by Office "<country>"
    Then "<jobPosition>" position should be displayed

    Examples:
        |department     |country        |jobPosition        |
        |Engineering    |Mexico         |Senior QA Engineer |
 #       |Credit Success |Colombia       |Credit Officer     |
 #
 #       |Operations     |United States  |OKR Coach          |

Scenario Outline: Review all items in dropdown list "Department" are displayed
    Given I want to review if this item exists in the list
    When select dropdown list Department
    Then this "<item>" should be displayed in the list
    And this "<item>" should be clickable

    Examples:
        |item           |
        |Engineering    |
        |Credit Success |
        |Another item AAA|
