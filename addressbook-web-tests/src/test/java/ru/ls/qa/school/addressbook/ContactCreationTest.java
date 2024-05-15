package ru.ls.qa.school.addressbook;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;


public class ContactCreationTest {
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
  public void contactCreationTest() {
    webDriver.get("http://localhost/addressbook/");
    webDriver.manage().window().setSize(new Dimension(968, 1012));
    login("admin", "secret");
    clickCrateNewContact();
    fillContactForm(new ContactData("Test Name", "Test middle name", "test last name", "test nickname", "test title", "test company", "test address", "test home", "test mobile 89127742345"));
    sumbitContactCreation();
    returnToMainPage();
    logout();
  }

  private void login(String username, String password) {
    webDriver.findElement(By.name("user")).click();
    webDriver.findElement(By.name("user")).sendKeys(username);
    webDriver.findElement(By.name("pass")).sendKeys(password);
    webDriver.findElement(By.cssSelector("input:nth-child(7)")).click();
  }

  private void clickCrateNewContact() {
    webDriver.findElement(By.linkText("add new")).click();
  }

  private void fillContactForm(ContactData contactData) {
    webDriver.findElement(By.name("firstname")).sendKeys(contactData.getFirstName());
    webDriver.findElement(By.name("middlename")).sendKeys(contactData.getMiddleName());
    webDriver.findElement(By.name("lastname")).sendKeys(contactData.getLastName());
    webDriver.findElement(By.name("nickname")).sendKeys(contactData.getNickname());
    webDriver.findElement(By.name("title")).click();
    webDriver.findElement(By.name("title")).sendKeys(contactData.getTitle());
    webDriver.findElement(By.name("company")).sendKeys(contactData.getCompany());
    webDriver.findElement(By.name("address")).sendKeys(contactData.getAddress());
    webDriver.findElement(By.name("home")).sendKeys(contactData.getHome());
    webDriver.findElement(By.name("mobile")).sendKeys(contactData.getMobile());
  }

  private void sumbitContactCreation() {
    webDriver.findElement(By.cssSelector("input:nth-child(87)")).click();
  }

  private void returnToMainPage() {
    webDriver.findElement(By.linkText("home page")).click();
  }

  private void logout() {
    webDriver.findElement(By.linkText("Logout")).click();
  }

}
