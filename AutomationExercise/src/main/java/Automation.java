import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Automation {

    WebDriver driver;

    @BeforeClass
    public void setUpClass() {
        // Runs once before all tests
        System.out.println("in beforeClass");
        driver = new ChromeDriver();
        driver.navigate().to("https://automationexercise.com/");
    }

    @BeforeMethod
    public void setUpMethod() {
        // Runs before each test method
        System.out.println("in beforeMethod");
    }

    @Test
    public void testCase1() {
        // Test case 1
        System.out.println("in test case 1");
        driver.findElement(By.xpath("//a[@href=\"/login\"]")).click();
    }

    @Test
    public void testCase2() {
        // Test case 2
        System.out.println("in test case 2");
         driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("fatmaessa");
    }
    @Test
    public void testCase3() {
        // Test case 3
        System.out.println("in test case 3");
        driver.findElement(By.xpath("//input[@type=\"email\"][contains(@data-qa,'signup-email')]")).sendKeys("fatnma@gmail123");
    }

    @Test
    public void testCase4() {
        // Test case 4
        System.out.println("in test case 4");
        driver.findElement(By.xpath("//button[@type='submit'][contains(.,'Signup')]")).click();
    }
    @Test
    public void testCase5() {
        // Test case 5
        System.out.println("in test case 5");
         driver.findElement(By.xpath("//input[@data-qa=\"first_name\"]")).sendKeys("fatma");
    }

    @Test
    public void testCase6() {
        // Test case 6
        System.out.println("in test case 6");
        driver.findElement(By.xpath("//input[@data-qa=\"last_name\"]")).sendKeys("essa");
    }
    @AfterMethod
    public void tearDownMethod() {
        // Runs after each test method
        System.out.println("in afterMethod");
    }

    @AfterClass
    public void tearDownClass() {
        // Runs once after all tests
        System.out.println("in afterClass");
        if (driver != null) {
           // driver.quit();
        }
    }
}
