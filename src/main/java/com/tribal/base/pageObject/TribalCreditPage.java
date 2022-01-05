package com.tribal.base.pageObject;


import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://boards.greenhouse.io/tribalcredit")

public class TribalCreditPage extends PageObject {

    @FindBy(id = "board_title")
    public WebElementFacade lbTitle;

    @FindBy(id = "select2-chosen-1")
    public WebElementFacade ddlDepartment;

    @FindBy(id = "select2-chosen-2")
    public WebElementFacade ddlOffice;

}