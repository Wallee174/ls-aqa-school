package ru.ls.qa.school.addressbook;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;

public class ContactCreationTest {

    @BeforeAll
    static void setUp() {
        Configuration.browserSize = "968, 1012";
    }

    @AfterAll
    static void tearDown() {
        closeWebDriver();
    }

    @Test
    void contactCreationTest() {
        open("http://localhost/addressbook/");
        login("admin", "secret");
        clickCrateNewContact();
        fillContactForm(new ContactData("Test Name",
                "Test middle name",
                "test last name",
                "test nickname",
                "test title",
                "test company",
                "test address",
                "test home",
                "test mobile 89127742345"));
        sumbitContactCreation();
        returnToMainPage();
        logout();
    }

    private void login(String username, String password) {
        $(byName("user")).setValue(username);
        $(byName("pass")).setValue(password);
        $("input:nth-child(7)").click();
    }

    private void clickCrateNewContact() {
        $(byLinkText("add new")).click();
    }

    private void fillContactForm(ContactData contactData) {
        $(byName("firstname")).setValue(contactData.getFirstName());
        $(byName("middlename")).setValue(contactData.getMiddleName());
        $(byName("lastname")).setValue(contactData.getLastName());
        $(byName("nickname")).setValue(contactData.getNickname());
        $(byName("title")).setValue(contactData.getTitle());
        $(byName("company")).setValue(contactData.getCompany());
        $(byName("address")).setValue(contactData.getAddress());
        $(byName("home")).setValue(contactData.getHome());
        $(byName("mobile")).setValue(contactData.getMobile());
    }

    private void sumbitContactCreation() {
        $("input:nth-child(87)").click();
    }

    private void returnToMainPage() {
        $(byLinkText("home page")).click();
    }

    private void logout() {
        $(byLinkText("Logout")).click();
    }

}