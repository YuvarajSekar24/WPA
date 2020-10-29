package com.app;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Package1 {
	public static List<String> listAmount = new ArrayList<String>();
	public static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) throws Exception {
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
		Thread.sleep(3000);
		List<WebElement> mobileList = driver.findElements(By.xpath("//div[@class='VGWI6T']"));
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		for (WebElement x : mobileList) {
			int length = x.getText().length();
			String data = x.getText().substring(0, length).trim();
			listAmount.add(data);

		}
		for (String x2 : listAmount) {
			String x3 = x2.replaceAll("[a-zA-Z%]", "").trim();
			int int1 = Integer.parseInt(x3);
			list.add(int1);
		}
		int tmp;
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) < list.get(j)) {
					tmp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, tmp);

				}
			}

		}
		System.out.println(list);
		Integer int1 = list.get(0);
		System.out.println(int1);
		String string12 = String.valueOf(int1);
		String join = "% off";
		String dataJoin = string12 + join;
		Thread.sleep(2000);
		String xpath = "(//span[text()='" + dataJoin + "'])[1]";
		driver.navigate().refresh();
		driver.findElement(By.xpath(xpath)).click();
	}

}
