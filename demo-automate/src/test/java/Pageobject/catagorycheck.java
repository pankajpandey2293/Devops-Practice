package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import help.runnn;

public class catagorycheck extends runnn {

	public void userSelectACatagory() {

		WebElement BestS = driver.findElement(By.xpath("//header/div[2]/div[1]/ul[1]/li[2]/a[1]"));
		BestS.click();
	}

	public void validateCatagory() {
		String best = "Bestsellers";
		if (driver.getPageSource().contains("Haircare")) {
			System.out.println("Text: " + best + " Catagory is present. ");
		} else {
			System.out.println("Text: " + best + "Catagory is not present. ");

		}

	}
	
	public void userAppliedTheFilter() throws InterruptedException {
//		Thread.sleep(2000);
		WebElement filter = driver.findElement(By.xpath("(//select[@name='sortprice'])[1]"));
		
		Select objSelect = new Select(filter);
		objSelect.selectByValue("most popular");
		Thread.sleep(2000);
		objSelect.selectByValue("asc");
		Thread.sleep(2000);
		objSelect.selectByValue("desc");
		Thread.sleep(2000);
		
	}

	
	public void sortProduct() throws InterruptedException {
		WebElement SkinCare = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/header[1]/div[2]/div[1]/ul[1]/li[4]/a[1]"));
		SkinCare.click();
//		JavascriptExecutor click = (JavascriptExecutor) driver;
//		click.executeScript("arguments[0].click();", SkinCare);
		String Skin = "Skincare";
		if (driver.getPageSource().contains("SkinCare")) {
			System.out.println("Text: " + Skin + " Catagory is present. ");
		} else {
			System.out.println("Text: " + Skin + "Catagory is  present. ");

		}
		WebElement filter = driver.findElement(By.cssSelector("div[class='Products_select_size__uQUSV'] a"));
		filter.click();
		Thread.sleep(2000);
		WebElement ele = driver.findElement(By.xpath("(//a[normalize-space()='Male'])[1]"));
			JavascriptExecutor j = (JavascriptExecutor) driver;
			j.executeScript("arguments[0].click();", ele);
		 

	}
	
	public void ableTOScroll() throws InterruptedException {
		
		WebElement Haircare = driver.findElement(By.xpath("//header/div[2]/div[1]/ul[1]/li[3]/a[1]"));
		Haircare.click();
		Thread.sleep(4000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("javascript:window.scrollBy(2900,2700)");
		Thread.sleep(2000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("javascript:window.scrollBy(-2900,-2700)");
		Thread.sleep(4000);
		
		
	}
	
	
	public void selectAProductCheckout() throws InterruptedException {
		WebElement Bath = driver
				.findElement(By.xpath("(//a[normalize-space()='Bath & Body'])[1]"));
	Bath.click();
		String BB = "Bath & Body";
		if (driver.getPageSource().contains("Bath & Body")) {
			System.out.println("Text: " + BB + " Catagory is present. ");
		} else {
			System.out.println("Text: " + BB + "Catagory is not present. ");

	}
		
		Thread.sleep(4000);

		Actions actions = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//h3[normalize-space()='kokum almond body moisturiser']"));

		actions.moveToElement(ele).build().perform();
//Move mouse pointer away 

		
	
		
//		JavascriptExecutor js3 = (JavascriptExecutor) driver;
//		js3.executeScript("javascript:window.scrollBy(890,870)");
//		
//		Thread.sleep(5000);
		
		
		
	}
	
	
	}

