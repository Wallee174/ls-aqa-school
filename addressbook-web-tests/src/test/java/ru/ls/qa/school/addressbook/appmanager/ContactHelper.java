package ru.ls.qa.school.addressbook.appmanager;

import ru.ls.qa.school.addressbook.model.ContactData;

import static com.codeborne.selenide.Selectors.*;

public class ContactHelper extends BaseHelper {


    public void clickCrateNewContact() {
        click(byLinkText("add new"));
    }

    public void fillContactForm(ContactData contactData) {
        type(byName("firstname"), contactData.getFirstName());
        type(byName("middlename"), contactData.getMiddleName());
        type(byName("lastname"), contactData.getLastName());
        type(byName("nickname"), contactData.getNickname());
        type(byName("title"), contactData.getTitle());
        type(byName("company"), contactData.getCompany());
        type(byName("address"), contactData.getAddress());
        type(byName("home"), contactData.getHome());
        type(byName("mobile"), contactData.getMobile());
    }

    public void submitContactCreation() {
        click(byCssSelector("input:nth-child(87)"));
    }

    public void returnToMainPage() {
        click(byLinkText("home page"));
    }
}
