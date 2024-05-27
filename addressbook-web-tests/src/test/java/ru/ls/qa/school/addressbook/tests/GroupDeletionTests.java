package ru.ls.qa.school.addressbook.tests;

import org.junit.jupiter.api.Test;

public class GroupDeletionTests extends TestBase {

    @Test
    public void testGroupDeletion() {
        pageManager.getGroupPage()
                .goToGroupPage()
                .selectGroup()
                .deleteSelectedGroups()
                .returnToGroupPage();
    }

}
