package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com/");
    //gettitle()
    String expT="Google";
   String actT=driver.getTitle();
   if(actT.equals(expT)) {
	   System.out.println("Test case is pass,expT and actT are matching");
   }
   else 
   {
	   System.out.println("Test case is fail,expT and actT are not matching ");
   }
}
}