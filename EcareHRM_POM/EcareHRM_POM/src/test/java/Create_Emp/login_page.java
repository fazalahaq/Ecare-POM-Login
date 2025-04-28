package Create_Emp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page {
	WebDriver driver;
	login_page(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	//Locators for login  	        
	@FindBy(xpath = "//input[@id='basic_email']") WebElement txt_user;
	@FindBy(xpath = "//*[@id='basic_password']") WebElement pwd;
	@FindBy(xpath = "//button[@type='submit']") WebElement btn;
	//Action
	public void setuser(String user)
	{
		txt_user.sendKeys(user);
	}
	
	public void setpwd(String password) {
		pwd.sendKeys(password);
	}
	
	public void loginbtn() {
		btn.click();
	}	
}
