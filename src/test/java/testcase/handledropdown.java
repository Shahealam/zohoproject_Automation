/*package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handledropdown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://ums.lpu.in/lpuums/");
		
		WebElement element=driver.findElement(By.id("DropDownList1"));
		Select dropdown=new Select(element);
		dropdown.selectByVisibleText("Ambedkar Chowk");
		//dropdown.selectByValue(null);
	//	dropdown.selectByIndex(0);
		
		
		

	}

}
*/