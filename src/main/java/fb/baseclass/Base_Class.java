package fb.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base_Class {
	public static  WebDriver driver;
	
	public static void Browser_Launch(String browser) {
		try {
			if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", "C:\\Users\\Lenovo\\eclipse-workspace\\FB\\msedgedriver.exe");
				driver = new EdgeDriver();
			}
			
			
		} catch (Exception e) {
			System.out.println("Unabe to Launch the Browser"+e.getMessage());
		}
	}
}
