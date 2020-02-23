package homepage.webelement;

import common.WebAPI;

public class HomePageWebElement extends WebAPI {

    public static final String xPSearchElementBar="//input[@id='twotabsearchtextbox']";
    public static final String xPSearchElementButton="//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']";
    public static final String xPSearchElementHamBurger="//i[@class='hm-icon nav-sprite']";
    public static final String xPAccountAndListArrow="//a[@id='nav-link-accountList']//span[@class='nav-icon nav-arrow']";
    //Language
    public static final String xPChangeLanguage="//span[@class='icp-nav-link-inner']//span[@class='nav-icon nav-arrow']";

    public static final String xPLanguageEspanish="//*[@id=\"nav-flyout-icp\"]/div[2]/a[1]/span";
    public static final String xpFullLocation="/html/body/div[1]/header/div/div[2]/div[1]/div/span/a/div[1]";
    public static final String xPLocationDone="//button[@name='glowDoneButton']";
    public static final String xPDropDownBox="//select[@id='searchDropdownBox']";
    public static final String xPSignInOtpContineButton="//input[@id='continue']";

    //Todays deal
    public static final String xPTodaysDeal="/html[1]/body[1]/div[1]/header[1]/div[1]/div[2]/div[3]/div[2]/div[1]/a[1]";
    public static final String xPTodaysDealDepAmazonDevice="//*[@id=\"widgetFilters\"]/div[1]/div[2]/span[1]/div/label/input";

    //Get text
    public static final String xPHeaderGetText="//div[@id='nav-xshop']";
    //amazonBasic
    public static final String xPAmazonBasics="//a[contains(text(),'AmazonBasics')]";
    //AddFeed back
    public static final String xPAddFeedback="//span[@id='ad-feedback-text-right-2']";
    public static final String xPAddFeedbackCancel="/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/span[2]/span[1]/input[1]";
    //tabHandle
    //footer condition button
    public static final String xPConditionOfUse="//*[@id=\"a-page\"]/div[1]/div[4]/div[2]/a[1]";
    public static final String xPEuUsPrivacy="//a[contains(text(),'EU-US Privacy Shield')]";

    public static final String xPSignInButton="//*[@id=\"nav-flyout-ya-signin\"]/a/span";
    public static final String xPInputEmailField="//input[@id='ap_email']";
    public static final String xPSignInContinueButton="//input[@id='continue']";
    public static final String xPInputPasswordField="//*[@id=\"ap_password\"]";
    public static final String xPSignInSubmitButton="//*[@id=\"signInSubmit\"]";
    public static final String xPSignInNeedHelpButton="//span[@class='a-expander-prompt']";
    public static final String xPSignInYourGarage="//span[contains(text(),'Your Garage')]";

    //Amazon Garage
    public static final String xPSignInYourGaragePartsHover="//div[@id='nav-subnav']//a[5]//span[2]";
    public static final String xPSignInYourGarageAccessoriesHover="//a[6]//span[2]";
    public static final String xPSignInYourGarageToolsHover="//a[7]//span[2]";
    public static final String xPSignInYourGarageCarCareHover="//a[8]//span[2]";
    public static final String xPSignInYourMotorCyclePartsHover="//a[9]//span[2]";
    public static final String xPSignInYourTruckHover="//a[10]//span[2]";
    public static final String xPSignInYourRvHover="//a[11]//span[2]";
    public static final String xPSignInYourTiresWheelsHover="//a[12]//span[2]";




}
