package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Demo1
{
public static void main(String[] args) throws Throwable
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://nxtgenaiacademy.com/alertandpopup/");
    
    driver.findElement(By.xpath("//button[@name='alertbox']")).click();
    
    //switch from main webpage to popup
    Alert alt = driver.switchTo().alert();
    Thread.sleep(4000);
    //click on ok button
    //alt.accept();
    //Thread.sleep(4000);
    //click on cancel button
   // alt.dismiss();
    
    //get the text of popup
    Thread.sleep(3000);
    String text = alt.getText();
    System.out.println(text);
    
}
}