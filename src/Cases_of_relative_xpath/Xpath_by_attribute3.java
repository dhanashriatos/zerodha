package Cases_of_relative_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_attribute3
{
public static void main(String[] args) throws Throwable
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("dhajare23@gmail.com");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Dhanno@123");
    Thread.sleep(2000);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(2000);
    String expT="Facebook";
    String actT = driver.getTitle();
	if(actT.equals(expT)) 
    {
    	System.out.println("Facebook home page is opened,TC is pass");
    }
    else {
    	System.out.println("Facebook home page is not open, Tc is fail");
    }
    

    
    
}
}