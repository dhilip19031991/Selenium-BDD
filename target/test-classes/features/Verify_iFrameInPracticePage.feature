@smoke

Feature: Mary_Web_Verify_iFrame

    Scenario: Switch to iframe and verify content
        Given I navigate to the automation practice page
        When I switch to the iframe
        Then I should see the "Learning Paths" link inside the iframe

