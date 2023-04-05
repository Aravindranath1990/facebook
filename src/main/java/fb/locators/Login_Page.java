package fb.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fb.baseclass.Base_Class;

public class Login_Page extends Base_Class {

	public Login_Page(WebDriver xdriver) {
		this.driver=xdriver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(css="img[class='fb_logo _8ilh img']")
	public WebElement Fb_Logo;
}
