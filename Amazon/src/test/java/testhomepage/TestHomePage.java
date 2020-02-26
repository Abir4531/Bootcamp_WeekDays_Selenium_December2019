package testhomepage;

import homepage.pageobject.HomePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestHomePage extends HomePage{
    public void getInitElements(){
        PageFactory.initElements(driver, HomePage.class);
    }

    @Test(priority = 1)
    public void testSearchButton() throws InterruptedException {
        getInitElements();
        clickSearchElementBar();
        clickSearchElementButton();
        sleepFor(2);
        navigateBack();sleepFor(2);
    }
    @Test(priority = 2)
    public void ClickTodaysDeal() throws InterruptedException {
        getInitElements();
        sleepFor(2);
        setTodaysDeal();
        scrollUpDown(200);
        sleepFor(2);
        setTodaysDealDepAmazonDevice();sleepFor(1);

    }
    @Test(priority = 3)
    public void testSignInWithRightNumberRightPassword() throws InterruptedException {
        getInitElements();
        setAccountAndListArrow(); sleepFor(1);
        setSignInButton(); sleepFor(1);
        getEmailField().sendKeys("abirhossan08@gmail.com"); sleepFor(2);
        setSignInContinueButton();   sleepFor(2);
        getInputPasswordField().sendKeys("594531"); sleepFor(2);
        setSignInSubmitButton(); sleepFor(2);
        setSignInOtpContineButton(); sleepFor(1);
    }
    @Test(priority = 4)
    public void doSignInYourGarageInHover() throws InterruptedException {
        getInitElements();
        setAccountAndListArrow();         sleepFor(2);
        setSignInYourGarage();              sleepFor(2);
        setSignInYourGaragePartsHover();      sleepFor(2);
        setSignInYourGarageAccessoriesHover();  sleepFor(2);
        setSignInYourGarageToolsHover();         sleepFor(2);
        setSignInYourGarageCarCareHover();        sleepFor(2);
        setSignInYourMotorCyclePartsHover();       sleepFor(2);
        setSignInYourTruckHover();                  sleepFor(2);
        setSignInYourRvHover();                      sleepFor(2);
        setSignInYourTiresWheelsHover();              sleepFor(2);
        navigateBack();sleepFor(2);
    }
    @Test(priority = 5)
    public void testFooterGetText() throws InterruptedException {
        getInitElements();
        scrollUpDown(6000);
        setHeaderGetText();sleepFor(2);
    }
    @Test(priority = 6 )
    public void testFooterGetTextAssertion() throws InterruptedException {
        getInitElements();
        scrollUpDown(6000);
        setHeaderGetText();sleepFor(2);
    }
    @Test(priority = 7 )
    public void testRightClickMouse() throws InterruptedException {
        getInitElements();
        rightClickMouse(xPAmazonBasics);

    }
    @Test(priority = 8 )
    public void testAddFeedback() throws InterruptedException {
    getInitElements();
    setAddFeedback();
    setAddFeedbackCancel();sleepFor(2);

    }

   @Test(priority = 9)
    public void TabHandling() throws InterruptedException {
        getInitElements();
        setAccountAndListArrow();
        sleepFor(1);
        setSignInButton();
        sleepFor(1);
        setSignInNeedHelpButton();
        clickOnElement(xPConditionOfUse);
        handleNewTab(driver);
        setEuUsPrivacy();
    }
    @Test(priority = 10)
    public void testChangeLanguage() throws InterruptedException, IOException {
        getInitElements();
        setChangeLanguage();
        getLanguageEspaish().click();
        sleepFor(2);
        getSearchButton().getScreenshotAs(OutputType.FILE);sleepFor(1);
    }


    }
