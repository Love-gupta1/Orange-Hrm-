package lovePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


    public class LoginPage {


        static WebDriver driver;
        By userName = By.xpath("//input[@name='username']");
        By password = By.name("password");
        By submit = By.xpath("//button");

        public LoginPage(WebDriver driver) {
            this.driver = driver;
        }


        public void login() throws InterruptedException {
            driver.manage().window().maximize();
            Thread.sleep(5000);
            driver.findElement(userName).sendKeys("Admin");
            driver.findElement(password).sendKeys("admin123");
            driver.findElement(submit).click();

        }

    }





