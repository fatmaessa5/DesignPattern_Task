package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

    private WebDriver driver;
    //constructor
    public loginPage (WebDriver driver)
    {
        this.driver = driver;
    }
    //locator

    By nameField= By.xpath("//input[@name ='name']");
    By emailField= By.xpath("//input[@type=\"email\"][contains(@data-qa,'signup-email')]");
    By signupButton=By.xpath("//button[@class=\"btn btn-default\"][contains(.,'Signup')]");


    //methode
//    public  void signupClick(){
//        driver.findElement(nameField).sendKeys("fatma");
//        String currentTime = System.currentTimeMillis() + "@gmail.com";
//        driver.findElement(emailField).sendKeys(currentTime);
//        driver.findElement(signupButton).click();
//    }
    public void signupClick(String name, String email) {
        driver.findElement(nameField).sendKeys(name);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(signupButton).click();
    }

//    public void signupClick(String name, String email) {
//        driver.findElement(nameField).sendKeys(name);
//        driver.findElement(emailField).sendKeys(email);
//        driver.findElement(signupButton).click();
//    }
}
