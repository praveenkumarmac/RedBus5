package in.redBus5.StepDefinition;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TrainBooking5 {
	public static WebDriver driver;

	@Given("Launch the browser and appilication1 {string}")
	public void launch_the_browser_and_appilication1(String string) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();		
		options.addArguments("disable-notifications");
		options.addArguments("disable-popups");
		options.addArguments("start-maximized");
		driver = new ChromeDriver(options);
		String url = "https://www.redbus.in";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
	}
	@When("User clicks on rail")
	public void user_clicks_on_rail() {
		WebElement travelChoice = driver.findElement(By.xpath("//span[text()='Train Tickets']"));		
		travelChoice.click();
	}
	@When("User enters the value in from place1 {string}")
	public void user_enters_the_value_in_from_place1(String fromPlace) {
		//String fromPlace = "Chennai";
		//WebElement from = driver.findElement(By.xpath("//label[text()='From']"));
		//WebElement from = driver.findElement(By.xpath("//div[@class='search-box search-box-src form-control']"));
		WebElement from = driver.findElement(By.xpath("//input[@id='src']"));		
		from.sendKeys(fromPlace);		
		WebElement frompl = driver.findElement(By.xpath("//div[text()='Chennai - All Stations']"));		
		frompl.click();
	}
	@When("User enters the value in to place1 {string}")
	public void user_enters_the_value_in_to_place1(String toPlace) throws InterruptedException {
		//String toPlace = "Hyderabad";		
		//input[@id='src']
		WebElement to = driver.findElement(By.xpath("//input[@id='dst']"));		
		to.sendKeys(toPlace);		
		WebElement topl = driver.findElement(By.xpath("//div[text()='Visakhapatnam']"));
		topl.click();
		Thread.sleep(6000);
	}
	@When("User selects a data  in the Date DropDown1")
	public void user_selects_a_data_in_the_Date_DropDown1() {
		LocalDate date = LocalDate.now();
		int day = date.getDayOfMonth();
		System.out.println("Today date:"+day);
		day++;
		String s1 = "//span[text()="+day+" "+"]";
		System.out.println(s1);
		driver.findElement(By.xpath("//img[@alt='calendar_icon']")).click();
		driver.findElement(By.xpath(s1)).click();
	}
	@When("User clicks on search button1")
	public void user_clicks_on_search_button1() {
		WebElement searchButton = driver.findElement(By.xpath("//button[text()='search trains']"));
		searchButton.click();
	}
	@Then("Validate the bus displayed in the UI1")
	public void validate_the_bus_displayed_in_the_UI1() {
		List<WebElement> trains= driver.findElements(By.xpath("//span[@class='srp_train_name']"));
		List<WebElement> deptime = driver.findElements(By.xpath("//span[@class='srp_departure_time']"));
		List<WebElement> arrtime = driver.findElements(By.xpath("//span[@class='srp_arrival_time']"));
		List<WebElement> farerate = driver.findElements(By.xpath("//div[@class='srp_timimngs_wrap srp_src_dst_stations']"));
		for (int i=0;i<trains.size();i++) {
			if(i==trains.size()-1) {
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("window.scrollTo(0,document.body.scrollHeight)",trains.get(i));
				trains= driver.findElements(By.xpath("//span[@class='srp_train_name']"));
				deptime = driver.findElements(By.xpath("//span[@class='srp_departure_time']"));
				arrtime = driver.findElements(By.xpath("//span[@class='srp_arrival_time']"));
				farerate = driver.findElements(By.xpath("//div[@class='srp_timimngs_wrap srp_src_dst_stations']"));
			}
			else {
				String t1 = trains.get(i).getText();
				String t2 = deptime.get(i).getText();
				String t3 = arrtime.get(i).getText();
				String t4 = farerate.get(i).getText();
				System.out.println("trian name: "+t1+"Departure Time:"+t2+"Arrival Time:"+t3+"place:"+t4);
				//boolean src1 = t4.toLowerCase();
			}
		}
	}
}
