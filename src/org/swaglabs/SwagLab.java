package org.swaglabs;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLab {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/v1/");
	driver.manage().window().maximize();
	
	WebElement userName = driver.findElement(By.xpath("//*[@id=\"user-name\"]"));
	userName.sendKeys("standard_user");
	
	WebElement Password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
	Password.sendKeys("secret_sauce");
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	File des =new File("C:\\Users\\leema\\eclipse-workspace\\Automate_swag\\swag\\loginpage.png");
	FileUtils.copyFile(source, des);
	
	WebElement Login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
	Login.click();
	
	driver.findElement(By.xpath("//*[@id=\"menu_button_container\"]/div/div[3]/div/button")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//*[@id=\"inventory_sidebar_link\"]")).click();
	
	TakesScreenshot ht=(TakesScreenshot)driver;
	File cope = ht.getScreenshotAs(OutputType.FILE);
	File one =new File("C:\\Users\\leema\\eclipse-workspace\\Automate_swag\\swag\\loginpage1.png");
	FileUtils.copyFile(cope,one);
	

	
	driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select")).click();
	driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[3]")).click();
	driver.findElement(By.xpath("//*[@id=\"inventory_filter_container\"]/select/option[4]")).click();
	
	driver.findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[6]/div[3]/button")).click();
	driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]")).click();
	
	TakesScreenshot st=(TakesScreenshot)driver;
	File copy = st.getScreenshotAs(OutputType.FILE);
	File two =new File("C:\\Users\\leema\\eclipse-workspace\\Automate_swag\\swag\\loginpage2.png");
	FileUtils.copyFile(copy,two);
	
	driver.findElement(By.xpath("//*[@id=\"item_2_title_link\"]/div")).click();
	
	TakesScreenshot ms=(TakesScreenshot)driver;
	File copee = ms.getScreenshotAs(OutputType.FILE);
	File three =new File("C:\\Users\\leema\\eclipse-workspace\\Automate_swag\\swag\\loginpage3.png");
	FileUtils.copyFile(copee,three);
	
	driver.findElement(By.xpath("//*[@id=\"inventory_item_container\"]/div/button")).click();
	
	driver.findElement(By.xpath("//*[@id=\"cart_contents_container\"]/div/div[2]/a[2]")).click();
	
	driver.findElement(By.xpath("//input[@id=\"first-name\"]")).sendKeys("leema");
	driver.findElement(By.xpath("//input[@id=\"last-name\"]")).sendKeys("nancy");
	driver.findElement(By.xpath("//input[@id=\"postal-code\"]")).sendKeys("600102");
	
	TakesScreenshot ls=(TakesScreenshot)driver;
	File copied = ls.getScreenshotAs(OutputType.FILE);
	File four =new File("C:\\Users\\leema\\eclipse-workspace\\Automate_swag\\swag\\loginpage4.png");
	FileUtils.copyFile(copied,four);
		
	driver.findElement(By.xpath("//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")).click();
	
	driver.findElement(By.linkText("FINISH")).click();
	
	TakesScreenshot gs=(TakesScreenshot)driver;
	File coss = gs.getScreenshotAs(OutputType.FILE);
	File five =new File("C:\\Users\\leema\\eclipse-workspace\\Automate_swag\\swag\\loginpage5.png");
	FileUtils.copyFile(coss,five);
	
	
	TakesScreenshot gh=(TakesScreenshot)driver;
	File cossed = gs.getScreenshotAs(OutputType.FILE);
	File six =new File("C:\\Users\\leema\\eclipse-workspace\\Automate_swag\\swag\\loginpage5.png");
	FileUtils.copyFile(cossed,six);
	
		
		
		
	
	
	}
	

	

}
