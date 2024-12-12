package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class homePage {
    private WebDriver driver;
    public homePage(WebDriver driver) {
        this.driver = driver;
    }
    By signup   =By.xpath("//a[@href=\"/login\"]");


    public void clicksignupButton ()
    {
        driver.findElement(signup).click();
    }
}
