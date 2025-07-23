package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReactAppEdit {
WebDriver driver;

public ReactAppEdit(WebDriver driver) {
        this.driver = driver;
}
public void reactAppPage(String url) {
    driver.get(url);
}
public void trainingSummaryClick(){
    driver.findElement(By.xpath("//button[@aria-label='Training Summary']")).click();
}
public void projectNameEmployeeNameVisible(){
    WebElement projectNameElement= driver.findElement(By.xpath("//th[text()='Project Name']"));
    boolean projectNameisVisible=projectNameElement.isDisplayed();
    Assert.assertTrue("Project Name not visible", projectNameisVisible);
    WebElement employeeNameElement= driver.findElement(By.xpath("//th[text()='Employee Name']"));
    boolean employeeNameisVisible=employeeNameElement.isDisplayed();
    Assert.assertTrue("Employee Name not visible", employeeNameisVisible);
}
public void searchEmployeename(String employeename){
   WebElement serachemployeename= driver.findElement(By.id("«r8»"));
    serachemployeename.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
    serachemployeename.sendKeys(employeename);
}
public void searchCourse(String course){
   WebElement serachcourse= driver.findElement(By.id("«r9»"));
    serachcourse.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
    serachcourse.sendKeys(course);
}
public void editTrainingClick(){
    driver.findElement(By.xpath("//button[@aria-label=\"edit\"][1]")).click();
}
public void editTrainingVisible(){
    WebElement editTraiingElement= driver.findElement(By.xpath("//h6[text()='Edit Training']"));
    boolean editTrainingisVisible=editTraiingElement.isDisplayed();
    Assert.assertTrue("Edit training not visible", editTrainingisVisible);
}
public void editEmployeeName(String employeename){
   WebElement editname= driver.findElement(By.name("employeeName"));
    editname.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
    editname.sendKeys(employeename);
}
public void editCourse(String course){
   WebElement editcourse= driver.findElement(By.name("course"));
   editcourse.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
   editcourse.sendKeys(course);
}
public void updateClick(){
    driver.findElement(By.xpath("//button[text()='Update']")).click();
}
public void deleteTrainingClick(){
    driver.findElement(By.xpath("//button[@aria-label='delete'][1]")).click();
}
}