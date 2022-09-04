package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get
{
public static void main(String[] args)
{
	//set properties
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    //1>>get()>>>enter the url
    driver.get("https://www.amazon.com/");
    
}
}