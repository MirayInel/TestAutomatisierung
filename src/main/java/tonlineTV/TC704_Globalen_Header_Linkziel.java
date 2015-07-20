package tonlineTV;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC704_Globalen_Header_Linkziel extends TOnlineTV {

	@Override
	public void runTest() {

		WebElement globHeader = driver.findElement(TVElements.gh_globhead);

		if (globHeader.isDisplayed()) {
			driver.findElement(gh_mehr).click();
			System.out.println(driver.getWindowHandles());
			


			int i = 0;
			for (By elem : l_GlobHeadElem) {
				WebElement globHeadElem = driver.findElement(elem);
				globHeadElem.click();

				String[] currentWindows = driver.getWindowHandles().toArray(new String[driver.getWindowHandles().size()]);
				driver.switchTo().window(currentWindows[i+1]);
				 if (driver.getCurrentUrl() == url_GlobHeadElem.get(i)) {
				
					 System.out.println(driver.switchTo().window(currentWindows[i+1]).getCurrentUrl());
				 System.out.println(elem + "URL stimmt überein");
				 testStatus = true;
			
				 } else {
				 System.out.println(elem + "URL stimmt nicht überein. Folgende URL wird aufgerufen" + driver.getCurrentUrl());
				 testStatus=false;
				 } 
				
				driver.switchTo().window(currentWindows[0]);
//				driver.get(TVElements.url_tvStartseite);
				i++;
//				System.out.println(l_GlobHeadElem.get(i));
//				System.out.println(driver.getWindowHandles());

			}

		}
	}
}


