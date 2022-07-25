Feature: Validation of MyTheresa UserValidation

  #@TC-1
  Scenario: Validation of UserAccount Creation
    Given User launches the EmailCreation application
    Then  User enters the random email address and click on view inbox
    When  User navigates to MyTheresa login application 
    Then  User Clicks on My account and Create an Account
    And   User validates the account Registration
    And  User logs out from the application
    
    #@TC-2
  Scenario: Validation of Login Functionality
    When User navigates to MyTheresa login application 
    Then  User validates the Login with Emailaddress and Password
    
