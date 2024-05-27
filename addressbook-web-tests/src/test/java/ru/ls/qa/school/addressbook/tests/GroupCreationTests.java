package ru.ls.qa.school.addressbook.tests;

import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbook.model.GroupData;


public class GroupCreationTests extends TestBase {

    @Test
    void groupCreationTests() {
        pageManager.getGroupPage()
                .goToGroupPage()
                .clickCreateNewGroup()
                .fillGroupForm(new GroupData(
                        "Test group2",
                        "Test header",
                        "Test footer"))
                .submitGroupCreation()
                .returnToGroupPage();
    }

}
