package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Particular_element_scrnshot 
{
public static void main(String[] args) throws Throwable 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com/");
    //i want to take scrnshot of particular element(inspect element store in ref variable)
    WebElement gTitle = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
    File src = gTitle.getScreenshotAs(OutputType.FILE);
    //store at destination
    File dest=new File("C:\\Users\\Admin\\Desktop\\Dhanashri\\Googletitle.jpg");
    //source to destination
    Files.copy(src, dest);
    
}

}