package ru.ls.qa.school.addressbook.pages;

import ru.ls.qa.school.addressbook.appmanager.ApplicationManager;
import ru.ls.qa.school.addressbook.model.GroupData;

public class GroupPage extends BasePage {

    public GroupPage(ApplicationManager app) {
        super(app);
    }

    public GroupPage goToGroupPage() {
        app.getNavigationHelper().goToGroupPage();
        return this;
    }

    public GroupPage clickCreateNewGroup() {
        app.getGroupHelper().clickCreateNewGroup();
        return this;
    }

    public GroupPage fillGroupForm(GroupData groupData) {
        app.getGroupHelper().fillGroupForm(groupData);
        return this;

    }

    public GroupPage submitGroupCreation() {
        app.getGroupHelper().submitGroupCreation();
        return this;
    }

    public GroupPage returnToGroupPage() {
        app.getGroupHelper().returnToGroupPage();
        return this;
    }

    public GroupPage selectGroup() {
        app.getGroupHelper().selectGroup();
        return this;
    }

    public GroupPage deleteSelectedGroups() {
        app.getGroupHelper().deleteSelectedGroups();
        return this;
    }

    public GroupPage clickEditGroup() {
        app.getGroupHelper().clickEditGroup();
        return this;
    }

    public GroupPage updateGroupForm(GroupData groupData) {
        app.getGroupHelper().updateGroupForm(groupData);
        return this;

    }

    public GroupPage clickUpdateButton() {
        app.getGroupHelper().clickUpdateButton();
        return this;
    }

    public GroupPage waitApproveUpdateText() {
        app.getGroupHelper().waitApproveDeletionText();
        return this;
    }

}
