package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverIntro {

	public static void main(String[] args) {

		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\drivers\\SeleniumDrivers\\chromedriver_win32\\chromedriver.exe");
		 */

		//WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.tnpds.gov.in/");

		driver.manage().window().maximize();

		String pageTitle = driver.getTitle();

		System.out.println(pageTitle);

		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='col-3 mob-clr apWrapper']//child::a"));

		for (WebElement webElement : ele) {

			System.out.println(webElement.getText());

		}

		/*
		 * if (pageTitle.equals("Yahoo Search - Web Search")) {
		 * 
		 * System.out.println("Yahoo Searching page is loaded "); } else {
		 * System.out.println("Yahoo Searching page is not loaded "); }
		 */
	}

}
