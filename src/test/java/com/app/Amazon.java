package com.app;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Flipkart\\src\\test\\resources\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		/*driver.findElement(By.xpath("//span[text()='Hello. Sign in']")).click();
		driver.findElement(By.id("ap_email")).sendKeys("9952043964");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Saiyuva@123");
		driver.findElement(By.id("signInSubmit")).click();*/
		driver.findElement(By.id("nav-hamburger-menu")).click();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@data-menu-id='7']")).click();
		driver.findElement(By.xpath("//a[@href='/gp/browse.html?node=1389401031&ref_=nav_em_T1_0_4_NaN_1_sbc_mobcomp_all_mobiles']")).click();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		WebElement firstHover = driver.findElement(By.xpath("(//span[contains(text(),'Mobiles ')])[2]"));
		Actions acc = new Actions(driver);
		acc.moveToElement(firstHover).perform();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[text()='Nokia'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//span[text()='Nokia 6 (Matte Black, 32GB)'])[2]")).click();
		
		
	}

}
