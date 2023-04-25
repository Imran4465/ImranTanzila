Feature: Valid user able to login in the application and buy, sale, return, clear #epic what to do 

Description: "User able to login in the application with the valid credentials " #optional 

@smoke
@sanity
@segression
Scenario: User able to login the application with the valid credntials   
       Given User able to open the any browser 
       And   User able to enter the url
       When  User able to click on the Sign in button
       And   user able to enter the user name
       And   user able to enter the password
       And   User able to click on the login button  
       Then  User able to verify the user information on the screen
       




