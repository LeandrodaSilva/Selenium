/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
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
 * @author rivolli
 */
public class TesteSelenium01 {
    
    @Test
    public void testSimple() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Aluno\\Selenium\\chromedriver_win32_2.46\\chromedriver.exe");
        
        // Criacao do driver
        WebDriver driver = new ChromeDriver();

        //Opcional: definicao do tempo maximo de espera
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        // Acessar uma determinada pagina web
        driver.get("https://moodle.utfpr.edu.br/login/index.php");
        
        // Acessar os elementos desta pagina pelo ID do elemento
        WebElement userInput = driver.findElement( By.id("username") );
        userInput.sendKeys("rivolli");
        
        // Acessar os elementos desta pagina pelo XPath
        WebElement passwordInput = driver.findElement( By.xpath("//*[@id=\"password\"]") );
        passwordInput.sendKeys("1234");
        
        // Submeter o formulário - Selecionando o elemento utilizando um seletor CSS
        WebElement sendButton = driver.findElement(By.cssSelector("#loginbtn"));
        sendButton.click();
   
        //Selecionando o elemento utilizando uma classe
        WebElement msgText = driver.findElement(By.className("error"));
        
        //Fazendo as verificações
        assertEquals(msgText.getText(), "Invalid login, please try again");
        
        //Fecha o navegador
        driver.quit();
    }
    
}
