package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class First {


    public static void main(String[] args) {
        
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		driver.manage().window().maximize();
       driver.findElement(By.linkText("REGISTER")).click();
       driver.findElement(By.name("firstName")).sendKeys("dhyan");
      
       
       
    }

}