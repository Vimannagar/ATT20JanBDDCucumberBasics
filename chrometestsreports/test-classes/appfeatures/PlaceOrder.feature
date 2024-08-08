Feature: Place order functionality
Scenario: Order confirmation validation
Given I should be at the product page
When I click on the add to cart button
Then Product should get added
When I click on place order button
Then Order should get confirmed

Scenario: Track status validation
Given I should be at the product page
When I placed the order
Then I should be able to validate the order status