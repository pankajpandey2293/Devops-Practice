package Pageobject;

import help.runnn;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class RegLog extends runnn {

	//
	public void hamburger() {
		WebElement el = driver.findElement(By.xpath("//img[@alt='hamburger-icon']"));
		el.click();
	}

	public void signinButton() {
		WebElement signInButton = driver.findElement(
				By.cssSelector("div[class='top-header_hamburger_menu__36ug6'] li:nth-child(1) a:nth-child(1)"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", signInButton);
	}

	public void enterPhone() {
		WebElement enterMobileNo = driver
				.findElement(By.xpath("//input[@placeholder='Enter Mobile Number / Email Id']"));
		enterMobileNo.sendKeys("9411311334");

	}

	public void sendOTP() throws InterruptedException {
		driver.findElement(By.xpath("//button[normalize-space()='Send OTP']")).click();
		Thread.sleep(2000);
	}

	public void resendOtp() throws InterruptedException {

//	driver.findElement(By.xpath("//button[normalize-space()='Resend Otp']")).click();
//	Thread.sleep(12000);
//	driver.findElement(By.cssSelector("button#moe-dontallow_button")).click();
//	driver.findElement(By.xpath("(//img[@alt='cancel icon'])[4]")).click();
	}

	public void verifyOTP() throws InterruptedException {
		Thread.sleep(25000);
		driver.findElement(By.xpath("(//button[normalize-space()='Verify Otp'])[1]")).click();
		Thread.sleep(10000);
//	driver.findElement(By.xpath("(//img[@alt='cancel icon'])[4]")).click();
//	driver.findElement(By.xpath("//button[normalize-space()='Verify Otp']")).click();
	}

	public void invalidMobile() throws InterruptedException {
		WebElement enterMobileNo = driver
				.findElement(By.xpath("//input[@placeholder='Enter Mobile Number / Email Id']"));
		enterMobileNo.sendKeys("qwertyuii");
		driver.findElement(By.xpath("//button[normalize-space()='Send OTP']")).click();
		Thread.sleep(2000);
		String alert = "Please enter the valid mobile number.";
		if (driver.getPageSource().contains("Please enter the valid mobile number.")) {
			System.out.println("Text: " + alert + " Alert is present. ");
		} else {
			System.out.println("Text: " + alert + " Alert is not present. ");
		}
	}

	public void randonMobile() throws InterruptedException {

		driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number / Email Id']")).clear();
		WebElement enterMobileNo = driver
				.findElement(By.xpath("//input[@placeholder='Enter Mobile Number / Email Id']"));
		enterMobileNo.sendKeys("123456788901");
		driver.findElement(By.xpath("//button[normalize-space()='Send OTP']")).click();
		String alert = "Please enter the valid mobile number.";
		Thread.sleep(2000);
		if (driver.getPageSource().contains("Please enter the valid mobile number.")) {
			System.out.println("Text: " + alert + " Alert is present. ");
		} else {
			System.out.println("Text: " + alert + " Alert is not present. ");
		}

	}

	public void register() {

		WebElement registerButton = driver.findElement(
				By.cssSelector("div[class='top-header_hamburger_menu__36ug6'] li:nth-child(2) a:nth-child(1)"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", registerButton);

	}

	public void registerUsedMobileNo() throws InterruptedException {
	WebElement enterMobileNo = driver.findElement(By.cssSelector("[name ='customer_number']"));
		
		enterMobileNo.sendKeys("9411311334");
		Thread.sleep(1000);
		WebElement pressSendOtpButton= driver.findElement(By.xpath("(//button[normalize-space()='Send Otp'])[1]"));
		pressSendOtpButton.click();
		Thread.sleep(1000);
		
		
		driver.navigate().to("https://www.kamaayurveda.in/customer/account/create");
		Thread.sleep(1000);
		
	WebElement invalidText  = driver.findElement(By.cssSelector("[name ='customer_number']"));
	invalidText.click();
	Thread.sleep(2000);
	invalidText.sendKeys("qwertyui123456");
	Thread.sleep(2000);
	WebElement invalidOTPClick = driver.findElement(By.xpath("(//button[normalize-space()='Send Otp'])[1]"));
	invalidOTPClick.click();
	driver.navigate().to("https://www.kamaayurveda.in/customer/account/create");
	WebElement usedno2 = driver.findElement(By.cssSelector("[name ='customer_number']"));
	usedno2.sendKeys("6398978848");
	driver.findElement(By.xpath("(//button[normalize-space()='Send Otp'])[1]")).click();

		
		//...................
//		WebElement enterMobileNo = driver.findElement(By.cssSelector("[name ='customer_number']"));
//		enterMobileNo.sendKeys("9411311334");
////		Thread.sleep(2000);
//		WebElement pressSendOtpButton= driver.findElement(By.xpath("(//button[normalize-space()='Send Otp'])[1]"));
//		JavascriptExecutor j = (JavascriptExecutor) driver;
//		j.executeScript("arguments[0].click();", pressSendOtpButton);
//		
//		Thread.sleep(2000);
//		enterMobileNo.clear();
//		Thread.sleep(2000);
//		WebElement enterMobileNo2 = driver.findElement(By.cssSelector("[name ='customer_number']"));
//		enterMobileNo2.sendKeys("qwertyu123");
//		WebElement pressSendOtpButton2= driver.findElement(By.xpath("(//button[normalize-space()='Send Otp'])[1]"));
//		JavascriptExecutor j2 = (JavascriptExecutor) driver;
//		j2.executeScript("arguments[0].click();", pressSendOtpButton2);
		//..............................................
////		Thread.sleep(2000);
//		String alertPopUp = "Customer already exists with this mobile number.";
//		Thread.sleep(1000);
//		if (driver.getPageSource().contains("Customer already exists with this mobile number.")) {
//			System.out.println("Text: " + alertPopUp + " Alert is present. ");
//		} else {
//			System.out.println("Text: " + alertPopUp + " Alert is not present. ");
//		}

	}

	public void clickONGoogle() throws InterruptedException {
		WebElement registerButton = driver.findElement(
				By.cssSelector("div[class='top-header_hamburger_menu__36ug6'] li:nth-child(2) a:nth-child(1)"));
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", registerButton);
		Thread.sleep(2000);
		WebElement Facebooklogin = driver.findElement(By.cssSelector("img[alt='facebook icon']"));
		JavascriptExecutor j2 = (JavascriptExecutor) driver;
		j2.executeScript("arguments[0].click();", Facebooklogin);
//	Facebooklogin.click();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(2000);
		WebElement el = driver.findElement(By.xpath("//img[@alt='hamburger-icon']"));
		el.click();
		Thread.sleep(2000);
		register();
		Thread.sleep(2000);

		WebElement Googlelogin = driver.findElement(By.cssSelector("img[alt='google plus icon']"));
		JavascriptExecutor j3 = (JavascriptExecutor) driver;
		j3.executeScript("arguments[0].click();", Googlelogin);
		Thread.sleep(5000);
		String welcomeGoogleMes = "Sign in with Google";
		if (driver.getPageSource().contains("Sign in with Google")) {
			System.out.println("Text: " + welcomeGoogleMes + " Text is present. ");
		} else {
			System.out.println("Text: " + welcomeGoogleMes + " Text is not present. ");
		}
		driver.navigate().back();

	}

}
