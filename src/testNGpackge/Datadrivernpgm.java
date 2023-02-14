package testNGpackge;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//DATA DRIVEN TEST

public class Datadrivernpgm {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test1() throws IOException
	{
		//to read a file
		FileInputStream f=new FileInputStream("C:\\Users\\user\\Desktop\\selenium\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);//workbook
		XSSFSheet sh=wb.getSheet("Sheet1");//sheet
		int rowcount=sh.getLastRowNum();//rowcount
		for(int i=1;i<=rowcount;i++)
		{
			//to get value from excel column and row wise
			String usrename=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username="+usrename);
			String password=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("password="+password);
			driver.get("https://www.facebook.com/");
			driver.findElement(By.name("email")).sendKeys(usrename);
			driver.findElement(By.name("pass")).sendKeys(password);
			driver.findElement(By.name("login")).click();
			
		}
		
		
		
		
		
		
	}

}
