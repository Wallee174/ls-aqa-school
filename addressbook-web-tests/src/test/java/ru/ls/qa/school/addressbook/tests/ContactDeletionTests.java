package ru.ls.qa.school.addressbook.tests;

import org.junit.jupiter.api.Test;

public class ContactDeletionTests extends TestBase {

    @Test
    void contactDeletionTest() {
        pageManager.getContactPage()
                .clickSelectContact()
                .clickDeleteContact()
                .getAlertForDeletion()
                .acceptDeletionContact()
                .waitApproveDeletionText();
    }

}
