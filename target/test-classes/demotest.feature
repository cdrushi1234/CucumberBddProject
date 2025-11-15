

Feature: Verify login functionality 

Scenario: check successful login
 Given user is on login page
 When user enter valid username and password
 And user click on login button
 Then user navigate to dashboard after successful login
 And end the test