package com.getir.pages;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends BasePage{
    @FindBy(xpath = "//*[@text='There is no result']")
    public AndroidElement basketText;

    @FindBy(id = "com.getir.casestudy.dev:id/ga_toolbar_leftIconImageView")
    public AndroidElement backBtn;

    @FindBy(id="com.getir.casestudy.dev:id/btnAdd")
    public AndroidElement addItem;

    @FindBy(id="com.getir.casestudy.dev:id/tvTotalTitle")
    public AndroidElement total;

    public void getCategory(String categoryName){
        driver.findElement(By.xpath("//*[@text='"+categoryName+"']")).click();
    }
}
