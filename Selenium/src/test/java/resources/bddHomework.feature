@Homework @BDD

Feature: Customer site for shopping
  As a customer I want to register my
  account for future usage

  @regression
  Scenario: Successfully Registered Account
    Given The site is open
    When The home page is loaded
    And Navigate to register account page
    And Fill all mandatory field
    Then Ensure that he is able to registered account and successful message "Your Account Has Been Created!" is displayed


  @regression
  Scenario: Password Must Be Between 40 and 20 Characters
    Given The site is open
    When The home page is loaded
    And Navigate to register account page
    And Fill all mandatory field but for password field is provided invalid data
    Then Ensure that registration warning message "Password must be between 4 and 20 characters!" is displayed



  @regression
  Scenario: Unsuccessfully Registered Account
    Given The site is open
    When The home page is loaded
    And Navigate to register account page
    And Fill all mandatory field but for password field he provides wrong password
    Then Ensure that registration is failure and "Password confirmation does not match password!" message is displayed


