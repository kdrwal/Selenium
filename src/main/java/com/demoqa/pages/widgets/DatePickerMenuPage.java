package com.demoqa.pages.widgets;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static utilities.DropDownUtility.selectByVisibleText;
import static utilities.JavaScriptUtility.scrollToElementJS;

public class DatePickerMenuPage extends WidgetsPage {

    private By selectDateField = By.id("datePickerMonthYearInput");
    private By monthDropDown = By.className("react-datepicker__month-select");
    private By yearDropDown = By.cssSelector("react-datepicker__year-select");

    //DatePicker Date And time
    private By selectDateTimeField = By.id("dateAndTimePickerInput");
    private By monthTimeDrop = By.className("react-datepicker__month-read-view");
    private By monthOptions = By.className("react-datepicker__month-option");
    private By yearTimeDrop = By.className("react-datepicker__year-read-view");
    private By yearOptions = By.className("react-datepicker__year-option");

    private By timeValue(String time) {

        return By.xpath("//li[contains(@class, 'react-datepicker__time-list-item')][text()='" + time + "']");
    }


//    private By dayTimeValue(String day) {
//        return By.xpath("//div[contains(@class, 'react-datepicker__day react-datepicker__day--')][text()='" + day + "']");
//    }
    private By dayValue(String day) {
        return By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--')][text()='" + day + "']");
    }

    public void clickTime(String time) {

        click(timeValue(time));
    }
    public void clickDay(String day) {
        click(dayValue(day));
    }

    public boolean isDayInMonth(String day) {
        return find(dayValue(day)).isDisplayed();
    }

    public void clickSelectDate() {
        click(selectDateField);
    }
    //time


    public String getDate() {
        return find(selectDateField).getAttribute("value");
    }

    public void selectMonth(String month) {
        selectByVisibleText(monthDropDown, month);
    }

    public void selectYear(String year) {
        selectByVisibleText(yearDropDown, year);
    }

    public void clickSelectDateAndTime() {
        click(selectDateTimeField);
    }

    public String getDateTime() {
        return find(selectDateTimeField).getAttribute("value");
    }

    public void selectMonthTime(String month) {
        driver.findElement(monthTimeDrop).click();

        List<WebElement> months = driver.findElements(monthOptions);
        for(WebElement monthElement : months) {
            if(monthElement.getText().equals(month)) {
                monthElement.click();
                break;
            }
        }
    }

    public void selectYearTime(String year) {
        driver.findElement(yearTimeDrop).click();

        List<WebElement> years = driver.findElements(yearOptions);
        for(WebElement yearElement : years) {
            if(yearElement.getText().equals(year)) {
                yearElement.click();
                break;
            }
        }
    }
}
