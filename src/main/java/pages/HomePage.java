package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {
	private WebDriver driver;
	
	//elements on HomePage
	private By logo = By.xpath("//a[@class='myntraweb-sprite desktop-logo sprites-headerLogo ']");
	private By searchBar = By.xpath("//input[@class='desktop-searchBar']");
	private By menLink = By.xpath("//a[@data-group='men']");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean isLogoDisplayed() {
		return driver.findElement(logo).isDisplayed();
	}
	
	public void enterSearchText(String text) {
		driver.findElement(searchBar).sendKeys(text,Keys.ENTER);
	}
	
	public void clickMen() {
		driver.findElement(menLink).click();
	}

}
