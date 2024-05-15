package ru.ls.qa.school.addressbook;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;


public class GroupCreationTests {
  private WebDriver webDriver;

  @BeforeEach
  public void setUp() {
    webDriver = new ChromeDriver();
  }

  @AfterEach
  public void tearDown() {
    webDriver.quit();
  }
  @Test
  public void groupCreationTests() {
    webDriver.get("http://localhost/addressbook/");
    webDriver.manage().window().setSize(new Dimension(968, 1012));
    login("admin", "secret");
    goToGroupPage();
    clickCreateNewGroup();
    fillGroupForm(new GroupData("Test group2", "Test header", "Test footer"));
    submitGroupCreation();
    returnToGroupPage();
    logout();
  }

  private void login(String username, String password) {
    webDriver.findElement(By.name("user")).click();
    webDriver.findElement(By.name("user")).sendKeys(username);
    webDriver.findElement(By.name("pass")).sendKeys(password);
    webDriver.findElement(By.cssSelector("input:nth-child(7)")).click();
  }

  private void goToGroupPage() {
    webDriver.findElement(By.linkText("groups")).click();
  }

  private void clickCreateNewGroup() {
    webDriver.findElement(By.name("new")).click();
  }

  private void fillGroupForm(GroupData groupData) {
    webDriver.findElement(By.name("group_name")).sendKeys(groupData.getName());
    webDriver.findElement(By.name("group_header")).click();
    webDriver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
    webDriver.findElement(By.name("group_footer")).click();
    webDriver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
  }

  private void submitGroupCreation() {
    webDriver.findElement(By.name("submit")).click();
  }

  private void returnToGroupPage() {
    webDriver.findElement(By.linkText("group page")).click();
  }

  private void logout() {
    webDriver.findElement(By.linkText("Logout")).click();
  }

}
