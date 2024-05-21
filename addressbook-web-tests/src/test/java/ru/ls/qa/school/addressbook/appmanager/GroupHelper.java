package ru.ls.qa.school.addressbook.appmanager;

import ru.ls.qa.school.addressbook.model.GroupData;

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
}
