Feature: Smoke Testcase to check the Build Stability


Scenario: User verify the FaceBook Login Function
Given User Launch the "chrome" Browser
And user Navigate to FB Url "https://www.facebook.com/"
Then user Verify Login page
And User Enter the username "Test@gmail.com" 
And user enter the password "546546476"
And User Click  the login Button 
Then User Verify Logined Successfull