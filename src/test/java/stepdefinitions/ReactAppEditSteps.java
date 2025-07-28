package stepdefinitions;

import common.BaseClassD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ReactAppEdit;

public class ReactAppEditSteps extends BaseClassD {
ReactAppEdit edit;

@Given("user in on react app page")
public void user_in_on_react_app_page() {
    edit = new ReactAppEdit(driver);
    edit.reactAppPage("http://10.192.190.130:3000/");
}
@When("user click on training summary")
public void user_click_on_training_summary() {
    edit.trainingSummaryClick();
}
@Then("verify user is on training records projectName, EmployeeName")
public void verify_user_is_on_training_records_project_name_employee_name() {
    edit.projectNameEmployeeNameVisible();
}
@Then("click edit on frist record")
public void click_edit_on_frist_record() {
  edit.editTrainingClick();
}
@Then("verify user is on edit training")
public void verify_user_is_on_edit_training() {
edit.editTrainingVisible();
}
@Then("I change the employeename to {string} and the course to {string}")
public void i_change_the_employeename_to_and_the_course_to(String employeename, String course) {
edit.editEmployeeName(employeename);
edit.editCourse(course);
}
@Then("click on update button")
public void click_on_update_button() {
edit.updateClick();
}
@Then("search for course {string}")
public void search_for_course(String course) {
    edit.searchCourse(course);
}
@Then("I change the employeename to {string}")
public void i_change_the_employeename_to(String employeename) {
edit.editEmployeeName(employeename);
}
@Then("search for employeename {string}")
public void search_for_employeename(String employeename) {
   edit.searchEmployeename(employeename); 
}
@Then("click delete on frist record")
public void click_delete_on_frist_record() {
edit.deleteTrainingClick();
}
@Then("delete all records of {string} course")
public void delete_all_records_of_course(String coursename) {
edit.deleteAllByCourseRecords(coursename);
}
}
