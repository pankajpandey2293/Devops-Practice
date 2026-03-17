package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import help.runnn;

public class checkout extends runnn   {
	//

	public void selectingAPoroduct() throws InterruptedException {

		Thread.sleep(2000);
		WebElement ele = driver
				.findElement(By.xpath("(//img[@title='Kumkumadi Facial Oil | Ayurvedic Night Serum​'])[2]"));
//		Thread.sleep(2000);
		JavascriptExecutor click = (JavascriptExecutor) driver;
		click.executeScript("arguments[0].click();", ele);
//		Thread.sleep(1000);
	}

	public void userSelectTheProduct() {
		System.out.println("user selected the product");
	}
	

	public void buynow() throws InterruptedException {
		WebElement buynow = driver.findElement(By.xpath("(//button[normalize-space()='Buy Now'])[1]"));
//		buynow.click();
//		Thread.sleep(1000);
		JavascriptExecutor click = (JavascriptExecutor) driver;
		click.executeScript("arguments[0].click();", buynow);

	}

	public void addShippingAddress() throws InterruptedException {

//		driver.findElement(By.cssSelector("button#moe-dontallow_button")).click();
//		driver.findElement(By.xpath("(//img[@alt='cancel icon'])[4]")).click();
		WebElement phoneNo = driver.findElement(By.xpath("//input[@id='telephone']"));
		phoneNo.sendKeys("9410118129");

		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys("pankajpandey22293@gmail.com");

		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys("Pankaj");

		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastName.sendKeys("pandey");

		WebElement pincode = driver.findElement(By.xpath("//input[@id='postcode']"));
		pincode.sendKeys("263139");

		WebElement city = driver.findElement(By.xpath("//input[@id='city']"));
		city.sendKeys("Haldwani");

		WebElement country = driver.findElement(By.xpath("//div[@id='country']"));
		country.sendKeys("India");
		Thread.sleep(1000);
		WebElement state = driver.findElement(By.xpath("//div[@id='state']"));
		state.sendKeys("Uttrakhand");
		Thread.sleep(1000);
		WebElement adress = driver.findElement(By.xpath("//textarea[@id='street']"));
		adress.sendKeys(
				"Durgapal Garden, Badi Mukhani, Pilikothi, Badi Mukhani, Pilikothi\r\n" + "Badi Mukhani, Pilikothi");
		Thread.sleep(1000);

	}

	public void proceedToPayement() throws InterruptedException {

		WebElement proceedToPayment = driver.findElement(By.xpath("//button[normalize-space()='Proceed to Payment']"));
//		 proceedToPayment.click();

		JavascriptExecutor check = (JavascriptExecutor) driver;
		check.executeScript("arguments[0].click();", proceedToPayment);
		Thread.sleep(2000);
	}

	public void clickOnThePayment() throws InterruptedException {

		Thread.sleep(2000);
		WebElement clickPayment = driver.findElement(By.xpath("(//input[@value='razorpay'])[1]"));
		clickPayment.click();
		JavascriptExecutor check1 = (JavascriptExecutor) driver;
		check1.executeScript("arguments[0].click();", clickPayment);
		Thread.sleep(2000);
		WebElement obj = driver
				.findElement(By.xpath("//span[contains(text(),'Credit Card / Debit Card / NetBanking / UPI / Phon')]"));
		obj.click();
		Thread.sleep(2000);
//		
		WebElement payButton = driver.findElement(By.cssSelector("div[class='deskbtn'] button[type='button']"));
		JavascriptExecutor payonline = (JavascriptExecutor) driver;
		payonline.executeScript("arguments[0].click();", payButton);
		Thread.sleep(5000);
	}

	public void productclick() throws InterruptedException {
		WebElement logoclick = driver.findElement(By.cssSelector("img[alt='logo icon']"));
		logoclick.click();
		Thread.sleep(2000);
		WebElement ele = driver
				.findElement(By.xpath("(//img[@title='Kumkumadi Facial Oil | Ayurvedic Night Serum​'])[2]"));
		JavascriptExecutor click = (JavascriptExecutor) driver;
		click.executeScript("arguments[0].click();", ele);

	}

	public void buynowButton() {
		WebElement buynow = driver.findElement(By.xpath("(//button[normalize-space()='Buy Now'])[1]"));
		JavascriptExecutor click = (JavascriptExecutor) driver;
		click.executeScript("arguments[0].click();", buynow);
	}

	public void selectAnAddress() throws InterruptedException {
//		Thread.sleep(2000);
		WebElement selectaddredd = driver.findElement(By.cssSelector("div[class='col-12 col-md-6']"));
		JavascriptExecutor click = (JavascriptExecutor) driver;
		click.executeScript("arguments[0].click();", selectaddredd);
////		selectaddredd.click();
		Thread.sleep(3000);
	}

	public void procToPayment() throws InterruptedException {
		WebElement proceedToPayment = driver.findElement(By.xpath("//button[@type='button'][normalize-space()='Proceed to Payment']"));
//		 proceedToPayment.click();

		JavascriptExecutor check = (JavascriptExecutor) driver;
		check.executeScript("arguments[0].click();", proceedToPayment);
		Thread.sleep(2000);
		WebElement clickPayment = driver.findElement(By.xpath("(//input[@value='razorpay'])[1]"));
		clickPayment.click();
		JavascriptExecutor check1 = (JavascriptExecutor) driver;
		check1.executeScript("arguments[0].click();", clickPayment);
		Thread.sleep(2000);
		WebElement obj = driver
				.findElement(By.xpath("//span[contains(text(),'Credit Card / Debit Card / NetBanking / UPI / Phon')]"));
		obj.click();
		Thread.sleep(2000);
//		
		WebElement payButton = driver.findElement(By.cssSelector("div[class='deskbtn'] button[type='button']"));
		JavascriptExecutor payonline = (JavascriptExecutor) driver;
		payonline.executeScript("arguments[0].click();", payButton);
		Thread.sleep(5000);

	}
	
 public void selectingProduct() throws InterruptedException {
	 
		WebElement logoclick = driver.findElement(By.cssSelector("img[alt='logo icon']"));
		logoclick.click();
		Thread.sleep(2000);
		WebElement ele = driver
				.findElement(By.xpath("(//img[@title='Kumkumadi Facial Oil | Ayurvedic Night Serum​'])[2]"));
		JavascriptExecutor click = (JavascriptExecutor) driver;
		click.executeScript("arguments[0].click();", ele);
	 
	JavascriptExecutor click1 = (JavascriptExecutor) driver;
	click1.executeScript("arguments[0].click();", ele);
	
	WebElement buynow = driver.findElement(By.xpath("(//button[normalize-space()='Buy Now'])[1]"));
	JavascriptExecutor click2 = (JavascriptExecutor) driver;
	click2.executeScript("arguments[0].click();", buynow);
	
	Thread.sleep(9000);
	
	

 }
 
 public void addAddress() throws InterruptedException {
	 
	 WebElement addNewaddress = driver.findElement(By.xpath("(//a[normalize-space()='Add New Address'])[1]"));
		addNewaddress.click();
		Thread.sleep(9000);
		WebElement pincode = driver.findElement(By.xpath("(//input[@id='postcode'])[1]"));
		pincode.sendKeys("263139");
		
		WebElement street = driver.findElement(By.xpath("(//textarea[@id='street'])[1]"));
		street.sendKeys("Test123");
		
		WebElement proceedtopayment = driver.findElement(By.xpath("(//button[normalize-space()='Proceed to Payment'])[1]"));
		proceedtopayment.click();
 }
 
 
 public void payment() throws InterruptedException{
	 
	 WebElement clickPayment = driver.findElement(By.xpath("(//input[@value='razorpay'])[1]"));
		clickPayment.click();
		JavascriptExecutor check1 = (JavascriptExecutor) driver;
		check1.executeScript("arguments[0].click();", clickPayment);
		Thread.sleep(2000);
		WebElement obj = driver
				.findElement(By.xpath("//span[contains(text(),'Credit Card / Debit Card / NetBanking / UPI / Phon')]"));
		obj.click();
		Thread.sleep(2000);
//		
		WebElement payButton = driver.findElement(By.cssSelector("div[class='deskbtn'] button[type='button']"));
		JavascriptExecutor payonline = (JavascriptExecutor) driver;
		payonline.executeScript("arguments[0].click();", payButton);
		Thread.sleep(5000);
 }
}


