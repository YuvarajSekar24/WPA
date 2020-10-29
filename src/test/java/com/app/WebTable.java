package com.app;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void method() {
		
		
	}
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Flipkart\\src\\test\\resources\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/#");
		List<WebElement> trows = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < trows.size(); i++) {
			List<WebElement> tdata=	trows.get(i).findElements(By.tagName("td"));
			for (int j = 0; j < tdata.size(); j++) {
				String text = tdata.get(j).getText();
				if(text.contains("China")) {
					 System.out.println(tdata.get(5).getText());
				}
				
			}
			
		}
	}

}
