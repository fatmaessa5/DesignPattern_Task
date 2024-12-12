//package pom.tests;
//
//import factory.PageFactory;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//import pages.homePage;
//import pages.loginPage;
//
//public class loginTests {
//    private WebDriver driver;
//    private PageFactory pageFactory;
//    @BeforeMethod
//    public void setup() {
//        driver = new ChromeDriver();
//        driver.navigate().to("https://automationexercise.com/");
//        pageFactory = new PageFactory(driver); // Initialize the factory
//    }
//    @Test
//    public void autoexercise() {
//        homePage homePage = pageFactory.getHomePage();
//        loginPage loginPage = pageFactory.getLoginPage();
//        homePage.clicksignupButton();
//        loginPage.signupClick();
//    }
//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }
//}
package pom.tests;

import factory.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.homePage;
import pages.loginPage;
import utils.CSVReaderUtil;

import java.util.List;

public class loginTests {

    private WebDriver driver;
    private PageFactory pageFactory;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.navigate().to("https://automationexercise.com/");
        pageFactory = new PageFactory(driver); // Initialize the factory
    }

    @DataProvider(name = "userData")
    public Object[][] getUserData() {
        String filePath = "C:\\Users\\HP\\IdeaProjects\\AutomationExercise\\src\\main\\resources\\user_data.csv"; // Adjust path as needed
        List<String[]> data = CSVReaderUtil.readCSV(filePath);
        return data.toArray(new Object[0][0]);
    }

    @Test(dataProvider = "userData")
    public void autoexercise(String name, String email) {
        homePage homePage = pageFactory.getHomePage();
        loginPage loginPage = pageFactory.getLoginPage();

        homePage.clicksignupButton();
        loginPage.signupClick(name, email);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
