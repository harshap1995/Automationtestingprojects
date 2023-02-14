package package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		String actual=driver.getTitle();
		String exp="google";
		if(actual.equalsIgnoreCase(exp))
		{
			System.out.println("pass");
		}
		else
			
			System.out.println("fail");
	}

}
