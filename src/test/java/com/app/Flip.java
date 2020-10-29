package com.app;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flip {
	public static Map<String, String> mp = new LinkedHashMap<String, String>();
	static String data,data1;
		public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP\\eclipse-workspace\\Flipkart\\src\\test\\resources\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("9551411693");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("Saiyuva@123");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Men']")).click();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//a[text()='Fossil']")).click();
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.SECONDS);
		
		/*List<WebElement> list = driver.findElements(By.xpath("//nav[@class='_1ypTlJ']//a[contains(@class,'_2Xp0TH')]"));
		for(int i =0; i< list.size(); i++) {
		if(list.get(i).getText().equals("4")) {	
			System.out.println(list.get(i).getText());
		String xpath ="//nav[@class='_1ypTlJ']//a[@href='/watches/fastrack~brand/pr?sid=r18&otracker=nmenu_sub_Men_0_Fastrack&page="+i+"']";
		System.out.println(xpath);
		driver.findElement(By.xpath(xpath)).click();
		
		
		}
		}
		//driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.navigate().refresh();
		List<WebElement> priceList = driver.findElements(By.xpath("//div[@class='_1vC4OE']"));
		List<WebElement> watchModel = driver.findElements(By.xpath("//a[@class='_2mylT6 _3Ockxk']"));
		for (int i = 0; i < priceList.size(); i++) {
			for (int j = 0; j < watchModel.size(); j++) {
				 data = priceList.get(i).getText();
				data1 = watchModel.get(j).getText();
				
				
			}
		}
		mp.put(data, data1);
		
		Set<Entry<String, String>> dataEntrySet = mp.entrySet();
		for (Entry<String, String> x : dataEntrySet) {
			System.out.println(x.getKey());
			System.out.println(x.getValue());
		}
*/	
	String xpath = "//a[@class='_2Xp0TH'][";
	String xpath1 = "]";
	int number = 5;
	String numberFeed = Integer.toString(number);
	WebElement clickEvent = driver.findElement(By.xpath(xpath+numberFeed+xpath1));
	System.out.println(clickEvent.getText());
	clickEvent.click();
	driver.navigate().refresh();
	List<WebElement> priceList = driver.findElements(By.xpath("//div[@class='_1vC4OE']"));
	List<WebElement> watchModel = driver.findElements(By.xpath("//a[@class='_2mylT6']"));
	for (int i = 0; i <= priceList.size(); i++) {
		
			 data = priceList.get(i).getText();
			data1 = watchModel.get(i).getText();
			mp.put(data, data1);
			
		}
	
	Set<Entry<String, String>> dataEntrySet = mp.entrySet();
	for (Entry<String, String> x : dataEntrySet) {
		//System.out.println(x.getKey());
		//System.out.println(x.getValue());
		System.out.println("Watch model is---->"+x.getValue()+"Price list is------>"+x.getKey());
	}
	
	
	
	
	
		
		}
}
