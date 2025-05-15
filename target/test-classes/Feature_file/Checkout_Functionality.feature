Feature: To verfiy the checkout functionality

Scenario Outline: To verfiy the checkout functionality
Given  user is on the add to card page
When   user adds a items to the card 
And    clicks on the checkout button and enter the require details <Firstname> , <Lastname> , <Postalcode>
And    click on the continue and finist button
Then   product successfully dispatched pop-up should be displayed 
Examples:
|Firstname |Lastname|Postalcode|
|"Romaan"|"Khan"|"400078"|
