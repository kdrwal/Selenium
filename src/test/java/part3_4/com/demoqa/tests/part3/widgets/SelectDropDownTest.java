package part3_4.com.demoqa.tests.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

import java.util.List;

public class SelectDropDownTest extends BaseTest {

    @Test
    public void testMultiSelectDropDowns() {
        var selectMenuPage = homePage.goToWidgets().clickSelectMenu();
        selectMenuPage.setStandardMultiSelect("Volvo");
        selectMenuPage.setStandardMultiSelect(1);
        selectMenuPage.setStandardMultiSelect("Audi");
        selectMenuPage.setStandardMultiSelect(2);

        selectMenuPage.deselectStandardMulti("saab");
        List<String> actualSelectedOptions =
                selectMenuPage.getAllSelectedStandardMultiOptions();
        Assert.assertTrue(actualSelectedOptions.contains("Volvo"));
        Assert.assertTrue(actualSelectedOptions.contains("Opel"));
        Assert.assertFalse(actualSelectedOptions.contains("Saab"), "\n Saab is selected as an option \n");
        Assert.assertTrue(actualSelectedOptions.contains("Audi"));
    }
}
