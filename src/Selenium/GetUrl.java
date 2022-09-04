package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrl 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.monster.com/");
    //use getcurrenturl()
    String link = driver.getCurrentUrl();
    System.out.println(link);
    //gettitle
    String title = driver.getTitle();
    System.out.println(title);
}
}