package com.day5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task5 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
        ChromeOptions co=new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(co);
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        WebElement search = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		search.sendKeys("Apple",Keys.ENTER);
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		System.out.println(driver.getTitle());
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement search2 = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		search2.sendKeys("Selenium",Keys.ENTER);
		System.out.print("\n"+driver.getWindowHandle());
		System.out.println("\n"+driver.getTitle());
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement search3 = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		search3.sendKeys("Cucumber",Keys.ENTER);
		System.out.print("\n"+driver.getWindowHandle());
		System.out.println("\n"+driver.getTitle());
		Set<String>s=driver.getWindowHandles();
		System.out.println("Number of windows opened = "+s.size());
		
		
		
           
	}

}