package Mazda;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DriverCommand;
import org.testng.annotations.Test;

public class Mazda {
@Test	
public void firsttest() throws Throwable {
		
	 
		// 1) Open Chrome driver 
	
		WebDriver driver=new ChromeDriver();
		

	    driver.manage().deleteAllCookies();
	    driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
        driver.get("https://mazda.ca/en/");
        
      //  driver.manage().window().maximize();
		
		Thread.sleep(1000);
		
	    // 2) Accept cookies
		
		driver.findElement(By.xpath("//a[@class='mz-btn mz-btn--primary mz-btn--white']")).click();
		
		// 3) Click on caraousel arrow and check next slide is getting displayed
		driver.findElement(By.xpath("//button[contains(@type,'button')]//i[contains(@class,'mz-svg mz-svg--grey mz-svg-chevroncarousel')]")).click();
		
		WebElement slider = driver.findElement(By.xpath("//li[contains(@class,'glide__slide mz-image glide__slide--active')]"));
		
		System.out.println("Slider button is working:" +slider.isDisplayed());
		
		Thread.sleep(1000);
		
		// 4) Find local community legends cta and open it match page title and go back to homepage
		
		driver.findElement(By.xpath("//a[@data-link-url='/en/discover-mazda/welcome-to-mazda/local-community-legends/']")).click();
		
		String Title = driver.getTitle();
		
		String expected = "Local Community Legends | 2022 | Mazda Canada";
		
		if (expected.equalsIgnoreCase(Title))
				{
					System.out.println("Link is working");
				} else
				{
					System.out.println("Link is not working");
				}
		
		driver.navigate().back();
		
		// 5) Click on "We live our values card and match title of opened link
		
		driver.findElement(By.xpath("//div[@data-link-name='OUR VALUES']")).click();
		
		String Title2 = driver.getTitle();
		
		String expected2 = "Mazda Values | Mazda Canada";
		
		if (expected2.equalsIgnoreCase(Title2))
		{
			System.out.println("Link is working");
		} else
		{
			System.out.println("Link is not working");
		}
		
		driver.navigate().back();
		
//		// 001) Open KMI page (Currently not using because of too many webforms can get submitted)
//		
//		driver.get("https://www.mazda.ca/en/keep-me-informed/");
//		
//		driver.findElement(By.xpath("//select[@name='modelData']")).click();
//		
//		driver.findElement(By.xpath("//option[@value='2024 CX-5']")).click();
//		
//		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("reject");
//		
//		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("reject");
//		
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rejectmesci@rejectmesci.com");
//		
//		driver.findElement(By.xpath("//input[@name='postalcode']")).sendKeys("m2j3b8");
//		
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//		
//		Thread.sleep(1000);
//		
//		WebElement form = driver.findElement(By.xpath("//h3[normalize-space()='SUCCESS!']"));
//		
//		System.out.println("Form is submitted successfully:" +form.isDisplayed());
		
		
		
	//	Thread.sleep(2000);

		// 6) Open Mazda cx-5 tab and check feature cards, open card and slide to next card
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.get("https://www.mazda.ca/en/vehicles/cx-5/");
		
		driver.findElement(By.xpath("//div[@id='REFLECTING2']//li[@class='glide__slide mz-image glide__slide--active']//div[@class='mz-card mz-card-feature']")).click();
		
		driver.findElement(By.xpath("//div[@class='mz-carousel glide mz-carousel--contain mz-carousel--light glide--swipeable mounted glide--ltr glide--slider']//i[@class='mz-svg mz-svg--grey mz-svg-chevroncarousel']")).click();
		
		WebElement card = driver.findElement(By.xpath("//div[@class='mz-carousel glide mz-carousel--contain mz-carousel--light glide--swipeable mounted glide--ltr glide--slider']//li[@class='glide__slide mz-image glide__slide--active']"));
		
		System.out.println("Card is opening and able to slide:" +card.isDisplayed());
		
		driver.findElement(By.xpath("//div[@id='mz-cards-listing-features-modal-REFLECTING2']//i[@class='mz-svg mz-svg--grey 0 mz-svg-x']")).click();

		// 7) Open B&P for CX-5
		
		driver.findElement(By.xpath("//a[@class='mz-btn mz-btn--secondary']//span[contains(text(),'BUILD YOURS')]")).click();
		
		driver.findElement(By.xpath("//div[@class='mz-full-width mz-trims-page__content general-content']//div[3]//div[1]//button[1]")).click();
		
		// 8) Selecting build and comparing prices
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='mz-btn mz-btn--primary mz-btn--red']//span[@class='mz-link-icon-positon--right'][normalize-space()='Next: Engine']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='mz-btn mz-btn--primary mz-btn--red']//span[@class='mz-link-icon-positon--right'][normalize-space()='Next: Package']")).click();
		driver.findElement(By.xpath("//div[@class='mz-package-page__content-right right-container']//div[2]//div[3]//button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='mz-btn mz-btn--primary mz-btn--red']//span[@class='mz-link-icon-positon--right'][normalize-space()='Next: Colour']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[@class='App mzBuildandPrice']/div[@class='App-container']/div[@class='mz-colours-page mz-top-nav-spacing grid-no-gutter-sm']/div[@class='mz-full-width mz-colours-page__content general-content']/div[@class='mz-colours-page__content-right right-container']/div[@class='mz-colours-page__package-card-list right-container']/div[@class='mz-colours-page__package-card-list-container']/button[3]/span[1]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='mz-btn mz-btn--primary mz-btn--red']//span[@class='mz-link-icon-positon--right'][normalize-space()='Next: Wheels']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//body/div[@id='root']/div[@class='App mzBuildandPrice']/div[@class='App-container']/div[@class='mz-wheels-page mz-top-nav-spacing']/div[@class='mz-full-width mz-wheels-page__content general-content']/div[@class='mz-wheels-page__content-right right-container']/div[@class='mz-wheels-page__wheels-card-list']/div[@class='wheels-list']/div[@class='wheels-list__tab-content']/button[1]/span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='mz-btn mz-btn--primary mz-btn--red']//span[@class='mz-link-icon-positon--right'][normalize-space()='Next: Accessories']")).click();
		
		driver.findElement(By.xpath("//button[@class='mz-btn mz-btn--primary mz-btn--red']//span[@class='mz-link-icon-positon--right'][normalize-space()='Next: Payments']")).click();
		
		//9) Comparing cash, finance and lease prices
		
		WebElement price = driver.findElement(By.xpath("//span[@class='mmz-cahs-options__price'][normalize-space()='$44,662.50']"));
		
		String actualprice = price.getText();
		
	    String expectedprice = "$44,662.50";
		
		System.out.println("Prices are matching:" +actualprice.equalsIgnoreCase(expectedprice));
		
		driver.findElement(By.xpath("//input[@class='base trade-input']")).sendKeys("1000");
		
		driver.findElement(By.xpath("//input[@class='base down-input']")).sendKeys("2000");
		
		driver.findElement(By.xpath("//div[@class='mz-price-payment__loyalty']//div[@class='mz-price-payment__checkbox']")).click();
		
		WebElement balance = driver.findElement(By.xpath("//span[normalize-space()='$41,286.61']"));
		
		String finanacebalance = balance.getText();
		
		String expectedbalance = "$41,286.61";
		
		System.out.println("Prices are matching for balance:" +finanacebalance.equalsIgnoreCase(expectedbalance));
		
	    WebElement lease = driver.findElement(By.xpath("//span[normalize-space()='$41,850.95']"));
	    
	    String actualease = lease.getText();
	    
	    String expectedlease = "$41,850.95";
	    
	    System.out.println("Prices are matching for lease:" +actualease.equalsIgnoreCase(expectedlease));
	    
	    driver.close();
	    
	    // 10) Open driver again to change province and lan
	    
        WebDriver driver2=new ChromeDriver();
		

	    driver2.manage().deleteAllCookies();
	    driver2.navigate().refresh();
		driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
        driver2.get("https://mazda.ca/en/");
        
        driver2.manage().window().maximize();
	    
	    
	    
	   // 10) Open Mazda 3 garage change provinace and language 
	   
	    driver2.get("https://www.mazda.ca/en/vehicles/mazda3-sport/");
	    
	    driver2.findElement(By.xpath("//a[@class='mz-btn mz-btn--primary mz-btn--white']")).click();
	    
	    driver2.findElement(By.xpath("//select[@name='province']")).click();
	    
	    driver2.findElement(By.xpath("//option[normalize-space()='QC']")).click();
	    
	    driver2.findElement(By.xpath("//a[normalize-space()='fr']")).click();
	    
	    WebElement alert = driver2.findElement(By.xpath("//a[@class='mz-btn mz-btn--primary mz-btn--white']"));
	    
	    try {alert.click();
	    }
	    catch (Exception a) {
	    	throw (a); }
	    
	   
	    	
	    
	    driver2.findElement(By.xpath("//body/div/div/div/div[1]/a[2]")).click();
	    
	    driver2.findElement(By.xpath("//div[@class='mz-container-flex active']//button[3]")).click();
	    
	    // 11) Open B&P with selected province and fr 
	    
	    driver2.findElement(By.xpath("//div[@class='mz-container-flex active']//a[@class='mz-btn mz-btn--primary mz-btn--red mz-360-color-pickers__cta']")).click();
	    Thread.sleep(1000);
	    
 WebElement alert2 = driver2.findElement(By.xpath("//a[@class='mz-btn mz-btn--primary mz-btn--white']"));
	    
	    try {alert2.click();
	    }
	    catch (Exception a) {
	    	throw (a); }
	    
	    Thread.sleep(2000);
	    driver2.findElement(By.xpath("//div[@class='mz-package-page__content-right right-container']//div[2]//div[3]//button[1]")).click();
        Thread.sleep(2000);
        driver2.findElement(By.xpath("//div[@class='mz-pricing__container']//button[@type='button']")).click();
        Thread.sleep(1000);
        driver2.findElement(By.xpath("//div[@class='mz-pricing__container']//button[@type='button']")).click();
        Thread.sleep(1000);
        driver2.findElement(By.xpath("//div[@class='mz-pricing__container']//button[@type='button']")).click();
        Thread.sleep(1000);
        driver2.findElement(By.xpath("//div[@class='mz-pricing__container']//button[@type='button']")).click();
        
        WebElement Frprice = driver2.findElement(By.xpath(("//span[@class='mmz-cahs-options__price'][normalize-space()='29 992,50 $']")));
        
        String actualfrprice = Frprice.getText();
       // System.out.println("Prices" +actualfrprice);
	    String expectedfrprice = "29 992,50 $";
	    
	    System.out.println("Prices are matching for FR balance:" +actualfrprice.equalsIgnoreCase(expectedfrprice));
	   
	    
	    driver2.close();
	  }
	    
	   // driver2.findElement(By.xpath("(//button)[3]")).click();
	    
//	    driver2.findElement(By.xpath("//div[@class='mz-package-page__content-right right-container']//div[2]//div[3]//button[1]")).click();
//	    Thread.sleep(2000);
//	    driver2.findElement(By.xpath("//div[@class='mz-pricing__container']//button[@type='button']")).click();
//	    Thread.sleep(1000);
//	    driver2.findElement(By.xpath("//div[@class='mz-pricing__container']//button[@type='button']")).click();
//	    Thread.sleep(4000);
//	    driver.findElement(By.xpath("//div[@class='mz-pricing__container']//button[@type='button']")).click();
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//div[@class='mz-pricing__container']//button[@type='button']")).click();
//	    Thread.sleep(1000);
//	    driver.findElement(By.xpath("//div[@class='mz-pricing__container']//button[@type='button']")).click();
//	    Thread.sleep(1000);
//	    driver.findElement(By.xpath("(//span[@class='wheel-card__content'])[4]")).click();
//	    Thread.sleep(1000);
//	    driver.findElement(By.xpath("//div[@class='mz-pricing__container']//button[@type='button']")).click();
//	    Thread.sleep(1000);
//	    driver.findElement(By.xpath("//div[@class='mz-pricing__container']//button[@type='button']")).click();
//	    
	  
//	    driver.findElement(By.xpath("//div[contains(@class,'mz-pricing__container')]//button[contains(@type,'button')]")).click();
//	    
//	    driver.findElement(By.xpath("//div[contains(@class,'mz-financial--finance')]//button[contains(@type,'button')]")).click();
//	    
//	    driver.findElement(By.xpath("//span[normalize-space()='Continue to Scotiabank']")).click();
//	    
//	    Thread.sleep(3000);
//	    
//	    WebElement bns = driver.findElement(By.xpath("//div[contains(text(),'Get approved for your Mazda auto loan in under 20 ')]"));
//	    
//	    System.out.println("BNS site is opening:" +bns.isDisplayed());
//	    
////	    Thread.sleep(5000);
//	    
//	    driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div[2]/div/div[1]/div/div[3]/svg/path")).click();
//	    
//		WebElement bns = driver.findElement(By.xpath("//p[normalize-space()='$701.93 Monthly']"));
//		
//		String monthlyonbns = bns.getText();
//		
//		System.out.println("Prices are matching:" +monthlyonbns.equalsIgnoreCase("$701.92 Monthly"));
//		
//	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		String Head = "PREDICTIVE TECHNOLOGY THAT" ;
//		
//		if
//		(Heading.equals(Head));
//
//		{
//		System.out.println("CTA is working correctly");}
//		


		
 }
		
	//	driver.findElement(By.xpath("//h6[normalize-space()='OUR SUSTAINABILITY PROMISE']")).click();
		
//		Thread.sleep(1000);
//		
//		WebElement Image = driver.findElement(By.xpath("//div[@class='h1 text--white']"));
//		
//		System.out.println("Display status of Image:"+Image.isDisplayed());
//		
//		// 5) Go back to previous page
//		
//		driver.navigate().back();
//		
//		// 6) Find element and check if it is being displayed (present in dom tree)
//		
//		WebElement Image2 = driver.findElement(By.xpath("//video[@class='lazy']"));
//		
//		System.out.println("Display status of Image2:"+Image2.isDisplayed());
//		
//		Thread.sleep(1000);
//		
//		driver.get("https://mazda.ca/en/vehicles/cx-50/");
//		
//		Thread.sleep(3000);
//		
//		WebElement Image3 = driver.findElement(By.xpath("//div[@data-id='connected_services_video']//video[@class='lazy']"));
//		
//		System.out.println("Display status of Image3:"+Image3.isDisplayed());
//		
//		driver.findElement(By.xpath("//span[normalize-space()='BUILD YOURS']")).click();
//		
//		WebElement Image4 = driver.findElement(By.xpath("//div[@class='mz-collapse mz-collapse-selected']//div[@class='mz-collapse__button']"));
//		
//		System.out.println("Display status of Image4:"+Image4.isDisplayed());
//		
//		//driver.findElement(By.xpath(//a[contains(@class,'mz-btn mz-btn--secondary')]//span[contains(text(),'BUILD YOURS')])).click();
//		
//		driver.findElement(By.xpath("//div[@class='mz-pricing__container']//button[@type='button']")).click();
//		
//		driver.findElement(By.xpath("//div[@class='mz-pricing__container']//button[@type='button']")).click();
//		
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//button[@class='mz-btn mz-btn--primary mz-btn--red']//span[@class='mz-link-icon-positon--right'][normalize-space()='Next: Colour']")).click();
//		
//		driver.findElement(By.xpath("//span[normalize-space()='Machine Grey Metallic']")).click();
//		
//		driver.findElement(By.xpath("//button[@class='mz-btn mz-btn--primary mz-btn--red']//span[@class='mz-link-icon-positon--right'][normalize-space()='Next: Wheels']")).click();
//		
//		driver.findElement(By.xpath("//span[normalize-space()='M012 17\" Matte Gunmetal Alloy Wheel Package']")).click();
//		
//		driver.findElement(By.xpath("//button[@class='mz-btn mz-btn--primary mz-btn--red']//span[@class='mz-link-icon-positon--right'][normalize-space()='Next: Accessories']")).click();
//		
//		//driver.findElement(By.xpath("//body[1]/div[4]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[2]/button[1]")).click();
//		
//		driver.findElement(By.xpath("//div[@class='mz-pricing__container']//button[@type='button']")).click();
//		
//		WebElement Test = driver.findElement(By.xpath("//span[@class='mmz-cahs-options__price'][normalize-space()='$41,847.50']"));
//		
//		String expecteddata= "41,847.50";
//		
//		String actualdata = Test.getText();
//		
//		if (actualdata.equalsIgnoreCase(expecteddata));
//		{
//			System.out.print("results matched");
//		} 
//		
//		driver.findElement(By.xpath("//option[normalize-space()='QC']")).click();
//		
//		driver.findElement(By.xpath("//a[normalize-space()='fr']")).click();
//		
//		driver.findElement(By.xpath("//body/div[@id='root']/div[@class='App mzBuildandPrice']/div[@class='App-container']/div[@class='wrapper']/div[@class='mz-vehicles mz-container']/div[@class='mz-tabs js-processed']/div[@class='mz-tabs__content']/div[3]/div[1]")).click();
//		
//		
//	
//		
//			
//		}
//		
//	}
//
//
