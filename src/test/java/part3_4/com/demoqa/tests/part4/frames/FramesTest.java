package part3_4.com.demoqa.tests.part4.frames;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

@Test
public class FramesTest extends BaseTest {


    public void testFramesBigBox() {
        var framesPage =  homePage.goToAlertsFramesWindowsCard().clickFrames();
        String actualBigBoxText  = framesPage.getTextInBigFrame();
        String expectedBigBoxText = "This is a sample page";
        Assert.assertEquals(actualBigBoxText, expectedBigBoxText, "\n Expected and actual text do not match \n");
        String actualHeaderText = framesPage.getHeaderFramesText();
        String expectedHeaderText = "Frames";
        Assert.assertEquals(actualHeaderText, expectedHeaderText, "\n Actual and expected header text do not match \n");
    }

    public void testFramesSmallBox() {
        var framesPages = homePage.goToAlertsFramesWindowsCard().clickFrames();
        String actualSmallBoxText = framesPages.getTextInSmallFrame();
        String expectedSmallBoxText = "This is a sample page";
        Assert.assertEquals(actualSmallBoxText, expectedSmallBoxText, "\n Actual and expected text do not match \n");
        String actualHeaderText = framesPages.getHeaderFramesText();
        String expectedHeaderText = "Frames";
        Assert.assertEquals(actualHeaderText, expectedHeaderText, "\n Actual and expected header text dont match  \n");
    }
}
