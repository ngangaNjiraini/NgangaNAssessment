package selesniumdemo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTests {
	WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Documents\\Git\\A-Testing\\WebDriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void testOne() throws InterruptedException {
		System.out.println("Start Test");
		driver.get("http://thedemosite.co.uk/addauser.php");
		WebElement userEle = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[1]/td[2]/p/input"));
		userEle.sendKeys("pumpkinWiz");
		WebElement passEle = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[2]/td[2]/p/input"));
		passEle.sendKeys("pumpwiz");
		WebElement submit = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/div/center/table/tbody/tr[3]/td[2]/p/input"));
		Thread.sleep(000);
		submit.submit();
		Thread.sleep(000);
		
		WebElement linkLogin = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[2]/small/a"));
		linkLogin.click();
		Thread.sleep(000);
		
		//driver.get("http://thedemosite.co.uk/addauser.php");
		WebElement enterUser = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input"));
		enterUser.sendKeys("pumpkinWiz");
		WebElement enterPass = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input"));
		enterPass.sendKeys("pumpwiz");
		Thread.sleep(000);
		WebElement login = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[3]/td[2]/p/input"));
		Thread.sleep(000);
		login.submit();
		Thread.sleep(000);
		
		WebElement result = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b"));
		Thread.sleep(12000);
		assertEquals("xyz", true, result.getText().equals("**Successful Login**"));
	}

	@After
	public void tearDown() {
		driver.close();
	}

}
