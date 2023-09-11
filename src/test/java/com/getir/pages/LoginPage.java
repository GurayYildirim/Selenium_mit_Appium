package com.getir.pages;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class LoginPage extends BasePage{


    @FindBy(xpath = "//*[@text='username']")
    public AndroidElement usernameInput;

    @FindBy(xpath = "//*[@text='password']")
    public AndroidElement passwordInput;


    @FindBy(xpath = "//*[@text='Submit']")
    public AndroidElement submit;


    @FindBy(xpath = "//*[@text='Dondurma']")
    public AndroidElement dondurma;

    @FindBy(id = "com.getir.casestudy.dev:id/ga_toolbar_getir10GABasketButton")
    public AndroidElement basketBtn;

    @FindBy(className = "android.widget.TextView")
    public List<AndroidElement> menuList;




    public void login(String username,String password) throws InterruptedException {
        //Thread.sleep(20000);

        waitUntil(usernameInput).sendKeys(username);
        passwordInput.sendKeys(password);
        submit.click();
    }
    public AndroidElement waitUntil(AndroidElement element){
        return (AndroidElement) wait.until(ExpectedConditions.visibilityOf(element));
    }
}
