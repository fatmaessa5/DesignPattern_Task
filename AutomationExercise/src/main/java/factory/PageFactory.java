package factory;

import org.openqa.selenium.WebDriver;
import pages.homePage;
import pages.loginPage;

public class PageFactory {

    private WebDriver driver;

    public PageFactory(WebDriver driver) {
        this.driver = driver;
    }

    public homePage getHomePage() {
        return new homePage(driver);
    }

    public loginPage getLoginPage() {
        return new loginPage(driver);
    }
}
