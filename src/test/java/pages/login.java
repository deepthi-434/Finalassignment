package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	
	@FindBy(xpath = "//a[text()='Login']")
	WebElement loginId;
	
	@FindBy(name = "email")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement pwd;
	
	@FindBy(xpath = "//button[text()='Login']")
	WebElement loginBtn;
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void loginIntoApp(String strUser, String strPwd) {
		loginId.click();
		username.sendKeys(strUser);
		pwd.sendKeys(strPwd);
		loginBtn.click();
	}

}
