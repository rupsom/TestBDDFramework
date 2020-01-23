package com.test.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.test.util.Utilities;

public class TestBase {

	public static WebDriver driver = null;
	public static Properties prop = null;
	public static Properties or = null;
	
	public TestBase() {
		
		prop = new Properties();
		or = new Properties();
		try {
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir")
					+"\\src\\main\\java\\com\\test\\config\\config.properties");
			prop.load(fis);
			
			FileInputStream orfis = new FileInputStream(System.getProperty("user.dir")
					+"\\src\\main\\java\\com\\test\\config\\or.properties");
			or.load(orfis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void initialization() {
		String browser = prop.getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Executables\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else
			System.out.println("DRIVER FOR BROWSER IS NOT FOUND");
		
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(Utilities.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	}
}
