package in.redBus5.StepDefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BusBooking5 {
	public static WebDriver driver;
	public static WebDriverWait Wait;
	
	@Given("Launch the browser and appilication {string}")
	public void launch_the_browser_and_appilication(String url) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();		
		options.addArguments("disable-notifications");
		options.addArguments("disable-popups");
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		//String url = "https://www.redbus.in";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(240));
	}

	@When("User enters the value in from place {string}")
	public void user_enters_the_value_in_from_place(String fromPlace) {
		WebElement from = driver.findElement(By.xpath("//label[text()='From']/preceding-sibling::input"));
		Wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		from.sendKeys(fromPlace);
		WebElement frompl = driver.findElement(By.xpath("//text[text()='"+fromPlace+"']/parent::div[contains(@class,'grvhsy')]"));
		frompl.click();
	}

	@When("User enters the value in to place {string}")
	public void user_enters_the_value_in_to_place(String toPlace) {
		WebElement to = driver.findElement(By.xpath("//input[@id='dest']"));			
		Actions act = new Actions(driver);
		act.sendKeys(to, toPlace).build().perform();		
		WebElement topl = driver.findElement(By.xpath("//text[text()='"+toPlace+"']/parent::div[contains(@class,'grvhsy')]"));
		topl.click();
	}

	@When("User selects a data  in the Date DropDown")
	public void user_selects_a_data_in_the_Date_DropDown() {
		WebElement date = driver.findElement(By.xpath("//span[text()='21' and contains(@class,'dkWAbH')]"));
		date.click();
	}

	@When("User clicks on search button")
	public void user_clicks_on_search_button() {
		WebElement searchButton = driver.findElement(By.xpath("//button[contains(text(),'SEARCH')]"));
		searchButton.click();
	}

	@Then("Validate the bus displayed in the UI")
	public void validate_the_bus_displayed_in_the_UI() {
		List<WebElement> buses = driver.findElements(By.xpath("//div[contains(@class,'travels lh-24 f-bold d-color')]"));
		List<WebElement> depTimes = driver.findElements(By.xpath("//div[contains(@class,'dp-time f-19 d-color f-bold')]"));		
		List<WebElement> arrTimes = driver.findElements(By.xpath("//div[contains(@class,'bp-time f-19 d-color disp-Inline')]"));
		List<WebElement> fare = driver.findElements(By.xpath("//span[contains(@class,'f-19')]"));
		int size = buses.size(); 
		for(int i=0; i<size;i++) {
			//System.out.println(buses.size());
			if(i==buses.size()-1) {
				//System.out.println(buses.size());
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].scrollIntoView(true)", buses.get(i));
				buses = driver.findElements(By.xpath("//div[contains(@class,'travels lh-24 f-bold d-color')]"));
				depTimes = driver.findElements(By.xpath("//div[contains(@class,'dp-time f-19 d-color f-bold')]"));		
				arrTimes = driver.findElements(By.xpath("//div[contains(@class,'bp-time f-19 d-color disp-Inline')]"));
				fare = driver.findElements(By.xpath("//span[contains(@class,'f-19')]"));
				size = buses.size();
			}
			else {
				//System.out.println(size);
				String bus = buses.get(i).getText();
				//System.out.println(bus);
				String depTime = depTimes.get(i).getText();
				String arrTime = arrTimes.get(i).getText();
				String eachFare = fare.get(i).getText();
				System.out.println(bus+" "+depTime+" "+arrTime+" "+eachFare);
			}										
		}
	}

}
