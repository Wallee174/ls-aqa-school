package ru.ls.qa.school.addressbook.appmanager;

import ru.ls.qa.school.addressbook.model.GroupData;
import ru.ls.qa.school.addressbook.pages.ContactPage;

import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byName;

public class GroupHelper extends BaseHelper {

    public void deleteSelectedGroups() {
        click(byName("delete"));
    }

    public void selectGroup() {
        click(byName("selected[]"));
    }

    public void clickCreateNewGroup() {
        click(byName("new"));
    }

    public void fillGroupForm(GroupData groupData) {
        type(byName("group_name"), groupData.getName());
        type(byName("group_header"), groupData.getHeader());
        type(byName("group_footer"), groupData.getFooter());
    }

    public void submitGroupCreation() {
        click(byName("submit"));
    }

    public void returnToGroupPage() {
        click(byLinkText("group page"));
    }

    public void clickEditGroup() {
        click(byName("edit"));
    }

    public void clickUpdateButton() {
        click(byName("update"));
    }

    public void updateGroupForm(GroupData groupData) {
        type(byName("group_name"), groupData.getName());
        type(byName("group_header"), groupData.getHeader());
        type(byName("group_footer"), groupData.getFooter());
    }

    public void waitApproveDeletionText() {
        checkValue(".msgbox", "Group record has been updated.");
    }

}
