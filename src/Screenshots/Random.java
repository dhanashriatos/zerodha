package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import net.bytebuddy.utility.RandomString;

public class Random 
{
public static void main(String[] args) throws Throwable
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.com/");
    driver.manage().window().maximize();
    //use randomstring class
    String random = RandomString.make();
    //typecast takesscreenshot interface
    TakesScreenshot ts=(TakesScreenshot)driver;
    //use getscreenshotAs()
    File src = ts.getScreenshotAs(OutputType.FILE);
    //we have to store screenshit at particular dwstinTION create object of file class
    File dest=new File("C:\\Users\\Admin\\Desktop\\Dhanashri\\"+random+".jpg");
    //u have to transfer file source to destination(ya adhi amhi findhandler vapraycho)
    Files.copy(src, dest);
}
}