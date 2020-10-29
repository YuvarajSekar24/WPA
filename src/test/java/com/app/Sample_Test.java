package com.app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_Test {
	static String[] FishNamesSorted;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Flipkart\\src\\test\\resources\\Driver\\chromedriver.exe");
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
		WebElement element = driver.findElement(By.xpath("//div[@class='_3wU53n']"));
		ArrayList<String> obtainedList = new ArrayList(); 
		List<WebElement> offerPercentage = driver.findElements(By.xpath("//div[@class='_3wU53n']"));
		for (int i =0; i<offerPercentage.size(); i++) {
			if(offerPercentage.get(i).getText().equals("Redmi")) {
				System.out.println(offerPercentage.get(i).getText());
			}
		}
		
		/*ArrayList<String> sortedList = new ArrayList();  
		for (String s : obtainedList) {
			sortedList.add(s);
			
		}
		Collections.sort(sortedList,Collections.reverseOrder());
		//Collections.reverse(sortedList);
		for (String string : sortedList) {
			//System.out.println(string);
		}
		FishNamesSorted = sortedList.toArray((new String[sortedList.size()]));
		for (String string : sortedList) {
			System.out.println(string);
			
		}*/
		
		/*Arrays.parallelSort(sortedList.toArray((new String[sortedList.size()])));
		for (String string : sortedList) {
			System.out.println(string);
			
		}*/
		
		//Assert.assertTrue(sortedList.equals(obtainedList));
		//
		
		
	}
	

}
