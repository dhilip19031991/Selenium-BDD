@regression
Feature: Web_React_Edit_And_Delete

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

@demo
 Scenario Outline: Search course and delete all records
 Given user in on react app page
 When user click on training summary
 Then verify user is on training records projectName, EmployeeName
 Then search for course "<coursename>"
 Then delete all records of "<coursename>" course
Examples:
    | coursename |
    | Java       |
    | Selenium   |

Scenario: filter by Start date and verify date with filter records
 Given user in on react app page
 When user click on training summary
 Then verify user is on training records projectName, EmployeeName
 And filter Start Date by "11262025"
 Then verify filtered records have date "11/26/2025"