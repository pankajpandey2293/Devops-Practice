package help;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class runnn {

	public static WebDriver driver;
	public static	Properties prop ;
	static {

		try {
			FileInputStream file = new FileInputStream(
					"C:\\Users\\PW\\eclipse-workspace\\demo-automate\\src\\test\\java\\Resources\\env.properties");
			 prop = new Properties();
			prop.load (file);
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Before
	public void setup() throws InterruptedException  {

		String browserName = prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox")) {
			driver = new FirefoxDriver();	
		}
		else if (browserName.equals("edge")) {
			driver = new EdgeDriver();
			}	
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		Thread.sleep(10000);
//		driver.findElement(By.cssSelector("button#moe-dontallow_button")).click();
//		driver.findElement(By.xpath("(//img[@alt='cancel icon'])[4]")).click();

	}

	@After
	public void tearDown(Scenario s)throws IOException {
		if(s.isFailed()) {
			
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			 FileHandler.copy(src, new File("screenshots/"+s.getName()+".png"));
		}
		driver.quit();
	}
	
	
}

