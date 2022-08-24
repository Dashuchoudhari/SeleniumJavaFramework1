Feature: Feaure to be test login functionality

  Scenario Outline: Check logine is succesfull with valid cradintioal
    Given user is on logine Page
    When user is enters <Username>and<Password>
    And click on login button
    Then User is navigated on Home Page

    Examples: 
      | Username | Password |
      | Admin    | admin123 |
      | Dashu    | dashu123 |
