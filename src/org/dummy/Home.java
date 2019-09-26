package org.dummy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Home {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\welcome\\eclipse-workspace\\Dummy\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.walmart.com");
		Thread.sleep(5000);

		WebElement scar = driver.findElement(By.xpath("(//span[@class='g_a g_h'])[1]"));
		Actions acc = new Actions(driver);
		acc.moveToElement(scar).perform();
		scar.click();
		WebElement hollow = driver.findElement(By.xpath("(//button[@class='f_a n_a ab_c'])[1]"));
		acc.moveToElement(hollow).perform();
		hollow.click();
		WebElement decor = driver.findElement(By.xpath("(//div[text()='Indoor Decor'])"));
		decor.click();
		Thread.sleep(7000);
		WebElement first = driver.findElement(By.xpath("(//img[@data-pnodetype='item-pimg'])[1]"));
		acc.moveToElement(scar).perform();
		first.click();
	}

}
