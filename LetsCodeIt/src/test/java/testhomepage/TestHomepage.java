package testhomepage;

import Home.PageObject.HomePage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestHomepage extends HomePage {
    static HomePage pc;

    public static void getInElement() {
        pc=PageFactory.initElements(driver, HomePage.class);
    }

    @Test(priority = 1)
    public static void clickOnRadioButton() throws InterruptedException {
        getInElement();
        sleepFor(2);
        clickRadioButton();
        sleepFor(2);
    }
    @Test(priority = 2)
    public static void clickOnCheckButton() throws InterruptedException {
        getInElement();
        sleepFor(2);
        checkButton();
        sleepFor(3);
    }
    @Test(priority = 3)
    public static void takeScreenShootTaken() throws InterruptedException, IOException {
        getInElement();
        sleepFor(2);
        screenShot();
        sleepFor(3);
    }
    @Test(priority = 4)
    public static void newWindowOpen() throws InterruptedException {
        getInElement();
        sleepFor(2);
        newTabOpen();
        handleNewTab(driver).close();
        sleepFor(3);
    }
    @Test(priority = 5)
    public static void newWindowOpen1() throws InterruptedException {
        getInElement();
        sleepFor(2);
        newTabOpen1();
        handleNewTab(driver).close();
        sleepFor(3);
    }
    @Test(priority = 6)
    public static void alertHandleAccept() throws InterruptedException {
        getInElement();
        sleepFor(2);
        alertNewHandle();
        sleepFor(2);
        okAlert();
    }
    @Test(priority = 7)
    public static void alertHandleCancle() throws InterruptedException {
        getInElement();
        sleepFor(2);
        alertNewHandle();
        sleepFor(2);
        cancelAlert();
    }
    @Test(priority = 8)
    public static void getTable() throws InterruptedException {
        getInElement();
        sleepFor(2);
        scrollUpDown(2500);
        getListOfWebElementsByXpath(webElemetTable);
        sleepFor(2);
    }
    @Test(priority = 9)
    public static void mouseHover() throws InterruptedException {
        getInElement();
        sleepFor(2);
        mouseHoverByXpath(webElemetMouseHover);
        sleepFor(2);
    }

    @Test(priority = 10)
    public void testIFrame() throws IOException, InterruptedException {
        getInElement();
        scrollUpDown(3990);
        iframeHandle(pc.iFrameName);
        sleepFor(2);
        pc.useSearchbar("Java");
        sleepFor(2);
       pc.clearSearchbar();
    }

}
