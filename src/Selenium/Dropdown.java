package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
  //open the browser
    driver.get("C:/Users/Admin/Documents/Dhanashri.HTML");
    //inspect dropdown
    WebElement dropdown = driver.findElement(By.xpath("//select[@id='GoodLuck']"));
    //create object of select class
   Select s=new Select(dropdown);
    //use methods of select class
    
    s.selectByIndex(4);//select by index methos
    
    //select by value
   // s.selectByValue("c");
    
    //select by visible text
    s.selectByVisibleText("Biryani");
 
    
}
}