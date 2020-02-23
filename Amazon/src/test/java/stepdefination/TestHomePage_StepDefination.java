package stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import testhomepage.TestHomePage;

import java.io.IOException;

public class TestHomePage_StepDefination extends TestHomePage {
    @Given("I am at amazon.com")
    public void i_am_at_amazon_com() {
    getLocalDriver("windows","chrome");
    driver.manage().window().maximize();
    driver.get("https://www.amazon.com/");
    }

//Test 1

    @Given("I am Searching iPhone11")
    public void i_am_Searching_iPhone11() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        testSearchButton();
    }
    @Then("I am going back to Home")
    public void i_am_going_back_to_Home() {
        // Write code here that turns the phrase above into concrete actions
        driver.close();
    }
//Test 2
    @Given("I am on Todays Deal page")
    public void i_am_on_Todays_Deal_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        ClickTodaysDeal();
    }

    @Then("I am on Amazon Device page")
    public void i_am_on_Amazon_Device_page()  {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("I am on using Radio button of Amazon Device page")
    public void i_am_on_using_Radio_button_of_Amazon_Device_page() {
        // Write code here that turns the phrase above into concrete actions
        driver.close();
    }
//Test 3
    @Given("I am Hovering mouse on Account&List")
    public void i_am_Hovering_mouse_on_Account_List() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        testSignInWithRightNumberRightPassword();
    }
    @Given("I am clicking Sign in button")
    public void i_am_clicking_Sign_in_button() {
        // Write code here that turns the phrase above into concrete actions
    }
    @Then("And Inputting email and password")
    public void and_Inputting_email_and_password() {
        // Write code here that turns the phrase above into concrete actions
     driver.close();
    }

//Test 4

   @Given("I am on Amazon Garage page")
    public void i_am_on_Amazon_Garage_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
       doSignInYourGarageInHover();
    }

    @Then("Hovering one by one Each tab")
    public void hovering_one_by_one_Each_tab() {
        // Write code here that turns the phrase above into concrete actions
        driver.close();
    }

//Test 5
@Given("I am on Amazon Footer page")
public void i_am_on_Amazon_Footer_page() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    testFooterGetText();
    }

    @Then("Get the text from the Footer Licence")
    public void get_the_text_from_the_Footer_Licence() {
        // Write code here that turns the phrase above into concrete actions
     driver.close();
    }
//Test6

    @Given("I am Scrolling down")
    public void i_am_Scrolling_down() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        testFooterGetTextAssertion();
    }

    @Then("Get text and Assert it Footer Licence")
    public void get_text_and_Assert_it_Footer_Licence() {
        // Write code here that turns the phrase above into concrete actions
        driver.close();
    }
//Test 7

    @Given("Right Click from the mouse")
    public void right_Click_from_the_mouse() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        testRightClickMouse();
    }

    @Then("Then close the browser")
    public void then_close_the_browser() {
        // Write code here that turns the phrase above into concrete actions
        driver.close();
    }

    //Test 8
    @Given("I am Clicking feedback button")
    public void i_am_Clicking_feedback_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        testAddFeedback();
    }

    @Then("I am clicking the cancel button")
    public void i_am_clicking_the_cancel_button() {
        // Write code here that turns the phrase above into concrete actions
        driver.close();
    }


    //Test 9
    @Given("I am hovering AccountAndListArray")
    public void i_am_hovering_AccountAndListArray() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        TabHandling();
    }

    @Given("I am going sign in page")
    public void i_am_going_sign_in_page() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("Opening new tab called Condition use")
    public void opening_new_tab_called_Condition_use() {
        // Write code here that turns the phrase above into concrete actions
        driver.close();
    }

    //TEst 10
    @Given("I am Changing to spanish language")
    public void i_am_Changing_to_spanish_language() throws IOException, InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        testChangeLanguage();
    }

    @Given("I am taking screenShoot")
    public void i_am_taking_screenShoot() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("Browser close")
    public void browser_close() {
        // Write code here that turns the phrase above into concrete actions
        driver.close();
    }




}
