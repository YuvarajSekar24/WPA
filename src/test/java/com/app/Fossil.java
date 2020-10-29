package com.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fossil {
	public static List<String> listAmount = new ArrayList<String>();
	public static List<String> listAmount1 = new ArrayList<String>();
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
		
		for (int i = 0; i < 10; i++) {
			driver.navigate().refresh();
			
			List<WebElement> mobileList = driver.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
			driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
			for (int j = 0; j < mobileList.size(); j++) {
				String data = mobileList.get(j).getText();
			//	System.out.println(data);
				listAmount.add(data);
				for (String x : listAmount) {
					listAmount1.add(x);		
				}
				
				Collections.sort(listAmount1);
				
				
				driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
			}
			driver.findElement(By.xpath("//span[text()='Next']")).click();
		}
		for (String x2 : listAmount1) {
			System.out.println(x2);	
		}
		
		

	}

}
