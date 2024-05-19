package ru.ls.qa.school.addressbook.appmanager;

import static com.codeborne.selenide.Selectors.byLinkText;

public class NavigationHelper extends BaseHelper {
    public void goToGroupPage() {
        click(byLinkText("groups"));
    }
}
