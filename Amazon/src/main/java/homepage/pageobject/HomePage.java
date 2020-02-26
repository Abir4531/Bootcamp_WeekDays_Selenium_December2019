package homepage.pageobject;import homepage.webelement.HomePageWebElement;import org.openqa.selenium.Keys;import org.openqa.selenium.OutputType;import org.openqa.selenium.WebElement;import org.openqa.selenium.interactions.Actions;import org.openqa.selenium.support.FindBy;import org.openqa.selenium.support.How;public class HomePage extends HomePageWebElement {    @FindBy(how = How.XPATH, using = HomePageWebElement.xPSearchElementBar)    public static WebElement SearchElementBar;    public static WebElement getSearchElementBar() {        return SearchElementBar;    }    public static void clickSearchElementBar() {        getSearchElementBar().sendKeys("iPhone 11"); }    @FindBy(how = How.XPATH, using = HomePageWebElement.xPSearchElementButton)    public static WebElement SearchButton;    public static WebElement getSearchButton() { return SearchButton; }    public static void clickSearchElementButton() {        getSearchButton().click();    }    @FindBy(how = How.XPATH, using = HomePageWebElement.xPSearchElementHamBurger)    public static WebElement HamBurgerButton;    public static WebElement getHamBurgerButton() {        return HamBurgerButton;    }    public static void clickSearchElementHamBurger() {        getHamBurgerButton().click();    }    @FindBy(how = How.XPATH, using = HomePageWebElement.xPAccountAndListArrow)    public static WebElement AccountAndListArrow;    public static WebElement getAccountAndListArrow() {        return AccountAndListArrow;    }    public void setAccountAndListArrow() {        mouseHoverByXpath(xPAccountAndListArrow); }    @FindBy(how = How.XPATH, using = HomePageWebElement.xPChangeLanguage)    public static WebElement ChangeLanguage;    public static WebElement getChangeLanguage() { return ChangeLanguage; }    public void setChangeLanguage() {        Actions actions = new Actions(driver);        actions.moveToElement(getChangeLanguage()).perform(); }    @FindBy(how = How.XPATH, using = HomePageWebElement.xPLanguageEspanish)    public static WebElement LanguageEspanish;    public static WebElement getLanguageEspaish() { return LanguageEspanish; }    @FindBy(xpath = xPSignInOtpContineButton)   public static WebElement SignInOtpContineButton;    public static WebElement getSignInOtpContineButton() {        return SignInOtpContineButton;    }    public static void setSignInOtpContineButton() {        getSignInOtpContineButton().click();    }    @FindBy(how = How.XPATH, using = HomePageWebElement.xPDropDownBox)    public static WebElement dropDownBox;    public static WebElement getDropDownBox() {        return dropDownBox;    }    //Todays Deal method    @FindBy(how = How.XPATH, using = HomePageWebElement.xPTodaysDeal)    public static WebElement todaysDeal;    public static WebElement getTodaysDeal() { return todaysDeal; }     public static void setTodaysDeal(){  getTodaysDeal().click(); }    @FindBy(how = How.XPATH, using = HomePageWebElement.xPTodaysDealDepAmazonDevice)    public static WebElement todaysDealDepAmazonDevice;    public static WebElement getTodaysDealDepAmazonDevice() { return todaysDealDepAmazonDevice;}    public static void setTodaysDealDepAmazonDevice(){        getTodaysDealDepAmazonDevice().click();    }    //get Text    @FindBy(how = How.XPATH, using = HomePageWebElement.xPHeaderGetText)    public  WebElement headerGetText;    public  WebElement getHeaderGetText() { return headerGetText;}    public  void setHeaderGetText(){        getTextByWebElement(getHeaderGetText());        System.out.println("© 1996-2020, Amazon.com, Inc. or its affiliates");        assertCheck("© 1996-2020, Amazon.com, Inc. or its affiliates",                "© 1996-2020, Amazon.com, Inc. or its affiliates");    }    //tabhandle    @FindBy( xpath = xPAddFeedback)    public static WebElement addFeedback;    public static WebElement getAddFeedback() { return addFeedback;}    public static void setAddFeedback(){        getAddFeedback().click();    }    @FindBy( xpath = xPAddFeedbackCancel)    public static WebElement addFeedbackCancel;    public static WebElement getAddFeedbackCancel() { return addFeedbackCancel;}    public static void setAddFeedbackCancel(){        getAddFeedbackCancel().click();    }    //tabHandle    @FindBy( xpath = xPEuUsPrivacy)    public static WebElement EuUsPrivacy;    public static WebElement getEuUsPrivacy() { return EuUsPrivacy;}    public static void setEuUsPrivacy(){        getEuUsPrivacy().click();    }    @FindBy(how = How.XPATH, using = HomePageWebElement.xPSignInButton)    public static WebElement SignInButton;    public static WebElement getSignInButton() { return SignInButton; }    public static void setSignInButton() { getSignInButton().click();  }    @FindBy(xpath = xPInputEmailField)    public static WebElement emailField;    public static WebElement getEmailField() { return emailField;}    @FindBy(xpath = xPInputPasswordField)    public static WebElement signInputPasswordField;    public static WebElement getInputPasswordField() { return signInputPasswordField; }    @FindBy(xpath = xPSignInContinueButton)    public static WebElement signInContinueButton;    public static WebElement getSignInContinueButton() { return signInContinueButton; }    public static void setSignInContinueButton() {  getSignInContinueButton().click();    }    @FindBy(xpath = xPSignInSubmitButton)    public static WebElement SignInSubmitButton;    public static WebElement getSignInSubmitButton() { return SignInSubmitButton;  }    public static void setSignInSubmitButton() { getSignInSubmitButton().click();  }    @FindBy(xpath = xPSignInNeedHelpButton)    public static WebElement SignInNeedHelpButton;    public static WebElement getSignInNeedHelpButton() {        return SignInNeedHelpButton; }    public static void setSignInNeedHelpButton() {        getSignInNeedHelpButton().click(); }    @FindBy(xpath = xPSignInYourGarage)    public static WebElement SignInYourGarage;    public static WebElement getSignInYourGarage() {        return SignInYourGarage;    }    public static void setSignInYourGarage() {        getSignInYourGarage().click();    }    @FindBy(xpath = xPSignInYourGaragePartsHover)    public static WebElement SignInYourGaragePartsHover;    public static void setSignInYourGaragePartsHover() {        mouseHoverByXpath(xPSignInYourGaragePartsHover);    }    @FindBy(xpath = xPSignInYourGarageAccessoriesHover)    public static WebElement SignInYourGarageAccessoriesHover;    public static void setSignInYourGarageAccessoriesHover() {        mouseHoverByXpath(xPSignInYourGarageAccessoriesHover);    }    @FindBy(xpath = xPSignInYourGarageToolsHover)    public static WebElement SignInYourGarageToolsHover;    public static void setSignInYourGarageToolsHover() {        mouseHoverByXpath(xPSignInYourGarageToolsHover);    }    @FindBy(xpath = xPSignInYourGarageCarCareHover)    public static WebElement SignInYourGarageCarCareHover;    public static void setSignInYourGarageCarCareHover() {        mouseHoverByXpath(xPSignInYourGarageCarCareHover);    }    @FindBy(xpath = xPSignInYourMotorCyclePartsHover)    public static WebElement SignInYourMotorCyclePartsHover;    public static void setSignInYourMotorCyclePartsHover() {        mouseHoverByXpath(xPSignInYourMotorCyclePartsHover);    }    @FindBy(xpath = xPSignInYourTruckHover)    public static WebElement SignInYourTruckHover;    public static void setSignInYourTruckHover() {        mouseHoverByXpath(xPSignInYourTruckHover);    }    @FindBy(xpath = xPSignInYourRvHover)    public static WebElement SignInYourRvHover;    public static void setSignInYourRvHover() {        mouseHoverByXpath(xPSignInYourRvHover);    }    @FindBy(xpath = xPSignInYourTiresWheelsHover)    public static WebElement SignInYourTiresWheelsHover;    public static void setSignInYourTiresWheelsHover() {        mouseHoverByXpath(xPSignInYourTiresWheelsHover);    }    public static void bddBrowserOpen(){        getLocalDriver("windows","chrome");        driver.manage().window().maximize();        driver.get("https://www.amazon.com/");    }}