Feature: To verify all items page filter functionality

Scenario: To veriy the filter functionality after selecting A to Z from the filter dropdown
Given : user is on the all items page
When  :	user select Z TO A from the filter dropdown
Then  : product list for Z TO A filter should be reordered accordingly

Scenario: To veriy the filter functionality after selecting high to low from the filter dropdown
Given : user is on the all items page
When  : user select high to low from the filter dropdown
Then  : product list for hight to low filter should be reordered accordingly
 

