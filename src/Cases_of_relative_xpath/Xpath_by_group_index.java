package Cases_of_relative_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_group_index
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://demo.actitime.com/login.do");
    //enter UN
    driver.findElement(By.xpath("(//input)[3]")).sendKeys("admin");
    //enter the PWD
    driver.findElement(By.xpath("(//input)[4]")).sendKeys("manager");
    //click on login btn
    driver.findElement(By.xpath("(//div)[13]")).click();
   
    
}
}