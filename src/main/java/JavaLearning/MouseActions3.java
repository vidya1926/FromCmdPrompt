package JavaLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseActions3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/drag.xhtml");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement left = driver.findElement(By.xpath("//div[contains(@class,'ui-slider ui-corner-all')]"));
		WebElement right = driver
				.findElement(By.xpath("(//span[contains(@class,'ui-slider-handle ui-corner-all')])[2]"));

		Actions actions = new Actions(driver);

		actions.clickAndHold(left).moveByOffset(10, 0).perform();
		actions.clickAndHold(right).moveByOffset(-40, 0).perform();

		WebElement ele1 = driver.findElement(By.xpath("//tbody[@id='form:j_idt111_data']//tr[3]"));
		WebElement ele2 = driver.findElement(By.xpath("//tbody[@id='form:j_idt111_data']//tr[2]"));
		Thread.sleep(3000);
		actions.dragAndDrop(ele1,ele2).perform();
		Thread.sleep(3000);
		String msg = driver.findElement(By.xpath("//div[@class='ui-growl-message']/span")).getText();
		System.out.println(msg);
		String msg1 = driver.findElement(By.xpath("//div[@class='ui-growl-message']/p")).getText();
		System.out.println("RowMoved"+msg1);
		System.out.println();

		
		
		
		//Resize Image
		  WebElement reSize = driver.findElement(By.xpath("//div[contains(@class,'ui-resizable')]"));
	     Point location2 = reSize.getLocation();
	     int x2 = location2.getX();
	     int y2 = location2.getY();
	     System.out.println(x2+"   "+y2);
		  actions.dragAndDropBy(reSize,50,10).perform();
		  Thread.sleep(1000);
		  String resizeMsg = driver.findElement(By.xpath("//div[@class='ui-growl-message']/span")).getText();
		  System.out.println(resizeMsg);
		  String resizeMsg2 = driver.findElement(By.xpath("//div[@class='ui-growl-message']/p")).getText();
		  System.out.println(resizeMsg2);
		
		
		
	}

}
