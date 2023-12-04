package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTipExample {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/css/css_tooltip.asp");
		Thread.sleep(5000);
		WebElement Tutorials = driver.findElement(By.id("navbtn_tutorials"));
		Actions action = new Actions(driver);
		action.moveToElement(Tutorials).build().perform();
		String tutorialsTooltip = Tutorials.getAttribute("title");
		System.out.println(tutorialsTooltip);
		Thread.sleep(5000);
		
		WebElement certificates = driver.findElement(By.id("navbtn_certified"));
		Actions actions = new Actions(driver);
		actions.moveToElement(certificates).build().perform();
		String tooltiptext = certificates.getAttribute("title");
		System.out.println("tooltip is: " + tooltiptext);
		Assert.assertEquals(tooltiptext, "Certificates");
		Thread.sleep(2000);

		WebElement exercise = driver.findElement(By.id("navbtn_exercises"));
		Actions eaction=new Actions(driver);
	     eaction.moveToElement(exercise).build().perform();
		String ExerciseTooltip = exercise.getAttribute("title");
		System.out.println("tooltip is: " + ExerciseTooltip);
	    Assert.assertEquals(ExerciseTooltip, "Exercises and Quizzes");
		Thread.sleep(5000);
		
		System.out.println(driver.findElement(By.id("navbtn_services")).getAttribute("title"));

		System.out.println(driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).getAttribute("title"));

		driver.close();
	}

}
