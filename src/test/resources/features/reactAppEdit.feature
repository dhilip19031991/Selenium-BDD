Feature: React App Emp Training Records Edit

 Scenario: Edit first record sucessfully
 Given user in on react app page
 When user click on training summary
 Then verify user is on training records projectName, EmployeeName
 Then click edit on frist record
 And verify user is on edit training
 Then I change the employeename to "Arun" and the course to "Automation"
 Then click on update button
