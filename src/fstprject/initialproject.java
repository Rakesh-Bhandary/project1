package fstprject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class initialproject {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.verizon.com/");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//button[@id='gnav20-cart-icon']"));
		ele.click();
		Thread.sleep(5000);
		driver.close();
	}

}
