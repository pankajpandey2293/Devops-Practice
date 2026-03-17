package Pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import help.runnn;

public class Homepagecode  extends runnn {
	//
	public void Bestseller() {

		WebElement BestS = driver.findElement(By.xpath("//header/div[2]/div[1]/ul[1]/li[2]/a[1]"));
		BestS.click();
		String best = "Bestsellers";
		if (driver.getPageSource().contains("Haircare")) {
			System.out.println("Text: " + best + " Catagory is present. ");
		} else {
			System.out.println("Text: " + best + "Catagory is not present. ");

		}
	}

	public void Haircare() throws InterruptedException {
		Thread.sleep(2000);
		WebElement Haircare = driver.findElement(By.xpath("//header/div[2]/div[1]/ul[1]/li[3]/a[1]"));
		Haircare.click();
	}

	public void Skincare() {
		WebElement SkinCare = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/header[1]/div[2]/div[1]/ul[1]/li[4]/a[1]"));
		SkinCare.click();
//		JavascriptExecutor click = (JavascriptExecutor) driver;
//		click.executeScript("arguments[0].click();", SkinCare);

		String Skin = "Skincare";
		if (driver.getPageSource().contains("SkinCare")) {
			System.out.println("Text: " + Skin + " Catagory is present. ");
		} else {
			System.out.println("Text: " + Skin + "Catagory is not present. ");

		}

	}
	
	
	public void Bath() {
		WebElement Bath = driver
				.findElement(By.xpath("(//a[normalize-space()='Bath & Body'])[1]"));
	Bath.click();
		String BB = "Bath & Body";
		if (driver.getPageSource().contains("Bath & Body")) {
			System.out.println("Text: " + BB + " Catagory is present. ");
		} else {
			System.out.println("Text: " + BB + "Catagory is not present. ");

	}
		
	}
	
	public void Gifting() {
		WebElement Gift = driver.findElement(By.xpath("(//span[@class='navbar-desktop_new__90uPG'])[1]"));
		Gift.click();
		String Gifting = "Bath & Body";
		if (driver.getPageSource().contains("Gifting")) {
			System.out.println("Text: " + Gifting + " Catagory is present. ");
		} else {
			System.out.println("Text: " + Gifting + "Catagory is not present. ");
			
		}
	}

	
	public void men() {
		
		WebElement Men = driver.findElement(By.xpath("//header/div[2]/div[1]/ul[1]/li[7]/a[1]"));
		Men.click();
//		JavascriptExecutor jwe = (JavascriptExecutor) driver;
//		jwe.executeScript("arguments[0].click();", Men);

		String Mens = "Men's";

		if (driver.getPageSource().contains("Men's")) {
			System.out.println("Text: " + Mens + " Catagory is present. ");
		} else {
			System.out.println("Text: " + Mens + "Catagory is not present. ");

		}

	}
	
	
	
	public void Wellness() {
		
		WebElement Wellne = driver.findElement(By.xpath("//header/div[2]/div[1]/ul[1]/li[7]/a[1]"));
		Wellne.click();
		String Wellness = "Energy Enhancers";
		if (driver.getPageSource().contains("Energy Enhancers")) {
			System.out.println("Text: " + Wellness + " Catagory is present. ");
		} else {
			System.out.println("Text: " + Wellness + "Catagory is not present. ");

		}
	}
	
	public void Website_exclusive() {

		WebElement WebsiteExclusive = driver.findElement(By.xpath("//header/div[2]/div[1]/ul[1]/li[7]/a[1]"));
		WebsiteExclusive.click();
		String Exclusive = "Website Exclusive";
		if (driver.getPageSource().contains("Website Exclusive")) {
			System.out.println("Text: " + Exclusive + " Catagory is present. ");
		} else {
			System.out.println("Text: " + Exclusive + "Catagory is not present. ");

		}
		
	}
	
	public void All_Product() {
		
		WebElement Allproduct = driver.findElement(By.xpath("(//a[normalize-space()='All Products'])[1]"));
		Allproduct.click();
		String Allproducts = "Shop";
		if (driver.getPageSource().contains("Shop")) {
			System.out.println("Text: " + Allproducts + " Catagory is present. ");
		} else {
			System.out.println("Text: " + Allproducts + "Catagory is not present. ");

		}
	}
	
public void hamburgurIconCheck() {

	WebElement Ham = driver.findElement(By.xpath("//img[@alt='hamburger-icon']"));
	Ham.click();
		}


public void hamburgurClose() throws InterruptedException {
	Thread.sleep(2000);
	WebElement close= driver.findElement(By.cssSelector("[height='12px']"));		
	close.click();
	JavascriptExecutor j = (JavascriptExecutor) driver;
	j.executeScript("arguments[0].click();", close);
		

		}
public void signInButton() {
	
	WebElement el = driver.findElement(By.xpath("//img[@alt='hamburger-icon']"));
	el.click();
	WebElement signInButton = driver.findElement(
			By.cssSelector("div[class='top-header_hamburger_menu__36ug6'] li:nth-child(1) a:nth-child(1)"));
	JavascriptExecutor j = (JavascriptExecutor) driver;
	j.executeScript("arguments[0].click();", signInButton);
	
}


public void register() {
	
	WebElement el = driver.findElement(By.xpath("//img[@alt='hamburger-icon']"));
	el.click();
	WebElement RegisterInButton = driver.findElement(
			By.cssSelector("div[class='top-header_hamburger_menu__36ug6'] li:nth-child(2) a:nth-child(1)"));
	JavascriptExecutor j = (JavascriptExecutor) driver;
	j.executeScript("arguments[0].click();", RegisterInButton);
	
}

public void mycart() {
driver.navigate().to("https://www.kamaayurveda.in/checkout/cart");
}

public void account() {
driver.navigate().to("https://www.kamaayurveda.in/customer/account");
}


public void wishlist() {
driver.navigate().to("https://www.kamaayurveda.in/wishlist");
}

public void trackorder() {
driver.navigate().to("https://www.kamaayurveda.in/sales/guest/form");
}

public void minicart() {
WebElement  mini = driver.findElement(By.cssSelector("[alt='bag icon']"));
JavascriptExecutor j = (JavascriptExecutor) driver;
j.executeScript("arguments[0].click();", mini);
}


public void allProduct() {

}

public void skin() {
	driver.navigate().to("https://www.kamaayurveda.in/skin.html");
	
}

public void hair() {
	driver.navigate().to("https://www.kamaayurveda.in/hair.html");
}

public void bath() {
	driver.navigate().to("https://www.kamaayurveda.in/bath-body.html");	
}

public void Mens() {
	driver.navigate().to("https://www.kamaayurveda.in/men.html");	
}

public void best() {
	driver.navigate().to("https://www.kamaayurveda.in/best-seller.html");	
}

public void gift() {
	driver.navigate().to("https://www.kamaayurveda.in/gifting.html");	
}

public void ecard() {
	driver.navigate().to("https://www.kamaayurveda.in/gifting/e-gift-card");	
}


public void press() {
	driver.navigate().to("https://www.kamaayurveda.in/pressrelease");	
}

public void del() {
	driver.navigate().to("https://www.kamaayurveda.in/returns-refunds");	
}



public void faq() {
	driver.navigate().to("https://www.kamaayurveda.in/faqs");	
}


public void privat() {
	driver.navigate().to("https://www.kamaayurveda.in/privacy-policy");	
}

public void term() {
	driver.navigate().to("https://www.kamaayurveda.in/terms-conditions");	
}

public void about() {
	driver.navigate().to("https://www.kamaayurveda.in/about-us");

}

public void ingredients () {
	driver.navigate().to("https://www.kamaayurveda.in/ingredient");

}

public void amaya () {
	driver.navigate().to("https://www.kamaayurveda.in/amaaya");

}

public void corporate () {
	driver.navigate().to("https://www.kamaayurveda.in/corporate-gifting");

}

public void experience () {
	driver.navigate().to("https://www.kamaayurveda.in/experience-center");
	
}

public void store() {
	driver.navigate().to("https://www.kamaayurveda.in/store");
		
}

public void career() {
	driver.navigate().to("https://www.kamaayurveda.in/career");
	
}

public void promo() {
	driver.navigate().to("https://www.kamaayurveda.in/promotion");
	
}

public void blogg() {
	driver.navigate().to("https://www.kamaayurveda.in/blog");
	
	}
	

public void hotel() {
	
	driver.navigate().to("https://www.kamaayurveda.in/hotels-and-spas");
}


public void international(){
	driver.navigate().to("https://www.kamaayurveda.in/international");
	
}


public void national(){
	driver.navigate().to("https://www.kamaayurveda.in/");
	
}

public void naz(){
	driver.navigate().to("https://www.kamaayurveda.in/blog/naz-foundation");
	
}


public void logo() {
	WebElement logoclick = driver.findElement(By.cssSelector("img[alt='logo icon']"));
	logoclick.click();
}

public void search() {
	WebElement Searchbar = driver.findElement(By.cssSelector("img[alt='search icon']"));
	Searchbar.click();
}

public void searchText() throws InterruptedException {
	WebElement Searchbartext = driver.findElement(By.cssSelector("input[placeholder='Search...']"));
	Searchbartext.sendKeys("Cream");
	Thread.sleep(1000);
	WebElement searchbarback = driver.findElement(By.xpath("(//img[@alt='back-arrow'])[1]"));
	searchbarback.click();
	Thread.sleep(1000);
	WebElement searchitem = driver.findElement(By.cssSelector("img[alt='search icon']"));
	searchitem.click();
	
	WebElement Searchbartext2 = driver.findElement(By.cssSelector("input[placeholder='Search...']"));
	Searchbartext2.sendKeys("Oil");
//	Thread.sleep(3000);
}

public void searchBack() throws InterruptedException {
	WebElement searchbarback = driver.findElement(By.cssSelector("img[alt='back-arrow']"));
	searchbarback.click();
	Thread.sleep(1000);
}

public void currency() throws InterruptedException {
	driver.findElement(By.cssSelector("[class='navbar-desktop_inr-desk__2Y-wz']")).click();
	Select objSelect =new Select(driver.findElement(By.id("lang")));
//	objSelect.selectByVisibleText("international");
	objSelect.selectByIndex(1);
	Thread.sleep(2000);
	Select objSelect2 =new Select(driver.findElement(By.id("lang")));
	objSelect2.selectByIndex(0);
		
}


}	
	

