
Feature: Advertiser Overview

 Background:
  Given The admin launches the browser
  When Enters the url as "https://v3opend.tech-active.com/auth/manage_opend"
  Then Verify that the admin is navigated to the opend website
  When Enters the email address as "admin@opend.com" and the password as "1234"
  And  Clicks on the sign in button
  Then Verify that the admin is navigated to the dashboard page with the confirmation message
  When Clicks on advertisers from the side menu bar
  Then Verify that the admin is navigated to the advertisers home page
  When Clicks on view button from kebab menu dropdown 
  Then Verify that the admin should navigate to the overview advertiser page
  
 @Regression
 Scenario: The admin updates the advertiser profile information from profile tab
  When Clicks on profile tab
  Then Verify the admin should navigate to the "Profile Information" page
  When Clicks an edit button on company information section
  And Update some of the input fields
  And Clicks on update button
  And Clicks on ok button on confirmation popup
  Then Verify that the company information successfully updated with the confirmation message
  When Clicks on billing contacts section and edit button
  And Update some of the fields
  And Clicks on update button
  And Clicks on ok button on confirmation popup
  Then Verify that the billing information successfully updated with the confirmation message
  When Clicks on the profile icon
  And Clicks on logout button
  Then Ensure that the admin successfully logout from admin portal with the confirmation message
  And Close the browser
    
  
  
  
  