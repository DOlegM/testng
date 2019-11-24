/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com;

import org.junit.Test;
import static org.testng.Assert.*;

/**
 *
 * @author oleg Dziabenko
 */
public class GoogleSearch {
    
    private static WebDriver driver;
    private String baseUrl="https://www.google.com";  
    
    public GoogleSearch() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
        
        
         System.setProperty("webdriver.chrome.driver", "c:\\data1\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.get(baseUrl);
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
    public void testSearch() {
        
    driver.findElement(By.xpath(".//*[@name='q']")).click();
    driver.findElement(By.xpath(".//*[@name='q']")).clear();
    driver.findElement(By.xpath(".//*[@name='q']")).sendKeys("basketball");
    driver.findElement(By.xpath(".//*[@name='q']")).submit();
    }
}
