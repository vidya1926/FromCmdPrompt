package JavaLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions4 {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriverManager.chromedriver().setup();
		//ChromeOptions opt=new ChromeOptions();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/dashboard.xhtml");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement dobleClick = driver.findElement(By.xpath("//label[@for='message']"));
	
		Actions act=new Actions(driver);
		
		act.moveToElement(dobleClick).doubleClick(dobleClick).perform();
		
	}

}
