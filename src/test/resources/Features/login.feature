
  Feature: feature to test login functionality
    #@SmokeTest
    Scenario: Check login is successful with valid credentials
      Given browser is open
      And user is on Login Page
      When  user enters username and password
      And clicks on Login Button
      Then user is navigated to Home Page



    ##Scenario: Temporarily disabled
   # Scenario Outline: Check login is successful with valid credentials
    #  Given user is on Login Page
     # When  user enters <username> and <password>
      #And clicks on Login Button
      #Then user is navigated to Home Page

      #Examples:
       # | username | password |
        #|user1     |pass1     |
##########################################