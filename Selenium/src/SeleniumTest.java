import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest 
{

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\amlan\\Desktop\\AMLAN_BHATTA\\Selenium\\geckodriver-v0.29.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\amlan\\Desktop\\AMLAN_BHATTA\\chromedriver_win32\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("earphones");
		driver.findElement(By.xpath("//*[@id=\"nav-search-bar-form\"]/div[3]/div")).click();
	    driver.get("https://www.amazon.in/Siwi-Headphones-Samsung-Galaxy-M30/dp/B08XMN8M4M/ref=sr_1_1_sspa?dchild=1&keywords=earphones&qid=1624976271&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUEzODlRQTNYN0U1MUpMJmVuY3J5cHRlZElkPUEwMTcxMjM0N0I5VEEyR05OMDlTJmVuY3J5cHRlZEFkSWQ9QTAwMDY3MzYxRkkzMkw4RE9FNlJLJndpZGdldE5hbWU9c3BfYXRmJmFjdGlvbj1jbGlja1JlZGlyZWN0JmRvTm90TG9nQ2xpY2s9dHJ1ZQ==");
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div[1]/div[3]/div/a[4]/div[1]/span[2]")).click();
		
		
	}
	
		
}

