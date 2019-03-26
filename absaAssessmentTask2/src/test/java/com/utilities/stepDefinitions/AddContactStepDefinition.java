package com.utilities.stepDefinitions;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class AddContactStepDefinition {

	WebDriver driver;

	@Given("^Navigate to URL$")
	public void navigate_to_URL() {
		System.setProperty("webdriver.chrome.driver", "D://AKV_QA//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("http://www.way2automation.com/angularjs-protractor/webtables/");
		driver.manage().window().maximize();

	}

	@SuppressWarnings("deprecation")
	@Then("^Validate I am on User on the User List table")
	public void validatePage() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Protractor practice website - WebTables", title);
	}

	@Then("^I Click Add User$")
	public void click_Add_User() throws Throwable {
		WebElement add = driver.findElement(By.xpath("//button[@type=\"add\"]"));
		add.click();
	}

	@Then("^I enters firstName1 and lastName1 and userName1 and password1$")
	public void i_enters_firstName_and_lastName_and_userName_and_password() throws Throwable {
		driver.findElement(By.name("FirstName")).sendKeys("FName1");
		driver.findElement(By.name("LastName")).sendKeys("LName1");
		driver.findElement(By.name("UserName")).sendKeys("User1");
		driver.findElement(By.name("Password")).sendKeys("Pass1");
	}

	@Then("^I enters firstName2 and lastName2 and userName2 and password2$")
	public void i_enters_firstName2_and_lastName2_and_userName2_and_password2() throws Throwable {
		driver.findElement(By.name("FirstName")).sendKeys("FName2");
		driver.findElement(By.name("LastName")).sendKeys("LName2");
		driver.findElement(By.name("UserName")).sendKeys("User2");
		driver.findElement(By.name("Password")).sendKeys("Pass2");
	}

	@Then("^Select Customer1$")
	public void selectCustomer() throws Throwable {
		WebElement radio1 = driver.findElement(By.xpath("//input[@name=\"optionsRadios\"] [@value=\"15\" ]"));
		radio1.click();
		if (radio1.isSelected()) {
			System.out.println("Company AAA is Selected");

		} else {
			System.out.println("Company AAA is not Selected");
		}
	}

	@Then("^Select Role1$")
	public void selectRole() throws Throwable {
		WebElement role1 = driver.findElement(By.name("RoleId"));
		Select element1 = new Select(role1);
		element1.selectByVisibleText("Admin");
	}

	@Then("^I enters email1 and cell1$")
	public void emailAndCell1() throws Throwable {

		driver.findElement(By.name("Email")).sendKeys("admin@mail.com");
		driver.findElement(By.name("Mobilephone")).sendKeys("082555");

	}

	@Then("^I enters email2 and cell2$")
	public void emailAndCell2() throws Throwable {

		driver.findElement(By.name("Email")).sendKeys("customer@mail.com");
		driver.findElement(By.name("Mobilephone")).sendKeys("083444");

	}

	@Then("^Select Customer2$")
	public void selectCustomer2() throws Throwable {
		WebElement radio2 = driver.findElement(By.xpath("//input[@name=\"optionsRadios\"] [@value=\"16\" ]"));
		radio2.click();
		if (radio2.isSelected()) {
			System.out.println("Company BBB is Selected");

		} else {
			System.out.println("Company BBB is not Selected");
		}

	}

	@Then("^Select Role2$")
	public void selectRole2() throws Throwable {
		WebElement role2 = driver.findElement(By.name("RoleId"));
		Select element2 = new Select(role2);
		element2.selectByVisibleText("Customer");
	}

	@And("^Click Save$")
	public void clickSave() {
		driver.findElement(By.xpath("//button[text()=\"Save\"]")).click();
	}

	@Then("^Quit Browser$")
	public void quitBrowser() {
		driver.quit();
	}

}
