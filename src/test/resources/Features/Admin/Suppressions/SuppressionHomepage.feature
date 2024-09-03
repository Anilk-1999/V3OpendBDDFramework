Feature: Suppression Home Page 
 
 Background:
   Given The admin launches the browser
   When Enters the url as "https://v3opend.tech-active.com/auth/manage_opend"
   Then Verify that the admin is navigated to the opend website
   When Enters the email address as "admin@opend.com" and the password as "1234"
   And  Clicks on the sign in button
   Then Verify that the admin is navigated to the dashboard page with the confirmation message
   When Clicks on suppression from the side menu bar
   Then Verify that the admin is navigated to the suppression home page
   
  @Smoke
   Scenario: The admin filters the suppression by status and verifies the results in the table
    When The admin selects "Active" from the "All" filter dropdown
    Then Verify the table should display only suppression with the status "Active" from "Status" column
    When Clicks on the profile icon
    And Clicks on logout button
    Then Ensure that the admin successfully logout from admin portal with the confirmation message
    And Close the browser
    
  @Regression
  Scenario Outline: The admin filters the suppression by client and verifies the results in the table 
   When The admin selects "<Client Type>" by "<Type filter Place Holder>" and "<Client Name>" by "<Client filter Place Holder>" from dropdowns
   Then Verify the table should display only suppression with the client "<Expected Client Name>" from "<Column Name>" column
   When Clicks on the profile icon
   And Clicks on logout button
   Then Ensure that the admin successfully logout from admin portal with the confirmation message
   And Close the browser
    
   
   
  Examples: 
  |Client Type|Client Name                             |Expected Client Name    |Column Name|Type filter Place Holder|Client filter Place Holder|
  |Advertiser |Tech Active (sudeep@active.agency)      |Advertiser : Tech Active|Client Name|All         |Please Select Advertiser|
  |Publisher  |Tech Active List (sudeep@active.agency) |Publisher : Tech Active List|Client Name|All         |Please Select Publisher |
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    