package ru.ls.qa.school.addressbook.appmanager;

import static com.codeborne.selenide.Selectors.*;

public class SessionHelper extends BaseHelper {

    public void login(String username, String password) {
        type(byName("user"), username);
        type(byName("pass"), password);
        click(byCssSelector("input:nth-child(7)"));
    }

    public void logout() {
        click(byLinkText("Logout"));
    }
}
