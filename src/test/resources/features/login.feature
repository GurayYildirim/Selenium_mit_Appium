Feature: Test Login


  Scenario: Getir Login Test
    Given User open the getir app and enters "hello@getir.com" and "hello"
    Then  User login successfully

  @wip
  #Go to basket and verify that is empty
  #go to items list and print all list and verify that size is 12
  #go to second category and add two different items
  #go back the home page
  #go to basket again
  #verify total amount
  Scenario: Getir basket verification
    Given User open the getir app and enters "hello@getir.com" and "hello"
    Then  User login successfully
    And   User clicks basket button
    Then  User verify that basket is empty  and able to see "There is no result"
    Then  User able to see all menu list in console and verify that is 12
    And   User clicks second category which is "Atıştırmalık"
    And   User adds two different items
    And   User scroll down to "Ürün 14"
    And   User adds two different items
    And   User clicks basket button
    Then  User verify that "Total Amount : 84 ₺"
