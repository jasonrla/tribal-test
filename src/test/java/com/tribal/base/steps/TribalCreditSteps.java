package com.tribal.base.steps;

import com.tribal.base.pageObject.TribalCreditPage;
import net.thucydides.core.annotations.Step;
import org.jruby.RubyProcess;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class TribalCreditSteps {

    private TribalCreditPage tribalCreditPage;

    @Step
    public void navigateToTribalCreditURL() {
        tribalCreditPage.open();
    }

    public void verifyWebLoadsCorrectly() {
        tribalCreditPage.lbTitle.shouldBeVisible();
    }

    public List<WebElement> getElementsFromDropDownList(){
        List<WebElement> totalElements = getDriver().findElements(By.className("select2-result-label"));
        return totalElements;
    }

    public void selectElementFromList(String valueOfList) {
        List<WebElement> allElements = getElementsFromDropDownList();
        for (WebElement of : allElements) {
            if (of.getText().contains(valueOfList)) {
                WebElement oneElement = getDriver().findElement(By.id(of.getAttribute("id")));
                oneElement.click();
                break;
            }
        }
    }
    public void clickOnDropDownListDepartment() {
        tribalCreditPage.ddlDepartment.click();
    }

    public void chooseADepartmentFromDropDownList(String nameDepartment) {
        getElementsFromDropDownList();
        selectElementFromList(nameDepartment);
    }

    public void clickOnDropDownListOffice() {
        tribalCreditPage.ddlOffice.click();
    }

    public void chooseAnOfficeFromDropDownList(String nameOffice) {
        getElementsFromDropDownList();
        selectElementFromList(nameOffice);
    }

    public void reviewIfJobPositionIsDisplayed(String jobPosition) {
        List<WebElement> elements = getDriver().findElements(By.className("opening"));
        for (WebElement e : elements) {
            if (!e.getText().isEmpty() && e.getText().contains(jobPosition)) {
                Assert.assertTrue(e.getText().contains(jobPosition));
            }
        }
    }


    public void itemShouldBeDisplayed(String item) {
        List<WebElement> allElements = getElementsFromDropDownList();
        for (WebElement e : allElements) {
            if (e.getText().contains(item)) {
                Assert.assertTrue(e.getText().contains(item));
            }
        }
    }

    public void itemShouldBeClickable(String item) {
        List<WebElement> allElements = getElementsFromDropDownList();
        System.out.println(item);
        for (WebElement e : allElements) {
            if (e.getText().contains(item)) {
                Assert.assertTrue(e.getText().contains(item));
            }
        }
    }
}
