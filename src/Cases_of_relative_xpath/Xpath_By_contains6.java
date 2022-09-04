package Cases_of_relative_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_By_contains6
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
 
    driver.get("https://www.facebook.com/");
    
    
    driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("dhajare23@gmail.com");
    

    driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("Dhanno@123");
    
   
    driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
}
}