package ru.ls.qa.school.addressbook.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import ru.ls.qa.school.addressbook.appmanager.ApplicationManager;
import ru.ls.qa.school.addressbook.appmanager.PageManager;
import ru.ls.qa.school.addressbook.pages.ContactPage;
import ru.ls.qa.school.addressbook.pages.GroupPage;

public class TestBase {
    protected final ApplicationManager app = new ApplicationManager();
    protected final PageManager pageManager = new PageManager(app);

    GroupPage groupPage = new GroupPage(app);
    ContactPage contactPage = new ContactPage(app);

    @BeforeAll
    static void setUp() {
        ApplicationManager.init();
    }

    @AfterAll
    static void tearDown() {
        ApplicationManager.stop();
    }

}
