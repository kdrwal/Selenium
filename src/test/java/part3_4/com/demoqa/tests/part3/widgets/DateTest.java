package part3_4.com.demoqa.tests.part3.widgets;

import org.testng.Assert;
import org.testng.annotations.Test;
import part3_4.com.demoqa.base.BaseTest;

@Test
public class DateTest extends BaseTest {


    public void  testSelectingDate(){
        String month = "December";
        String monthNumber = "12";
        String day = "31";
        String year = "2034";

        var datePickerPage = homePage.goToWidgets().clickDatePicker();
        datePickerPage.clickSelectDate();
        datePickerPage.selectMonth(month);
        datePickerPage.selectYear(year);
        datePickerPage.clickDay(day);

        String actualDate = datePickerPage.getDate();
        String expectedDate = monthNumber + "/" + day + "/" + year;
        Assert.assertEquals(actualDate, expectedDate, "\n Actual and Expected Dates Do not match "
                + "\n Actual date:   " + actualDate
                + "\n Expected Date: " + expectedDate + "\n");


    }


    public void testSelectingDateTime() {
        String month = "January";
        String year = "2026";
        String day = "22";
        String time = "10:00";

        var datePickerPage = homePage.goToWidgets().clickDatePicker();
        datePickerPage.clickSelectDateAndTime();
        datePickerPage.selectMonthTime(month);
        datePickerPage.selectYearTime(year);
        datePickerPage.clickDay(day);
        datePickerPage.clickTime(time);

        String actualDate = datePickerPage.getDateTime();
        String expectedDate = month + " " + day + ", " + year + " " + time + " AM";
        Assert.assertEquals(actualDate, expectedDate, "\n Actual and expected dates do not match \n");
    }
}
