package selesniumdemo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fashionSiteTest {

	WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Admin\\Documents\\Auto-Testing\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Ignore
	@Test
	public void searchDress() throws InterruptedException {
		System.out.println("Search Test - Summer Dress");
		driver.get("http://automationpractice.com/index.php");
		WebElement searchBar = driver.findElement(By.id("search_query_top"));
		searchBar.sendKeys("Summer Dress");
		WebElement searchBtn = driver.findElement(By.name("submit_search"));
		Thread.sleep(000);
		searchBtn.submit();
		
		WebElement moreInfo = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]"));
		moreInfo.click();
		Thread.sleep(000);
		
		WebElement result = driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/div/div[3]/h1"));
		Thread.sleep(12000);
		assertEquals("xyz", true, result.getText().equals("Printed Summer Dress"));
	}
	
	@Test
	public void buyTShirt() throws InterruptedException {
		System.out.println("Nav Test - Buying TShirts");
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("bibbyDBib@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"id_gender2\"]"));
		driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("Testeeeeet");
		driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("Tostooost");
		driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("to4stP4$$");
		driver.findElement(By.xpath("//*[@id=\"days\"]")).sendKeys("12");
		driver.findElement(By.xpath("//*[@id=\"months\"]")).sendKeys("June");
		driver.findElement(By.xpath("//*[@id=\"years\"]")).sendKeys("1999");
		
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("Testeeeeet");
		driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("Tostooost");
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("97  Worthy Lane");
		driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("MARYGOLD");
		Thread.sleep(1000);
		
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
}
