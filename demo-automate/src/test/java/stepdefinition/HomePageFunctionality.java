//package stepdefinition;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//
//public class HomePageFunctionality {
//
//	WebDriver driver;
//
//	@Given("user launch the site url")
//	public void user_launch_the_site_url() throws InterruptedException {
//		// Write code here that turns the phrase above into concrete actions
////	    throw new io.cucumber.java.PendingException();
//
//		System.out.println("Site open properly ");
//	}
//
//	@Then("user click on all the catagories")
//	public void user_click_on_all_the_catagories() throws InterruptedException {
//		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://www.kamaayurveda.in/");
//		driver.manage().window().maximize();
//		
//		Thread.sleep(10000);
//		driver.findElement(By.cssSelector("button#moe-dontallow_button")).click();
//		driver.findElement(By.xpath("(//img[@alt='cancel icon'])[4]")).click();
//		
//		WebElement Kumkumadi = driver.findElement(By.xpath("(//a[normalize-space()='Kumkumadi Essentials'])[1]"));
//		Kumkumadi.click();
//		String t = " Kumkumadi Essentials";
//		if (driver.getPageSource().contains(" Kumkumadi Essentials")) {
//			System.out.println("Text: " + t + " Catagory is present. ");
//		} else {
//			System.out.println("Text: " + t + "Catagory is not present. ");
//
//		}
//
//		
//
//		WebElement BestS = driver.findElement(
//				By.xpath("//header/div[2]/div[1]/ul[1]/li[2]/a[1]"));
//		BestS.click();
//		String best = "Bestsellers";
//		if (driver.getPageSource().contains("Haircare")) {
//			System.out.println("Text: " + best + " Catagory is present. ");
//		} else {
//			System.out.println("Text: " + best + "Catagory is not present. ");
//
//		}
//		
//		
//		Thread.sleep(2000);
//		WebElement Haircare = driver.findElement(
//				By.xpath("//header/div[2]/div[1]/ul[1]/li[3]/a[1]"));
//		Haircare.click();
//		
////		
//
//		
//		Thread.sleep(2000);
//		
//		WebElement SkinCare = driver.findElement(
//				By.linkText("Skincare"));
//		SkinCare.click();
////		JavascriptExecutor click = (JavascriptExecutor) driver;
////		click.executeScript("arguments[0].click();", SkinCare);
////
//		String Skin = "Skincare";
//		if (driver.getPageSource().contains("SkinCare")) {
//			System.out.println("Text: " + Skin + " Catagory is present. ");
//		} else {
//			System.out.println("Text: " + Skin + "Catagory is not present. ");
//
//		}
////		
//		
//		
//		WebElement Bath = driver
//				.findElement(By.xpath("(//a[normalize-space()='Bath & Body'])[1]"));
//		Bath.click();
//		String BB = "Bath & Body";
//		if (driver.getPageSource().contains("Bath & Body")) {
//			System.out.println("Text: " + BB + " Catagory is present. ");
//		} else {
//			System.out.println("Text: " + BB + "Catagory is not present. ");
//
//		}
//		
//		
//		
//		WebElement Gift = driver.findElement(By.xpath("(//span[@class='navbar-desktop_new__90uPG'])[1]"));
//		Gift.click();
//		String Gifting = "Bath & Body";
//		if (driver.getPageSource().contains("Gifting")) {
//			System.out.println("Text: " + Gifting + " Catagory is present. ");
//		} else {
//			System.out.println("Text: " + Gifting + "Catagory is not present. ");
//
//		}
//		
//		
//		
//		WebElement Men = driver.findElement(By.xpath("//header/div[2]/div[1]/ul[1]/li[7]/a[1]"));
//		Men.click();
////		JavascriptExecutor jwe = (JavascriptExecutor) driver;
////		jwe.executeScript("arguments[0].click();", Men);
//
//		String Mens = "Men's";
//
//		if (driver.getPageSource().contains("Men's")) {
//			System.out.println("Text: " + Mens + " Catagory is present. ");
//		} else {
//			System.out.println("Text: " + Mens + "Catagory is not present. ");
//
//		}
//
//		
//		
//		
//		WebElement Wellne = driver.findElement(By.xpath("//header/div[2]/div[1]/ul[1]/li[7]/a[1]"));
//		Wellne.click();
//		String Wellness = "Energy Enhancers";
//		if (driver.getPageSource().contains("Energy Enhancers")) {
//			System.out.println("Text: " + Wellness + " Catagory is present. ");
//		} else {
//			System.out.println("Text: " + Wellness + "Catagory is not present. ");
//
//		}
//		
//		
//
//		WebElement WebsiteExclusive = driver.findElement(By.xpath("//header/div[2]/div[1]/ul[1]/li[7]/a[1]"));
//		WebsiteExclusive.click();
//		String Exclusive = "Website Exclusive";
//		if (driver.getPageSource().contains("Website Exclusive")) {
//			System.out.println("Text: " + Exclusive + " Catagory is present. ");
//		} else {
//			System.out.println("Text: " + Exclusive + "Catagory is not present. ");
//
//		}
//		
//		WebElement Allproduct = driver.findElement(By.xpath("(//a[normalize-space()='All Products'])[1]"));
//		Allproduct.click();
//		String Allproducts = "Shop";
//		if (driver.getPageSource().contains("Shop")) {
//			System.out.println("Text: " + Allproducts + " Catagory is present. ");
//		} else {
//			System.out.println("Text: " + Allproducts + "Catagory is not present. ");
//
//		}
//		
//		WebElement logoclick = driver.findElement(By.cssSelector("img[alt='logo icon']"));
//		logoclick.click();
//		Thread.sleep(2000);
//		WebElement Searchbar = driver.findElement(By.cssSelector("img[alt='search icon']"));
//		Searchbar.click();
//		Thread.sleep(2000);
//		
//		WebElement Searchbartext = driver.findElement(By.cssSelector("input[name='search']"));
//		Searchbartext.sendKeys("Cream");
//		Thread.sleep(2000);
//		
//		WebElement searchbarback = driver.findElement(By.cssSelector("img[alt='back-arrow']"));
//		searchbarback.click();
//		Thread.sleep(2000);
//		
//		System.out.println("Search functionality is working fine ");
////		searchbarback.click();
//		Thread.sleep(2000);
//		
//		WebElement viewall = driver.findElement(By.xpath("//a[@href='/kumkumadi-essentials.html'][normalize-space()='View All']"));
////		viewall.click();
//		
//		Thread.sleep(2000);
//		JavascriptExecutor click1 = (JavascriptExecutor) driver;
//		click1.executeScript("arguments[0].click();", viewall);
//		
//		
//		WebElement logoclick2 = driver.findElement(By.xpath("//img[@alt='logo icon']"));
////		logoclick2.click();
//		JavascriptExecutor logo = (JavascriptExecutor) driver;
//		logo.executeScript("arguments[0].click();", logoclick2);
//		Thread.sleep(2000);
//		
////		WebElement RadientBoost = driver.findElement(By.xpath("//a[@href='/suvarna-haldi-chandan-face-pack.html'][normalize-space()='Shop Now']"));
////		RadientBoost.click();
////		JavascriptExecutor js = (JavascriptExecutor) driver;
////		js.executeScript("javascript:window.scrollBy(1800,650)");
//		
//		JavascriptExecutor logo1 = (JavascriptExecutor) driver;
//		logo1.executeScript("window.scrollBy(0,300)", "");
//		
//		WebElement Contactus = driver.findElement(By.cssSelector("a[href='/contact-us']"));
////		Contactus.click();
//		JavascriptExecutor contact = (JavascriptExecutor) driver;
//		contact.executeScript("arguments[0].click();", Contactus);
//		String contact1= "contact";
//		if (driver.getPageSource().contains("Contact us")) {
//			System.out.println("Text: " + contact1 + " Catagory is present. ");
//		} else {
//			System.out.println("Text: " + contact1 + "Catagory is not present. ");
//
//		}
//	
//	
//		driver.navigate().to("https://www.kamaayurveda.in/pressrelease");
//		System.out.println("press realise at the footer working correctly ");
//		
//		//...............................................................
//		
//		driver.navigate().to("https://www.kamaayurveda.in/returns-refunds");
//		System.out.println("Return-Refund at the footer working correctly ");
//		
//		//...............................................................
//		
//		driver.navigate().to("https://www.kamaayurveda.in/faqs");
//		System.out.println("faqs at the footer working correctly ");
//		
//		//...............................................................
//		
//		driver.navigate().to("https://www.kamaayurveda.in/privacy-policy");
//		System.out.println("privacy-policy at the footer working correctly ");
//		
//		//...............................................................
//		
//		driver.navigate().to("https://www.kamaayurveda.in/terms-conditions");
//		System.out.println("terms-conditions at the footer working correctly ");
//		
//		//........................................................
//		
//		driver.navigate().to("https://www.kamaayurveda.in/ingredient");
//		System.out.println("ingredient at the footer working correctly ");
//		
//		//........................................................
//		
//		
//		driver.navigate().to("https://www.kamaayurveda.in/amaaya");
//		System.out.println("amaaya at the footer working correctly ");
//		
//		//........................................................
//		
//		driver.navigate().to("	https://www.kamaayurveda.in/corporate-gifting");
//		System.out.println("corporate-gifting at the footer working correctly ");
//		
//		//.............................................................
//		
//		driver.navigate().to("	https://www.kamaayurveda.in/corporate-gifting");
//		System.out.println("corporate-gifting at the footer working correctly ");
//		
//		//.............................................................
//		driver.navigate().to("https://www.kamaayurveda.in/experience-center");
//		System.out.println("experience-center\" at the footer working correctly ");
//		//.............................................................
//		
//		driver.navigate().to("https://www.kamaayurveda.in/store");
//		System.out.println("store at the footer working correctly ");
//		
//		//.............................................................
//		
//		driver.navigate().to("https://www.kamaayurveda.in/store");
//		System.out.println("store at the footer working correctly ");
//		
//		//.............................................................
//		
//		driver.navigate().to("https://www.kamaayurveda.in/career");
//		System.out.println("store at the footer working correctly ");
//		
//		//.............................................................
//		
//		driver.navigate().to("https://www.kamaayurveda.in/promotion");
//		System.out.println("promotion at the footer working correctly ");
//		
//		//.............................................................
//		
//		driver.navigate().to("https://www.kamaayurveda.in/blog");
//		System.out.println("blog at the footer working correctly ");
//		
//		//.............................................................
//		
//		driver.navigate().to("https://www.kamaayurveda.in/hotels-and-spas");
//		System.out.println("hotels-and-spas at the footer working correctly ");
//		
//		//.............................................................
//		
//		driver.navigate().to("https://www.kamaayurveda.in/hotels-and-spas");
//		System.out.println("hotels-and-spas at the footer working correctly ");
//		
//		//.............................................................
//		
//		driver.navigate().to("https://www.kamaayurveda.in/international");
//		System.out.println("international at the footer working correctly ");
//		
//		//.............................................................
//		
//		driver.navigate().to("https://www.kamaayurveda.in/");
//		System.out.println("Indian Website link at the footer working correctly ");
//		
//		//.............................................................
//		
//		driver.navigate().to("https://www.kamaayurveda.in/blog/naz-foundation");
//		System.out.println("naz-foundation link at the footer working correctly ");
//			
//			
//		}
//	
//
//	// Write code here that turns the phrase above into concrete actions
//
//	@Then("user click on ExploreMore.")
//	public void user_click_on_explore_more() {
//		// Write code here that turns the phrase above into concrete actions
////		throw new io.cucumber.java.PendingException();
//
//		System.out.println("Corporate gifting is opening ");
//		
//	}
//
//	@Then("user click on CorporateGifting.")
//	public void user_click_on_corporate_gifting() {
//		// Write code here that turns the phrase above into concrete actions
//		System.out.println("Corporate gifting is opening ");
//	}
//
//	@Then("user click on all Shop section.")
//	public void user_click_on_all_shop_section() {
//		// Write code here that turns the phrase above into concrete actions
//		System.out.println("all shops section working properly ");
//	}
//
//	@Then("user click on Quicklinks.")
//	public void user_click_on_quicklinks() {
//		// Write code here that turns the phrase above into concrete actions
//		System.out.println("quick links  section working properly ");
//	}
//
//	
//	
//	
//	@Then("user click on hamburgor icon")
//	public void user_click_on_hamburgor_icon() {
//	  
//		driver.navigate().to("https://www.kamaayurveda.in/");
//		WebElement el = driver.findElement(By.xpath("//img[@alt='hamburger-icon']"));
//		el.click();
//		
//	}
//
//	@Then("user click on close button in hamburgor icon")
//	public void user_click_on_close_button_in_hamburgor_icon() throws InterruptedException {
//		Thread.sleep(2000);
//		WebElement e2 = driver.findElement(By.cssSelector("(//img[@alt='close'])[19]"));
//		e2.click();
//	}	
//	
//	
//	
//	
//	
//}
