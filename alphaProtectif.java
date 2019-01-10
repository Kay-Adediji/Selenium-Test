
package TifGroup;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class alphaProtectif {
	private WebDriver driver;
	private String baseUrl;
	WebDriverWait wait;
	
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "/Users/adedeji/Documents/workspace/geckodriver");
		driver = new FirefoxDriver();
		wait = new WebDriverWait (driver, 5);
		baseUrl = "https://alpha.protectif.co.uk";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void testAlphaProtectif() throws Exception {
		driver.get(baseUrl);
		//Gets and prints page title in console
		String title = driver.getTitle();
		System.out.println(title);
		//Find next button on page
		WebElement nextButton1 = driver.findElement(By.id("next-button"));
		nextButton1.click();
		Thread.sleep(1000);
		
		WebElement nextButton2 = driver.findElement(By.id("next-button"));
		nextButton2.click();
		Thread.sleep(1000);
		
		WebElement policyRef = driver.findElement(By.id("policyReferenceNum"));
		policyRef.sendKeys("12345678");
		Thread.sleep(1000);
		
		WebElement nextButton3 = driver.findElement(By.id("next-button"));
		nextButton3.click();
		Thread.sleep(1000);
		
		//Selecting drop-down by index
		WebElement element = driver.findElement(By.id("residentCountry"));
		Select residency = new Select(element);
		System.out.println("Selecting Residency - Isle of Man by index");
		Thread.sleep(1000);
		residency.selectByIndex(2);
		Thread.sleep(1000);
		
		//Selecting drop-down by Visible Text
		WebElement element1 = driver.findElement(By.id("destination"));
		Select destination = new Select(element1);
		System.out.println("Selecting Destination - Europe incl Spain by Visible Text");
		Thread.sleep(1000);
		destination.selectByVisibleText("Europe incl Spain");
		Thread.sleep(1000);
		
		//Selecting drop-down by index
		WebElement element2 = driver.findElement(By.id("policyTypes"));
		Select policytype = new Select(element2);
		System.out.println("Selecting Policy Type - Alpha Wintersports Single Trip by index");
		Thread.sleep(1000);
		policytype.selectByIndex(5);
		Thread.sleep(1000);
		
		//Opening the Calendar to select departure and returne date
		WebElement departuredate = driver.findElement(By.id("departureDate"));
		departuredate.sendKeys("01-February-2019");
		System.out.println("Selecting Departure Date");
		Thread.sleep(1000);
		WebElement returndate = driver.findElement(By.id("returnDate"));
		returndate.sendKeys("08-February-2019");
		System.out.println("Selecting Return Date");
		Thread.sleep(1000);
		
		WebElement element3 = driver.findElement(By.xpath(".//*[@id='policy']"));
		Select policy = new Select(element3);
		System.out.println("Selecting Policy - Alpha 100 Longstay by index");
		Thread.sleep(1000);
		policy.selectByIndex(1);
		Thread.sleep(1000);
		
		WebElement nextButton4 = driver.findElement(By.id("next-button"));
		nextButton4.click();
		Thread.sleep(1000);
		
		WebElement travelerButton = driver.findElement(By.id("add-traveller-button"));
		travelerButton.click();
		Thread.sleep(1000);
		
		WebElement element4 = driver.findElement(By.xpath(".//*[@id='title']"));
		Select titl = new Select(element4);
		System.out.println("Selecting Title by index");
		titl.selectByIndex(2);
		Thread.sleep(1000);
		
		
		WebElement firstname = driver.findElement(By.id("firstname"));
		firstname.sendKeys("Kay");
		Thread.sleep(1000);
		
		WebElement lastname = driver.findElement(By.id("lastname"));
		lastname.sendKeys("TifTest");
		Thread.sleep(1000);
		
		WebElement element5 = driver.findElement(By.xpath(".//*[@id='dropdownDay']"));
		Select day = new Select(element5);
		System.out.println("Selecting Day by Visible Text");
		day.selectByVisibleText("10");
		Thread.sleep(1000);
		
		WebElement element6 = driver.findElement(By.id("dropdownMonth"));
		Select month = new Select(element6);
		System.out.println("Selecting Month by Visible Text");
		month.selectByVisibleText("7");
		Thread.sleep(1000);
		
		WebElement element7 = driver.findElement(By.id("dropdownYear"));
		Select year = new Select(element7);
		System.out.println("Selecting Year by Visible Text");
		year.selectByVisibleText("1976");
		Thread.sleep(1000);
		
		WebElement radiob = driver.findElement(By.xpath("html/body/div[2]/div[2]/div[1]/div/div/edit-traveller/div/form/bmi-component/div[2]/div/label[1]/input"));
		radiob.click();
		Thread.sleep(1000);
		
		WebElement height = driver.findElement(By.id("height"));
		height.sendKeys("2");
		Thread.sleep(1000);
		
		WebElement weight = driver.findElement(By.id("weight"));
		weight.sendKeys("95");
		Thread.sleep(1000);
		
		WebElement nextButton5 = driver.findElement(By.xpath("html/body/div[2]/div[2]/div[1]/div/div/div/div/button[2]"));
		nextButton5.click();
		Thread.sleep(1000);
		
		WebElement medication = driver.findElement(By.id("medication"));
		medication.sendKeys("C");
		Thread.sleep(1000);
		medication.sendKeys("e");
		Thread.sleep(1000);
		medication.sendKeys("t");
		medication.sendKeys("i");
		Thread.sleep(1000);
		medication.sendKeys("r");
		Thread.sleep(1000);
		medication.sendKeys("i");
		Thread.sleep(1000);
		medication.sendKeys("z");
		Thread.sleep(1000);
		medication.sendKeys("i");
		Thread.sleep(1000);
		medication.sendKeys("n");
		Thread.sleep(1000);
		medication.sendKeys("e");
		
		
		//Dynamic element here fetched element using the contains method
		WebElement autoOptions = driver.findElement(By.xpath(".//*[contains(@id,'typeahead')][1]"));
		
		wait.until(ExpectedConditions.visibilityOf(autoOptions));
		
		//Finding all elements in list and stores them in medicines iterate through the list and select any element like Cetirizine / Zirtek
		
		List<WebElement> medcines = driver.findElements(By.tagName("li"));
		
		for (WebElement meds : medcines){
			
			if(meds.getText().equalsIgnoreCase("Cetirizine / Zirtek")){
				meds.click();
				break;
			}  
		}

		WebElement hayfever = driver.findElement(By.xpath(".//*[@id='condition-86']"));
		hayfever.click();
		WebElement nextbutton7 = driver.findElement(By.xpath("html/body/div[2]/div[2]/div[1]/div/div[2]/div/div/button"));
		nextbutton7.click();
		Thread.sleep(2000);
		WebElement nomorecondition = driver.findElement(By.xpath("html/body/div[5]/div/div/div[3]/button[1]"));
		nomorecondition.click();
		Thread.sleep(2000);
		WebElement medic = driver.findElement(By.xpath("//*[@id='screen-button']"));
		medic.click();
		Thread.sleep(2000);
		WebElement all = driver.findElement(By.xpath("html/body/div[5]/div/div/div[3]/button[2]"));
		all.click();
		Thread.sleep(2000);
		WebElement none = driver.findElement(By.xpath(".//*[@id='answer-109636']"));
		none.click();
		Thread.sleep(2000);
		WebElement cont = driver.findElement(By.xpath(".//*[@id='questions-and-answers']/div[1]/button"));
		cont.click();
		Thread.sleep(2000);
		WebElement cont1 = driver.findElement(By.xpath(".//*[@id='purchase-button']"));
		cont1.click();
		Thread.sleep(2000);
		WebElement cont2 = driver.findElement(By.xpath("html/body/div[2]/div[2]/div[1]/div/div[2]/div/button[2]"));
		cont2.click();
		
		//Contact Details Page
		WebElement email = driver.findElement(By.xpath("html/body/div[2]/div[2]/div[1]/div/form/div/div[1]/div[2]/div/input"));
		email.sendKeys("kay@gmail.com");
		Thread.sleep(2000);
		WebElement conemail = driver.findElement(By.xpath("html/body/div[2]/div[2]/div[1]/div/form/div/div[1]/div[3]/div/input"));
		conemail.sendKeys("kay@gmail.com");
		Thread.sleep(2000);
		WebElement postcode = driver.findElement(By.xpath("html/body/div[2]/div[2]/div[1]/div/form/div/div[1]/div[4]/div[1]/input"));
		postcode.sendKeys("DA8 3SA");
		Thread.sleep(2000);
		WebElement postcodesearch = driver.findElement(By.id("single-button"));
		postcodesearch.click();
		Thread.sleep(2000);
		WebElement address = driver.findElement(By.xpath("html/body/div[2]/div[2]/div[1]/div/form/div/div[1]/div[4]/div[2]/div/ul/li[1]/a"));
		address.click();
		WebElement daytime = driver.findElement(By.xpath("html/body/div[2]/div[2]/div[1]/div/form/div/div[1]/div[8]/div/input"));
		daytime.sendKeys("07411111111");
		Thread.sleep(2000);
		WebElement evening = driver.findElement(By.xpath("html/body/div[2]/div[2]/div[1]/div/form/div/div[1]/div[9]/div/input"));
		evening.sendKeys("01322444555");


	    }
		
	

	@After
	public void tearDown() throws Exception {
		//Thread.sleep(4000);
		//driver.quit();

	}

}

