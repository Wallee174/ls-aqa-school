package ru.ls.qa.school.addressbook.appmanager;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class ApplicationManager {

    private static volatile ApplicationManager instance;

    private SessionHelper sessionHelper;

    private GroupHelper groupHelper;

    private NavigationHelper navigationHelper;

    private ContactHelper contactHelper;

    private ApplicationManager() {
        Configuration.browserSize = "968, 1012";
        open("http://localhost/addressbook/");
        groupHelper = new GroupHelper();
        navigationHelper = new NavigationHelper();
        sessionHelper = new SessionHelper();
        contactHelper = new ContactHelper();
        sessionHelper.login("admin", "secret");
    }

    public static ApplicationManager init() {
        if (instance == null) {
            instance = new ApplicationManager();
        }
        return instance;
    }

    public void stop() {
        sessionHelper.logout();
        closeWebDriver();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }

}
