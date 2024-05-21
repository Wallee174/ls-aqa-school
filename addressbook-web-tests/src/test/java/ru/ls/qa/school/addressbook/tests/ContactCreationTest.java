package ru.ls.qa.school.addressbook.tests;

import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbook.model.ContactData;

public class ContactCreationTest extends TestBase {

    @Test
    void contactCreationTest() {
        app.getContactHelper().clickCrateNewContact();
        app.getContactHelper().fillContactForm(new ContactData("Test Name",
                "Test middle name",
                "test last name",
                "test nickname",
                "test title",
                "test company",
                "test address",
                "test home",
                "test mobile 89127742345"));
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToMainPage();
    }


}