 
 
 Feature: Checkout 
 
 
Scenario: Checkout a banana
Given the price of a "banana" is 40
When I checkout 3 "banana"
Then the total price should be 120
      

Scenario: Two banans scanned separately
Given the price of a "banana" is 40
When I checkout 1 "banana"
And I checkout 4 "banana"
Then the total price should be 200

Scenario: A banana and Apple
Given the price of a "banana" is 40
And the price of a "apple" is 20
When I checkout 1 "banana"
And I checkout 3 "apple"
Then the total price should be 100
