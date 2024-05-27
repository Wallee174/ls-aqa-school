package ru.ls.qa.school.addressbook.appmanager;

import org.openqa.selenium.support.ui.ExpectedCondition;
import ru.ls.qa.school.addressbook.model.ContactData;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

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
    public void clickSelectContact() {
        click(byName("selected[]"));
    }

    public void clickDeleteContact() {
        click(byValue("Delete"));
    }

    public boolean getAlertForDeletion() {
        return switchTo().alert().getText().contains("Delete 1 addresses?");
    }

    public void acceptDeletionContact() {
        switchTo().alert().accept();
    }

    public void waitApproveDeletionText() {
        checkValue(".msgbox", "Record successful deleted");
    }

    public void clickEditContact() {
        click(byTitle("Edit"));
    }

    public void updateContactForm(ContactData contactData) {
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

    public void clickUpdateContactButton() {
        click(byName("update"));
    }

    public void waitApproveUpdateText() {
        checkValue(".msgbox", "Address book updated");
    }
}
