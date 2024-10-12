Feature: Validate SCENT-Arts as a User Website

Scenario: Navigate to the website and verify descriptions in Areas of Scenting
    Given To launch the chrome browser and maximize the window
    When To launch the url of SCENT-ArtsasaUser
    And I click on the About Us button
    And I scroll to the Areas of Scenting section
    And I click on the "Hotels","offices","Airport" Areas
    Then close the browser