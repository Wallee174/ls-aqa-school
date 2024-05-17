package ru.ls.qa.school.addressbook;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.*;


public class GroupCreationTests {

    @BeforeAll
    static void setUp() {
        Configuration.browserSize = "968, 1012";
    }

    @AfterAll
    static void tearDown() {
        closeWebDriver();
    }

    @Test
    void groupCreationTests() {
        open("http://localhost/addressbook/");
        login("admin", "secret");
        goToGroupPage();
        clickCreateNewGroup();
        fillGroupForm(new GroupData("Test group2", "Test header", "Test footer"));
        submitGroupCreation();
        returnToGroupPage();
        logout();
    }

    private void login(String username, String password) {
        $(byName("user")).click();
        $(byName("user")).setValue(username);
        $(byName("pass")).setValue(password);
        $("input:nth-child(7)").click();
    }

    private void goToGroupPage() {
        $(byLinkText("groups")).click();
    }

    private void clickCreateNewGroup() {
        $(byName("new")).click();
    }

    private void fillGroupForm(GroupData groupData) {
        $(byName("group_name")).setValue(groupData.getName());
        $(byName("group_header")).click();
        $(byName("group_header")).setValue(groupData.getHeader());
        $(byName("group_footer")).click();
        $(byName("group_footer")).setValue(groupData.getFooter());
    }

    private void submitGroupCreation() {
        $(byName("submit")).click();
    }

    private void returnToGroupPage() {
        $(byLinkText("group page")).click();
    }

    private void logout() {
        $(byLinkText("Logout")).click();
    }

}
