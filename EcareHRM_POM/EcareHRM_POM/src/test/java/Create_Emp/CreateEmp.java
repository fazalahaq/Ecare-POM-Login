package Create_Emp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateEmp {
	WebDriver driver;
	CreateEmp(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	}
	//Locator
	//Click on employee listing at the side menu
	@FindBy(xpath = "//*[@href='/hr/employee-listing']") WebElement ClickEmpMenu;
	@FindBy(xpath = "//*[contains(text(), 'Add New Employee')]") WebElement AddNewEmp;
	
	//Action
	public void btn1() {
		ClickEmpMenu.click();
	}	
	public void btn2() {
		AddNewEmp.click();
	}	

}
