package com.flipkart.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.flipkart.baseclass.BaseClass;

public class GetTitle extends BaseClass {
	@Test(priority = 1)
	private void browserlounched() throws Exception {
		browserlaunch("chrome");
		geturl("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test(priority = 2)
	private void skipLogin() {
		WebElement SkipElement = driver.findElement(By.xpath("//button[text()='✕']"));
		if (SkipElement.isDisplayed() == true) {
			WebElement SearchInput = driver
					.findElement(By.xpath("//button[@type='submit']/preceding-sibling::div/input"));

		}

	}
	@Test(priority = 3)
	private void Search() {

		mousehover(driver.findElement(By.xpath("//div[text()='Mobiles']")));
		driver.findElement(By.xpath("//div[text()='Mobiles']/ancestor::a")).click();

		driver.findElement(By.xpath("//div[@id='container']/descendant::form/div/div/child::input"))
				.sendKeys("iphone 13");
		driver.findElement(By.xpath("//button[@type='submit']"));

	}
	@Test(priority = 4)
	private void GetProduct() {
		List<WebElement> ListOfProduct = driver.findElements(By.xpath("//span[starts-with(@id, 'productRating')]//parent::div/preceding-sibling::div"));
	String ProductName = ListOfProduct.get(0).getText();
	System.out.println(ProductName);
	
	
	}


}
