@autor Pablo Andres Hernandez

Feature: Buy two products in the swaglabs page.
  As user
  I want to navigate in swaglabs page
  in order to buy two products.

  @BuyProducts
  Scenario Outline: Buy two products successful
    Given that the user wants login in the page, he introduce the user and the password
      | user   | password   |
      | <user> | <password> |
    When the user is in the home page he add to car two products
    And make the checkout with the name, last_name and zip
      | name   | last_name   | zip   |
      | <name> | <last_name> | <zip> |
    Then Verify the text successful_process
      | successful_process   |
      | <successful_process> |
    Examples:
      | user          | password     | name  | last_name | zip    | successful_process        |
      | standard_user | secret_sauce | Pablo | Hernandez | 762021 | Thank you for your order! |