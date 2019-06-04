/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 *
 * @author rivolli
 */
public class TesteSelenium02_Form {
    
    @Test
    public void testSimple() throws Exception {
        System.setProperty("webdriver.chrome.driver", "/home/rivolli/Documents/UTFPR/2019-01/chromedriver_linux64/chromedriver");
        
        // Criacao do driver
        WebDriver driver = new ChromeDriver();

        driver.get("http://nativeformelements.com/");
        
        //Input/Text area
        WebElement txtField = driver.findElement( By.tagName("textarea") );
        txtField.sendKeys("Lorem Ipsum is simply dummy text of the printing and typesetting industry.\n\nLorem Ipsum is simply dummy text of the printing and typesetting industry.");
        
        //Checkbox
        WebElement checkbox = driver.findElement( By.xpath("//*[@id=\"container\"]/section/ul[11]/li[1]/input") );
        if (checkbox.isSelected()) {
            checkbox.click();
        }
        
        //Select
        Select combo = new Select(driver.findElement(By.xpath("//*[@id=\"container\"]/section/ul[13]/li[1]/select")));
        combo.selectByVisibleText("Option 3");

        //driver.quit();
    }
    
}
