package com.tjuscs.st;

import java.io.*;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
    public static void main(String[] args) {
    	int passCount = 0, failCount = 0;
    	String dataPath = System.getProperty("user.dir") + "/data/data.txt";
    	try {
    		Scanner scanner = new Scanner(new FileInputStream(dataPath));
    	
    		String driverPath = System.getProperty("user.dir") + "/src/resources/driver/geckodriver.exe";
    		System.setProperty("webdriver.gecko.driver", driverPath);
    		WebDriver driver = new FirefoxDriver();
    		String baseURL = "http://103.120.226.190/selenium-demo/git-repo";
    		driver.get(baseURL);
    		while (scanner.hasNextLine()) {
    			String line = scanner.nextLine();
    			String[] data = line.split("\t");
    			if (data.length < 2) break;
    			
    			driver.findElement(By.name("user_number")).sendKeys(data[0]);
    			driver.findElement(By.name("password")).sendKeys(data[1]);
    			driver.findElement(By.cssSelector(".btn")).click();
    			String result = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/form/div[5]/code")).getText();
    			if (result.equals(data[1])) {
    				System.out.println(data[0] + " passed!");
    				passCount++;
    			} else {
    				System.out.println(data[0] + " failed!");
    				failCount++;
    			}
    		}
    		System.out.println(passCount  + " passed, " + failCount + " failed!");
    	} catch (Exception ex) {
    		System.out.println(ex.toString());
    		System.out.println("Exception caught!");
    	}
    }
}
