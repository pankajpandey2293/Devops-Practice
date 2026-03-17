//package stepdefinition;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pageObject.LoginKama;
//
//public class LoginFunctionality extends LoginKama {
//
//	//cnt +shift + o
//	 WebDriver driver; 
////	LoginKama sign = new LoginKama();
//	
//	
//	@Given("user launch the site url")
//	public void user_launch_the_site_url() throws InterruptedException {
//	    // Write code here that turns the phrase above into concrete actions
//		
//		
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		System.out.println("lauch url");
//		driver.get("https://www.kamaayurveda.in/");
//		driver.manage().window().maximize();
//		Thread.sleep(10000);
//		driver.findElement(By.cssSelector("button#moe-dontallow_button")).click();
//		driver.findElement(By.xpath("(//img[@alt='cancel icon'])[4]")).click();
//		Thread.sleep(2000);	
//	}
//
//	@When("user click on hamburgor icon and sign in button")
//	public void user_click_on_hamburgor_icon_and_sign_in_button() throws InterruptedException {
//	    // Write code here that turns the phrase above into concrete actions
////		login_functionality_kama();
//		WebElement el = driver.findElement(By.xpath("//img[@alt='hamburger-icon']"));
//		el.click();
////		WebElement signInButtono =driver.findElement(By.xpath("(//a[normalize-space()='Sign in'])[1]"));
////		signInButton.click();
//
//		WebElement signInButton = driver.findElement(
//				By.cssSelector("div[class='top-header_hamburger_menu__36ug6'] li:nth-child(1) a:nth-child(1)"));
//		JavascriptExecutor j = (JavascriptExecutor) driver;
//		j.executeScript("arguments[0].click();", signInButton);
//
//		WebElement enterMobileNo = driver
//				.findElement(By.xpath("//input[@placeholder='Enter Mobile Number / Email Id']"));
//		enterMobileNo.sendKeys("9411311334");
//
//		driver.findElement(By.xpath("//button[normalize-space()='Send OTP']")).click();
//		driver.findElement(By.xpath("//button[normalize-space()='Verify Otp']")).click();
//		driver.findElement(By.xpath("//button[@class='btn-close']")).click();
////		Thread.sleep(5000);
//		WebElement Register= driver.findElement(By.xpath("//a[@href='/customer/account/create']"));
//		JavascriptExecutor p = (JavascriptExecutor) driver;
//		p.executeScript("arguments[0].click();", Register);
//		
//		
//		WebElement enterNewMobileNo = driver.findElement(By.xpath("//div[@class='w-100']//input[@placeholder='Mobile Number*']"));
//		enterNewMobileNo.sendKeys("9871403770");
//		WebElement sendOtp=driver.findElement(By.xpath("//button[normalize-space()='Send Otp']"));
//		sendOtp.click();
//		Thread.sleep(5000);
//		WebElement closeButton = driver.findElement(By.xpath("//button[@class='btn-close']"));
//		closeButton.click();
//	    
//	}
//
//	@Then("enter the user no.")
//	public void enter_the_user_no() throws InterruptedException {
//	    // Write code here that turns the phrase above into concrete actions
//	    System.out.println("i am a another method");
//		String Text = "Customer already exists with this mobile number.";
//		WebElement enterUnregisteredMobile1 = driver.findElement(By.cssSelector("[name='customer_number']"));
//		enterUnregisteredMobile1.sendKeys("9411311334");
//				WebElement sendOtpButton1 = driver.findElement(By.cssSelector("div[class='login_account_login_main__1sren'] div div:nth-child(2) button:nth-child(1)"));
//				sendOtpButton1.click();
//				Thread.sleep(2000);
//				
//		 if (driver.getPageSource().contains("Customer already exists with this mobile number.")) {
//	            System.out.println("Text: " + Text + " is present. ");
//	        } else {
//	            System.out.println("Text: " + Text + " is not present. ");
//	            }
//		 
//		 
//		 Thread.sleep(2000);
//		 enterUnregisteredMobile1.sendKeys("7668333901");
//		 
//		String Invalid ="Mobile number is not valid";
//		Thread.sleep(2000);
//		 if (driver.getPageSource().contains("Mobile number is not valid")) {
//	            System.out.println("Text: " + Invalid + " is there on the screen. when we make wrong inputs ");
//	        } else {
//	            System.out.println("Text: " + Invalid + " is not present when we make wrong inputs. ");
//	            }
//		WebElement clearForm =driver.findElement(By.cssSelector("[name='customer_number']"));
//		
//	    clearForm.sendKeys(Keys.chord(Keys.CONTROL,"a", Keys.DELETE));
//		Thread.sleep(2000);
////		clearForm.clear();
////		clearForm.sendKeys(Keys.SPACE, Keys.BACK_SPACE);
//		 enterUnregisteredMobile1.sendKeys("7668333901");
//		 sendOtpButton1.click();
//		WebElement closeButton1= driver.findElement(By.cssSelector("button[class='btn-close']"));
//		closeButton1.click();
//		
//		Thread.sleep(2000);
//		driver.get("https://www.kamaayurveda.in/customer/account/create");
//		//WebElement facebookRegistration = driver.findElement(By.className("div[class='login_account_login_main__1sren'] a:nth-child(1)"));
//		
//		driver.get("https://www.kamaayurveda.in/");	
//		System.out.println("Login and registration test pass");
//	    
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("verfy the no.")
//	public void verfy_the_no() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	    
//	    
//	}
//
//
//
//	
//}
