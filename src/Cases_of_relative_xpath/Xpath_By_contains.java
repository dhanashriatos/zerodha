package Cases_of_relative_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_contains 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    //open the browser
    driver.get("https://demo.actitime.com/login.do");
    
    //enter the UN
    driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
    
    //enter the PWD
    driver.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager");
    
    //click on login btn
    driver.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();
}
}