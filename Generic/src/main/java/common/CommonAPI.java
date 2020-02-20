package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class CommonAPI {

        public static WebDriver driver=null;

        public WebDriver setBrowser(String OS,String Browser){
            if (OS.equalsIgnoreCase("windows")&& Browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver","Generic/BrowserDriver/Windows/chromedriver.exe");
                driver=new ChromeDriver();
            }else if (OS.equalsIgnoreCase("mac")&& Browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver","BrowserDriver/Windows/chromedriver.exe");
                driver=new ChromeDriver();
            }
            return driver;
        }



     //Radio Button
    public void radioButton(String radioButton1, String radioButton2, String radioButton3){
        WebElement radio1 = driver.findElement(By.xpath(radioButton1));
        WebElement radio2 = driver.findElement(By.xpath(radioButton2));
        WebElement radio3 = driver.findElement(By.xpath(radioButton3));

        radio1.click();
        radio2.click();
        radio3.click();
    }

    public void checkBox(String selectCheckBox){
        WebElement checkBoxSelect = driver.findElement(By.xpath(selectCheckBox));
        for (int i= 0; i <2; i++){
            checkBoxSelect.click();
            System.out.println(checkBoxSelect.isDisplayed());
        }
    }

    public void selectFromDropDownList(String locator){
        Select selectFromDrop = new Select(driver.findElement(By.xpath(locator)));
        selectFromDrop.selectByVisibleText("xxxxx");
    }

    public void dragAndDrop(String dragFrom, String dropTo){

        WebElement From=driver.findElement(By.xpath(dragFrom));

        WebElement To=driver.findElement(By.xpath(dropTo));

        Actions act=new Actions(driver);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

//Dragged and dropped.
        act.dragAndDrop(From, To).build().perform();

    }

    public void calender(String dayLocator, String monthLocator){
        List<WebElement> allDates=driver.findElements(By.xpath(dayLocator));
        for(WebElement day:allDates)
        {
            String date=day.getText();

            if(date.equalsIgnoreCase("28"))
            {
                day.click();
                break;
            }

        }
        List<WebElement> allMonths=driver.findElements(By.xpath(monthLocator));
        for (WebElement month:allMonths){
            String selectMonth = month.getText();

            if (selectMonth.equalsIgnoreCase ("July"))
            {
                month.click();
                break;
            }
        }

    }

}
