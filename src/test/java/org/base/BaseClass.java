package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass  {
	

	    public static WebDriver driver;
	    
	    public static void launchBrowser()
	    {
	    	WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
	    }
	    
	    public static void windowsMaximize()
	    {
	    	driver.manage().window().maximize();
	    }
	    public static void launchUrl(String url) {
			driver.get(url);
		}
	    
	    public static void passText(String txt, WebElement ele)  {
	  
	    	ele.sendKeys(txt);
	    }
	    
	    public static void clickBtn(WebElement ele)
	    {
	    	ele.click();
	    }
	    public static String pageUrl()
	    {
	    	String url = driver.getCurrentUrl();
	    	return url;
	    }
	    
	    public static void closeEntireBrowser() {
	    	driver.quit();
	    }
	    
	    public void scrollToElement(WebElement element) {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true);", element);
	    }
	    
		public static void createNewExcelFile(int rowNum, int cellNum, String newData) throws IOException
		{
			File f = new File ("C:\\Users\\midhu.MIDHUN-PC\\eclipse-workspace\\MavenInstallationn\\Excel\\newFile.xlsx");
			Workbook w = new XSSFWorkbook();
			Sheet s = w.createSheet("Datas");
		    Row r = s.createRow(rowNum);
		    Cell c = r.createCell(cellNum);
		    c.setCellValue(newData);
		    FileOutputStream fos = new FileOutputStream(f);
		    w.write(fos);		
		}
		
		public static void createRow(int creRow, int crecell, String newData) throws IOException
		{
			File f = new File ("C:\\Users\\midhu.MIDHUN-PC\\eclipse-workspace\\MavenInstallationn\\Excel\\newFile.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook w = new XSSFWorkbook(fis);
			Sheet s = w.getSheet("Datas");
		    Row r = s.createRow(creRow);
		    Cell c = r.createCell(crecell);
		    c.setCellValue(newData);
		    FileOutputStream fos = new FileOutputStream(f);
		    w.write(fos);		
		}
		
		public static void createCell(int getRow, int crecell, String newData) throws IOException
		{
			File f = new File ("C:\\Users\\midhu.MIDHUN-PC\\eclipse-workspace\\MavenInstallationn\\Excel\\newFile.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook w = new XSSFWorkbook(fis);
			Sheet s = w.getSheet("Datas");
		    Row r = s.getRow(getRow);
		    Cell c = r.createCell(crecell);
		    c.setCellValue(newData);
		    FileOutputStream fos = new FileOutputStream(f);
		    w.write(fos);		
		}

	}


