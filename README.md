# Section 3. UI Automation:

* Description

Create automated test scripts using the automation tool of your choice for:

    PART 1:
    
    1. Go to https://boards.greenhouse.io/tribalcredit
    2. Check the correct page is opened.
    3. Filter by “Engineering and Development” from the “Department” from the select dropdownlist.
    4. Filter by “Mexico” from the “Office” dropdownlist.
    5. Check “Senior QA Engineer” is displayed.
    
    PART 2:
    
    Create a new test to check all the filtering options from the “Department” and “Office” dropdown lists are displayed and can be selected .

- Prerequisites

Java SDK 8.x or higher
Maven 3.x or higher

- BUILT

The project use the following libraries for Building and Testing:

    Maven - build automation tool

    SerenityBDD - library for BDD
    
- EXECUTION

IntelliJ IDEA was used to create and run these test cases. For execution just go to BaseTest.java, then right click on the screen and click on Run 'Base Test' option.
You have to download the chrome driver in order to run the test cases. Once downloaded copy the driver in this field: src\test\resources\drivers\chromedriver
The project was created using the pattern Page Object Model and frameworks as Serenity BDD + Cucumber
These frameworks permits the use of BDD and Gherkin to have a easy understanding for technincal and no technical team because of the natural readable business

- CONTACT

    Jason López - jasonrla@gmail.com
