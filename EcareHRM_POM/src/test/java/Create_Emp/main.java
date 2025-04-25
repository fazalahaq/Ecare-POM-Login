package Create_Emp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class main {
	WebDriver driver;
@BeforeClass
void setup() {
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://devui-ecare.mightcode.com/login");
	driver.manage().window().maximize();
	
}
@Test
void HrLogin() {
	login_page lp = new login_page(driver);
	lp.setuser("hrm1");
	lp.setpwd("Unicode@2022$");
	lp.loginbtn();
	Assert.assertEquals(driver.getTitle(), "Ecare");
}
@AfterClass
void teardown() {
	driver.close();
	driver.quit();
}



}
