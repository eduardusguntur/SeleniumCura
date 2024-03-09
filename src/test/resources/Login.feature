@All
  Feature: Login

    @Test1
    Scenario: User want to login with valid account
      Given User is on login page
      When User fill Username
      And User fill Password
      And User click login button
      Then User success login


    @Test2
    Scenario: User want to login with Invalid Username
      Given User is on login page
      When User fill Invalid Username
      And User fill Password
      And User click login button
      Then User success login