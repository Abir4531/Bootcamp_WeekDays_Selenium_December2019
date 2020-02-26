package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import testhomepage.TestHomepage;

import java.io.IOException;

public class HomePageStepDefinition extends TestHomepage {

    @Given("To load application url")
    public void toLoadApplicationUrl() {
    bddBrowser();
    }

    @When("I click on radio button")
    public void iClickOnRadioButton() throws InterruptedException {
        clickOnRadioButton();
    }

    @Then("I wait for page to load")
    public void iWaitForPageToLoad() {
        String Actual = driver.getCurrentUrl();
        Assert.assertEquals(Actual,"https://learn.letskodeit.com/p/practice");
    }

    @Then("I close browser")
    public void ICloseBrowser() {
        driver.quit();
    }


    @Given("I click on the test button")
    public void iClickOnTheTestButton() throws InterruptedException {
        clickOnCheckButton();

    }

    @Given("I am taking screen shoot")
    public void iAmTakingScreenShoot() throws IOException, InterruptedException {
        takeScreenShootTaken();
    }


    @Given("I am opening new Window")
    public void iAmOpeningNewWindow() throws InterruptedException {
        newWindowOpen();
    }

    @Given("I am closing the new tab")
    public void iAmClosingTheNewTab() throws InterruptedException {
        newWindowOpen1();
    }

    @Given("I am handling the alert")
    public void iAmHandlingTheAlert() throws InterruptedException {
        alertHandleAccept();
    }

    @Given("I Cancel the alert handling")
    public void iCancelTheAlertHandling() throws InterruptedException {
        alertHandleCancle();
    }

    @Given("I getting the table to console")
    public void iGettingTheTableToConsole() throws InterruptedException {
        getTable();
    }

    @Given("I am using mouse hovering")
    public void iAmUsingMouseHovering() throws InterruptedException {
        mouseHover();
    }


    @Given("I using iframe then searching on there")
    public void iUsingIframeThenSearchingOnThere() throws IOException, InterruptedException {
        testIFrame();
    }
}
