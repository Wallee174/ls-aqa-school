package ru.ls.qa.school.addressbook.tests;

import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbook.model.GroupData;


public class GroupCreationTests extends TestBase {

    @Test
    void groupCreationTests() {
        app.getNavigationHelper().goToGroupPage();
        app.getGroupHelper().clickCreateNewGroup();
        app.getGroupHelper().fillGroupForm(new GroupData("Test group2", "Test header", "Test footer"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupPage();
    }

}
