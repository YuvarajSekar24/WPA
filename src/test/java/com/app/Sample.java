package com.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Flipkart\\src\\test\\resources\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("9551411693");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("Saiyuva@123");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Electronics']")).click();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//a[text()='Mi']")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("(//div[@class='col col-7-12'])[1]")).click();
		Set<String> window = driver.getWindowHandles();
		List <String> li = new ArrayList<String>();
		li.addAll(window);
		driver.switchTo().window(li.get(1));
		driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
		
		
	}

}
