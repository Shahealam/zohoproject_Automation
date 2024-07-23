package test_webpage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class webform {
	
	public static void main (String[]args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement element=driver.findElement(By.xpath("//h1[@class='display-6']"));
		
		String first_name=element.getText();
		System.out.println(first_name);
		
		if(first_name.equals("Web form")){
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		driver.findElement(By.id("my-text-id")).sendKeys("Hello");
		driver.findElement(By.name("my-password")).sendKeys("alam");
		driver.findElement(By.name("my-textarea")).sendKeys("sakil");
		driver.findElement(By.linkText("Return to index")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("blank.html")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.navigate().back();
		WebElement elements=driver.findElement(By.name("my-select"));
		Select dropdown=new Select(elements);
		dropdown.selectByVisibleText("Two");
		
		WebElement element1=driver.findElement(By.name("my-datalist"));
		Select dropdown1=new Select(element1);
		dropdown1.selectByVisibleText("New York");
		
		driver.findElement(By.name("my-file")).sendKeys("C:\\Users\\Shahe alam\\Downloads\\My Resume pune.pdf");
		
		
	}

}
