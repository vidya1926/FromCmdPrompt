package JavaLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/menu.xhtml");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement cus = driver.findElement(By.xpath("(//span[text()='Customers'])"));
		WebElement newCus = driver.findElement(By.xpath("(//span[text()='New'])"));
	
		Actions act=new Actions(driver);
		act.click(cus).moveToElement(newCus).moveToElement(newCus).perform();
		act.contextClick(newCus).perform();
		
		
	}

}
