package ru.ls.qa.school.addressbook.tests;

import org.junit.jupiter.api.Test;
import ru.ls.qa.school.addressbook.model.GroupData;

public class GroupUpdateTests extends TestBase {

    @Test
    public void groupUpdateTest() {
        pageManager.getGroupPage()
                .goToGroupPage()
                .selectGroup()
                .clickEditGroup()
                .updateGroupForm(new GroupData(
                        "Update Name",
                        "Update Header",
                        "Update footer"))
                .clickUpdateButton()
                .waitApproveUpdateText();
    }
}
