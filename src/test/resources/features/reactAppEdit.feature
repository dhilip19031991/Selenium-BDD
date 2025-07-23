@regression@smoke
Feature: React App Emp Training Records Edit new

 Scenario: Edit first record sucessfully
 Given user in on react app page
 When user click on training summary
 Then verify user is on training records projectName, EmployeeName
 Then click edit on frist record
 And verify user is on edit training
 Then I change the employeename to "Arun" and the course to "Automation"
 Then click on update button

Scenario: Search course edit employee name first record
 Given user in on react app page
 When user click on training summary
 Then verify user is on training records projectName, EmployeeName
 Then search for course "Auto"
 Then click edit on frist record
 And verify user is on edit training
 Then I change the employeename to "Karthik"
 Then click on update button

 Scenario: Search employeename and course delete first record
 Given user in on react app page
 When user click on training summary
 Then verify user is on training records projectName, EmployeeName
 Then search for employeename "karthik"
 Then search for course "Auto"
 Then click delete on frist record