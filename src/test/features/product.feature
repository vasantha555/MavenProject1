Feature: Product Feature

 Scenario : Multiple products search
   Given Navigate to url
   When  Enter valid "standard_user" and "secret_sauce"
   And   Click on Login
   And  Click on "Sauce Labs Onesie"
   Then Product List should be opened