package ru.ls.qa.school.addressbook.appmanager;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class ApplicationManager {

    private static SessionHelper sessionHelper;

    private static GroupHelper groupHelper;

    private static NavigationHelper navigationHelper;

    private static PageManager pageManager;

    private static ContactHelper contactHelper;

    public static void init() {
        Configuration.browserSize = "968, 1012";
        open("http://localhost/addressbook/");
//        pageManager = new PageManager(this); //А ЕСЛИ ТУТ ДОБАВЛЯТЬ, ТО НАЧИНАЕТ РУГАТЬСЯ
        groupHelper = new GroupHelper();
        navigationHelper = new NavigationHelper();
        sessionHelper = new SessionHelper();
        contactHelper = new ContactHelper();
        sessionHelper.login("admin", "secret");
    }

    public static void stop() {
        sessionHelper.logout();
        closeWebDriver();
    }
//НУЖНО ЛИ ЭТО ТУТ ДОБАВЛЯТЬ ?
//    public static PageManager getPageManager() {
//        return pageManager;
//    }

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
