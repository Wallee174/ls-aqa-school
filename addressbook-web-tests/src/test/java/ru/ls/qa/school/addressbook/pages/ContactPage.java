package ru.ls.qa.school.addressbook.pages;

import ru.ls.qa.school.addressbook.appmanager.ApplicationManager;
import ru.ls.qa.school.addressbook.model.ContactData;

public class ContactPage extends BasePage{

    public ContactPage(ApplicationManager app) {
        super(app);
    }

    public ContactPage clickCrateNewContact() {
        app.getContactHelper().clickCrateNewContact();
        return this;
    }

    public ContactPage fillContactForm(ContactData contactData) {
        app.getContactHelper().fillContactForm(contactData);
        return this;
    }

    public ContactPage submitContactCreation() {
        app.getContactHelper().submitContactCreation();
        return this;
    }

    public ContactPage returnToMainPage() {
        app.getContactHelper().returnToMainPage();
        return this;
    }

    public ContactPage clickSelectContact() {
        app.getContactHelper().clickSelectContact();
        return this;
    }

    public ContactPage clickDeleteContact() {
        app.getContactHelper().clickDeleteContact();
        return this;
    }

    public ContactPage getAlertForDeletion() {
        app.getContactHelper().getAlertForDeletion();
        return this;
    }

    public ContactPage acceptDeletionContact() {
        app.getContactHelper().acceptDeletionContact();
        return this;
    }

    public ContactPage waitApproveDeletionText() {
        app.getContactHelper().waitApproveDeletionText();
        return this;
    }

    public ContactPage clickEditContact() {
        app.getContactHelper().clickEditContact();
        return this;
    }

    public ContactPage updateContactForm(ContactData contactData) {
        app.getContactHelper().updateContactForm(contactData);
        return this;
    }

    public ContactPage clickUpdateContactButton() {
        app.getContactHelper().clickUpdateContactButton();
        return this;
    }

    public ContactPage waitApproveUpdateText() {
        app.getContactHelper().waitApproveUpdateText();
        return this;
    }


}
