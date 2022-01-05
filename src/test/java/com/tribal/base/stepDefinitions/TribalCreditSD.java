package com.tribal.base.stepDefinitions;

import com.tribal.base.steps.TribalCreditSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;


public class TribalCreditSD {

    @Steps
    TribalCreditSteps tribalCreditSteps;

    @Given("I want to know if Senior QA Engineer position is available")
    public void iWantToKnowIfSeniorQAEngineerPositionIsAvailable() {
        tribalCreditSteps.navigateToTribalCreditURL();
        tribalCreditSteps.verifyWebLoadsCorrectly();
    }

    @When("filter by Department {string}")
    public void filterByDepartment(String nameDepartment) {
        tribalCreditSteps.clickOnDropDownListDepartment();
        tribalCreditSteps.chooseADepartmentFromDropDownList(nameDepartment);
    }

    @And("filter by Office {string}")
    public void filterByOffice(String nameOffice) {
        tribalCreditSteps.clickOnDropDownListOffice();
        tribalCreditSteps.chooseAnOfficeFromDropDownList(nameOffice);
    }

    @Then("{string} position should be displayed")
    public void PositionShouldBeDisplayed(String jobPosition) {
        tribalCreditSteps.reviewIfJobPositionIsDisplayed(jobPosition);
    }

    @Given("I want to review if this item exists in the list")
    public void iWantToReviewIfThisItemExistsInTheList() {
        tribalCreditSteps.navigateToTribalCreditURL();
        tribalCreditSteps.verifyWebLoadsCorrectly();
    }

    @When("select dropdown list Department")
    public void selectDropdownListDepartment() {
        tribalCreditSteps.clickOnDropDownListDepartment();
    }

    @Then("this {string} should be displayed in the list")
    public void thisShouldBeDisplayedInTheList(String item) {
        tribalCreditSteps.itemShouldBeDisplayed(item);
    }

    @And("this {string} should be clickable")
    public void thisShouldBeClickable(String item) {
        tribalCreditSteps.itemShouldBeClickable(item);
    }

}
