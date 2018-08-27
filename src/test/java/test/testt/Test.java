package test.testt;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Test {

	@org.junit.Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions chromeOptions = new ChromeOptions();
		
		//capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		capabilities.setCapability("pageLoadStrategy", "none");
		
	
//     chromeOptions.addArguments("--headless");
//	     chromeOptions.addArguments("window-sized800,600");
//	     chromeOptions.addArguments("--proxy-server='direct://'");

		// Initialize browser
		
		WebDriver driver=new ChromeDriver(chromeOptions);
		
		//Instantiating FirefoxOptions object

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// while(true){
		//driver.get("https://www.google.co.uk/");
		
		driver.get("https://www.instagram.com/eminem");
		
		
		//System.out.println("Title of the page is -> " + driver.getTitle());
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("C:\\Users\\user\\Desktop\\em.png"));
		} catch (IOException e) {
			e.printStackTrace();
	
		
		String postCount = driver.findElement(By.className("g47SY")).getText();
		System.out.println("Ems post Count is " + postCount);
	
		driver.quit();
		//}	
		
	}
	}
}
