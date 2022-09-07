package JavaLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/drag.xhtml");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		WebElement drag = driver.findElement(By.id("form:conpnl_content"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(drag, 120, 90).perform();

		WebElement dragToTarget = driver.findElement(By.id("form:drag_content"));
		WebElement dropToTarget = driver.findElement(By.id("form:drop_content"));
		act.dragAndDrop(dragToTarget, dropToTarget).perform();

		WebElement name = driver.findElement(By.xpath("(//span[text()='Name'])[1]"));
		WebElement quantity = driver.findElement(By.xpath("(//span[text()='Quantity'])[1]"));
		act.dragAndDrop(name, quantity).perform();

	}

}
