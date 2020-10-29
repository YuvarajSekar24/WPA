package com.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample5 {
	public static List<String> listAmount = new ArrayList<String>();
	public static List<String> listAmount1 = new ArrayList<String>();

	public static void main(String[] args) throws InterruptedException {
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
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[text()='Price -- Low to High']")).click();
		Thread.sleep(3000);
		List<WebElement> mobileList = driver.findElements(By.xpath("//div[@class='_1vC4OE _2rQ-NK']"));
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		for (WebElement x : mobileList) {
			int length = x.getText().length();
			String data = x.getText().substring(1, length).trim();
			// System.out.println(data);
			listAmount.add(data);
			driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		}
		// driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		Collections.sort(listAmount);
		for (String x2 : listAmount) {
			System.out.println(x2);
		}
		driver.findElement(By.xpath("(//div[@class='_1vC4OE _2rQ-NK'])[1]")).click();
		Set<String> mobile = driver.getWindowHandles();
		List <String> mobileWindow = new ArrayList<String>();
		mobileWindow.addAll(mobile);
		driver.switchTo().window(mobileWindow.get(1));
		driver.findElement(By.xpath("//button[@class='_2AkmmA _2Npkh4 _2MWPVK']")).click();
	}

}
