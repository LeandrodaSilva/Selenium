/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.concurrent.TimeUnit;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author Aluno
 */
public class Test1 {
    
    @Test
    public void testA() throws Exception {
        // Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aluno\\Selenium\\chromedriver_win32_2.46\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // And now use this to visit NetBeans
        driver.get("https://saucelabs.com/test/guinea-pig");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.netbeans.org");
        WebElement link = driver.findElement(By.id("i am a link"));
        link.click();
        // Check the title of the page
        // Wait for the page to load, timeout after 10 seconds
//        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
//            @Override
//            public Boolean apply(WebDriver d) {
//                return d.getTitle().contains("I am another page title - Sauce Labs");
//            }
//        });
        
        assertEquals(driver.getTitle(), "I am another page title - Sauce Labs");
        //Close the browser
        driver.quit();
    }
    
    @Test
    public void testB() throws Exception {
        // Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aluno\\Selenium\\chromedriver_win32_2.46\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // And now use this to visit NetBeans
        driver.get("https://saucelabs.com/test/guinea-pig");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.netbeans.org");
       
        WebElement fbemail = driver.findElement(By.id("fbemail"));
        fbemail.sendKeys("leandro@email.com");
        
        WebElement comment = driver.findElement(By.id("comments"));
        comment.sendKeys("teste");
        
        assertEquals(driver.findElement(By.tagName(fbemail.getTagName())).getText(), "leandro@email.com");
        //Close the browser
        //driver.quit();
    }
    
}
