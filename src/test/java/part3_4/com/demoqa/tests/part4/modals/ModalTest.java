package part3_4.com.demoqa.tests.part4.modals;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

public class ModalTest extends BaseTest {

    @Test
    public void testModalDialog(){
        var afwPage = homePage.goToAlertsFramesWindowsCard();
        var modalDialogPage = afwPage.clickModalDialogs();
        modalDialogPage.clickSmallModalButton();
        String actualText = modalDialogPage.getSmallModalText();
        Assert.assertTrue(actualText.contains("small modal"), "\n The Message Does Not Contain 'small modal' \n");
        modalDialogPage.clickCloseButton();
    }
}
