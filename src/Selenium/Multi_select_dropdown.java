package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_select_dropdown 
{
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    //open the applicatio
    driver.get("C:/Users/Admin/Documents/Dhanashri1.HTML");
    //inspect the drop down
    WebElement dropdown = driver.findElement(By.xpath("//select[@id='PARADISE']"));
    
    //create object of select class
    Select s=new Select(dropdown);
    //check whether DD is multiselctable or not
    if(s.isMultiple()) {
    	System.out.println("given DD is multiselectable");
    }
    else {
    	System.out.println("It is not multiselectable");
    }
    //get size of all options
    List<WebElement> allelements = s.getOptions();
    System.out.println(allelements.size());
    
    //get the text of all elements
    for(int i=0;i<=allelements.size()-1;i++) {
    	WebElement onelement = allelements.get(i);
    	String text = onelement.getText();
    	System.out.println(text);
    }
}
}