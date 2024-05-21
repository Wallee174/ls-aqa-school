package ru.ls.qa.school.addressbook.appmanager;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BaseHelper {
    protected static void type(By locator, String text) {
        $(locator).setValue(text);
    }

    protected static void click(By locator) {
        $(locator).click();
    }
}
