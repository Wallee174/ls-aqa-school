package ru.ls.qa.school.addressbook.tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import ru.ls.qa.school.addressbook.appmanager.ApplicationManager;

public class TestBase {
    protected final ApplicationManager app = new ApplicationManager();

    @BeforeAll
    static void setUp() {
        ApplicationManager.init();
    }

    @AfterAll
    static void tearDown() {
        ApplicationManager.stop();
    }

}
