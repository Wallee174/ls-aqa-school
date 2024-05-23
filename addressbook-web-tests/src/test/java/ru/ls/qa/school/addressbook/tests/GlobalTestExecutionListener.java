package ru.ls.qa.school.addressbook.tests;

import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestPlan;
import ru.ls.qa.school.addressbook.appmanager.ApplicationManager;

public class GlobalTestExecutionListener extends TestBase implements TestExecutionListener {

    @Override
    public void testPlanExecutionStarted(TestPlan testPlan) {
        app = ApplicationManager.init();
        System.out.println("Запускаем тесты. Выполняется GlobalTestExecutionListener.");
    }

    @Override
    public void testPlanExecutionFinished(TestPlan testPlan) {
        app = null;
        System.out.println("Все тесты завершились. Завершается работа GlobalTestExecutionListener.");
    }
}