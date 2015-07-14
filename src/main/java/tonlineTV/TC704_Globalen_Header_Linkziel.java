package tonlineTV;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC704_Globalen_Header_Linkziel extends TOnlineTV{
	
	@Override
	public void runTest(){
		
		WebElement globHeader = driver.findElement(TVElements.gh_globhead);
		String currentTab = driver.getWindowHandle().toString();
		System.out.println("currentTab" + currentTab);
		
		if (globHeader.isDisplayed()) {
			driver.findElement(gh_mehr).click();
//			System.out.println("handle" + driver.getWindowHandle());
			System.out.println("handles" + driver.getWindowHandles());

			for (By elem : l_GlobHeadElem) {
				int i = 0;
				WebElement globHeadElem = driver.findElement(elem);
				globHeadElem.click();
				
				if(elem == gh_tonline){
					// get 2nd window and compare Urls
				System.out.println(driver.getWindowHandles().toArray());
				//currentTab = ...2nd wind.
				}
				
				if (driver.getCurrentUrl() == url_GlobHeadElem.get(i)) {
					System.out.println(elem + "URL stimmt überein");
					
					
				} else {
					System.out.println(elem + "URL stimmt nicht überein. Folgende URL wird aufgerufen" + driver.getCurrentUrl());
				}
			
				System.out.println("handle in for" +driver.getWindowHandle());
				System.out.println("handles in for" +driver.getWindowHandles());
				driver.getWindowHandle();
//				driver.get(TVElements.url_tvStartseite);
				i++;
//				System.out.println(l_GlobHeadElem.get(i));
//				System.out.println(driver.getWindowHandles());
				
					
				}
			}
			
		else {
			System.out.println("Globalen Header wird nicht angezeigt");
		}
		
		
	}

}
