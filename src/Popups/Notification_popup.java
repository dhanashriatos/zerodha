package Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_popup {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	//create object of browser setting class
	ChromeOptions c=new ChromeOptions();
	//call addArgument method of browser setting class
	c.addArguments("-disable-notifications");
	//pass ref variable in chromedriver constructor
    WebDriver driver=new ChromeDriver(c);
    driver.get("https://www.hdfc.com");
}
}