package package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pagesource {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://google.com");
		String s=driver.getPageSource();
		if(s.contains("Gmail"))
		{
			System.out.println("text fount");
		}
		else
			System.out.println("not found");

	}

}
