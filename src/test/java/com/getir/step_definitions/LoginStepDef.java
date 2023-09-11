package com.getir.step_definitions;

import com.getir.pages.BasePage;

import com.getir.pages.BasketPage;
import com.getir.pages.LoginPage;

import com.getir.utilities.ScrollHelper;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginStepDef {
    LoginPage loginpage = new LoginPage();
    BasketPage basketpage = new BasketPage();

    @Given("User open the getir app and enters {string} and {string}")
    public void userOpenTheGetirAppAndEntersAnd(String username, String password) throws InterruptedException {
        loginpage.login(username, password);
    }

    @Then("User login successfully")
    public void user_login_successfully() {
        loginpage.waitUntil(loginpage.dondurma);
        String actualText = loginpage.dondurma.getText();
        String expectedText = "Dondurma";
        Assert.assertEquals(expectedText, actualText);

    }


    @And("User clicks basket button")
    public void userClicksBasketButton() {
        loginpage.basketBtn.click();
    }

    @Then("User verify that basket is empty  and able to see {string}")
    public void userVerifyThatBasketIsEmptyAndAbleToSee(String expectedText) {
        Assert.assertEquals(expectedText, basketpage.basketText.getText());
        basketpage.backBtn.click();
    }

    @Then("User able to see all menu list in console and verify that is {int}")
    public void userAbleToSeeAllMenuListInConsoleAndVerifyThatIs(int expectedSize) {
        loginpage.waitUntil(loginpage.dondurma);
        int actualSize = loginpage.menuList.size();
        Assert.assertEquals(expectedSize, actualSize);
    }

    @And("User clicks second category which is {string}")
    public void userClicksSecondCategoryWhichIs(String categoryName) {
        basketpage.getCategory(categoryName);
    }

    @And("User adds two different items")
    public void userAddsTwoDifferentItems() {
        basketpage.addItem.click();
        basketpage.addItem.click();


    }

    @And("User scroll down to {string}")
    public void userScrollDownTo(String itemText) {
        new ScrollHelper().scrollVerticalHelper(itemText);
    }

    @Then("User verify that {string}")
    public void userVerifyThat(String expectedAmount) {
        String actualAmount=basketpage.total.getText();
        Assert.assertEquals(expectedAmount, actualAmount);
    }
}
