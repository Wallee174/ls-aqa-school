package ru.ls.qa.school.addressbook.tests;

import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbook.model.ContactData;

public class ContactUpdateTests extends TestBase {


    @Test
    void contactUpdateTest() {
        pageManager.getContactPage()
                .clickSelectContact()
                .clickEditContact()
                .updateContactForm(new ContactData(
                        "Update FirstName",
                        "Update MiddleName",
                        "Update LastName",
                        "Update NickName",
                        "Update Title",
                        "Update Company",
                        "Update address",
                        "Update Home",
                        "Update mobile 899"))
                .clickUpdateContactButton()
                .waitApproveUpdateText();
    }
}
