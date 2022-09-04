package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Max_Mini 
{
public static void main(String[] args) throws Throwable 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com/");
    //maximize the browser
    driver.manage().window().maximize();
    Thread.sleep(3000);
    //minimize the browser
    driver.manage().window().minimize();
    //note:boss  in sel(3 version) there is no minimize(0 but from sel(4 version) onwards it is implemented
   
    
}
}
