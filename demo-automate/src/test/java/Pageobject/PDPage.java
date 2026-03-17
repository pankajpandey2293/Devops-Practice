package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import help.runnn;

public class PDPage extends runnn {
//
	public void clickaproduct() throws InterruptedException {
		Thread.sleep(2000);
		WebElement ele = driver
				.findElement(By.xpath("(//h3[contains(text(),'kumkumadi illuminating & skin perfecting day cream')])[2]"));
//		Thread.sleep(2000);
		JavascriptExecutor click = (JavascriptExecutor) driver;
		click.executeScript("arguments[0].click();", ele);
		Thread.sleep(2000);
	}

	public void facebookIcon() throws InterruptedException {

		driver.findElement(By.xpath("(//img[@alt='facebook icon'])[1]")).click();
		Thread.sleep(2000);
		String originalWindow = driver.getWindowHandle();
		driver.switchTo().window(originalWindow);
	}
	
	public void twitterIcon() throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//img[@alt='twitter icon'])[1]")).click();
		Thread.sleep(1000);
		String originalWindow = driver.getWindowHandle();
		driver.switchTo().window(originalWindow);
//		Thread.sleep(2000);
//		WebElement marketingpopup = driver.findElement(By.xpath("(//img[@alt='cancel icon'])[4]"));
//		marketingpopup.click();
//		Thread.sleep(2000);
//		WebElement popup = driver.findElement(By.xpath("//button[@class='wig-btn-later ng-binding']"));
//		popup.click();
	}
	
	public void reviewButton() throws InterruptedException {
		
		WebElement reviews = driver.findElement(By.xpath("(//a[normalize-space()='5 Reviews'])[1]"));
		reviews.click();
		Thread.sleep(1000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("javascript:window.scrollBy(2900,2700)");
		Thread.sleep(1000);
		WebElement writeareview = driver.findElement(By.xpath("(//a[normalize-space()='Please sign in to write review'])[1]"));
//		writeareview.click();
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", writeareview);
//		JavascriptExecutor js2 = (JavascriptExecutor) driver;
//		js2.executeScript("javascript:window.scrollBy(850,650)");
		Thread.sleep(2000);
		driver.navigate().back();
		
	}
	
	public void imageslide () throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(850,650)");
		Thread.sleep(2000);
		WebElement ele = driver
				.findElement(By.xpath("(//a)[163]"));
		JavascriptExecutor click = (JavascriptExecutor) driver;
		click.executeScript("arguments[0].click();", ele);

		Thread.sleep(4000);
		WebElement zoomimage =  driver.findElement(By.xpath("(//img[@alt='zoom icon'])[1]"));
		zoomimage.click();
		Thread.sleep(1000);
		WebElement nextimage = driver.findElement(By.xpath("(//button[@title='Next image'])[1]"));
		nextimage.click();
		Thread.sleep(1000);
		nextimage.click();
		Thread.sleep(1000);
		nextimage.click();
		Thread.sleep(1000);
		nextimage.click();
		Thread.sleep(1000);
//		WebElement closeimagebutton =  driver.findElement(By.xpath("(//button[@title='Close lightbox'])[1]"));
//		closeimagebutton.click();
	}
	
	public void closeimage () {
		WebElement closeimagebutton =  driver.findElement(By.xpath("(//button[@title='Close lightbox'])[1]"));
		closeimagebutton.click();
	}
	
	
	public void simpl () throws InterruptedException {
		WebElement simpl = driver.findElement(By.xpath("(//img[@alt='info'])[1]"));
//		simpl.click();
		JavascriptExecutor click3 = (JavascriptExecutor) driver;
		click3.executeScript("arguments[0].click();", simpl);
		Thread.sleep(1000);
		WebElement simplclose = driver.findElement(By.xpath("(//img[@alt='cancel icon'])[2]"));
		simplclose.click();
	}
	
	public void selectAProduct() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(850,650)");
		Thread.sleep(2000);
		WebElement ele = driver
				.findElement(By.xpath("(//img[@title='Kumkumadi Facial Oil | Ayurvedic Night Serum​'])[2]"));
		JavascriptExecutor click = (JavascriptExecutor) driver;
		click.executeScript("arguments[0].click();", ele);
	}
	
	public void variant() throws InterruptedException {
		Thread.sleep(2000);
		WebElement varienttest = driver.findElement(By.xpath("(//a[normalize-space()='12 ml'])[1]"));
//		varienttest.click();
		JavascriptExecutor click2 = (JavascriptExecutor) driver;
		click2.executeScript("arguments[0].click();", varienttest);
		Thread.sleep(2000);
		WebElement varient2 = driver.findElement(By.xpath("(//a[normalize-space()='30 ml'])[1]"));
//		varient2.click();
		JavascriptExecutor click3 = (JavascriptExecutor) driver;
		click3.executeScript("arguments[0].click();", varient2);
		Thread.sleep(2000);
	}
	
	
	public void offer() throws InterruptedException {
		WebElement pdpoffer = driver.findElement(By.xpath(
				"(//a[@href='https://www.kamaayurveda.in/promotion'][contains(text(),'Complimentary 5 Piece Brilliance Beauty Box worth ')])[1]"));
//		pdpoffer.click();
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("arguments[0].click();", pdpoffer);

		Thread.sleep(2000);

		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("javascript:window.scrollBy(850,650)");
		driver.navigate().back();

	}
	
	public void selectAProd() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(850,650)");
		Thread.sleep(2000);
		WebElement ele = driver
				.findElement(By.xpath("(//img[@title='Kumkumadi Facial Oil | Ayurvedic Night Serum​'])[2]"));
		JavascriptExecutor click = (JavascriptExecutor) driver;
		click.executeScript("arguments[0].click();", ele);
	}
	
	public void checkPincode() throws InterruptedException {
		
		
		WebElement pin = driver.findElement(By.xpath("(//input[@name='pin'])[1]"));
		pin.sendKeys("263139");
//		Thread.sleep(2000);
		WebElement checkpincode = driver.findElement(By.xpath("(//button[normalize-space()='Check'])[1]"));
//		Thread.sleep(2000);
		JavascriptExecutor click2 = (JavascriptExecutor) driver;
		click2.executeScript("arguments[0].click();", checkpincode);
//		JavascriptExecutor js4 = (JavascriptExecutor) driver;
//		js4.executeScript("javascript:window.scrollBy(850,650)");
//		checkpincode.click();
		Thread.sleep(2000);
		pin.clear();
		pin.sendKeys("10000");
		checkpincode.click();
		Thread.sleep(2000);
		pin.clear();
		pin.sendKeys("110001");
		checkpincode.click();
		Thread.sleep(2000);
		pin.clear();
		pin.sendKeys("222222");
		checkpincode.click();
		Thread.sleep(2000);
		pin.clear();
		pin.sendKeys("226001");
		checkpincode.click();
		
	}
	
	public void selectProduct() throws InterruptedException {

		WebElement elem = driver
				.findElement(By.xpath("(//h3[contains(text(),'kumkumadi illuminating & skin perfecting day cream')])[2]"));
		JavascriptExecutor select = (JavascriptExecutor) driver;
		select.executeScript("arguments[0].click();", elem);
		Thread.sleep(2000);	
		WebElement addTOBag = driver.findElement(By.xpath("//button[normalize-space()='Add to Bag']"));
		JavascriptExecutor click2 = (JavascriptExecutor) driver;
		click2.executeScript("arguments[0].click();", addTOBag);
		Thread.sleep(2000);
		
		WebElement minicart = driver.findElement(By.xpath("(//img[@alt='bag icon'])[2]"));
		minicart.click();
		
//		
		
		
	}
	
	public void minicart() throws InterruptedException {
		Thread.sleep(4000);
		WebElement checkout = driver.findElement(By.xpath("(//a[normalize-space()='CHECKOUT'])[1]"));
		checkout.click();
		
		
	}
	
	public void checkoutt() throws InterruptedException {
		Thread.sleep(4000);
		driver.navigate().back();
	}
	
	public void chooseAProduct() throws InterruptedException  {
		
		WebElement ele = driver
				.findElement(By.xpath("(//img[@title='Kumkumadi Facial Oil | Ayurvedic Night Serum​'])[2]"));
//		Thread.sleep(2000);
		JavascriptExecutor click = (JavascriptExecutor) driver;
		click.executeScript("arguments[0].click();", ele);
		Thread.sleep(2000);
		
	}
	
	public void clickOnBuyNow() throws InterruptedException {
		Thread.sleep(1000);
		WebElement buynow = driver.findElement(By.xpath("(//button[normalize-space()='Buy Now'])[1]"));
//		buynow.click();
		Thread.sleep(1000);
		JavascriptExecutor click = (JavascriptExecutor) driver;
		click.executeScript("arguments[0].click();", buynow);
		Thread.sleep(6000);
		driver.navigate().back();
		Thread.sleep(3000);
	}
	}
