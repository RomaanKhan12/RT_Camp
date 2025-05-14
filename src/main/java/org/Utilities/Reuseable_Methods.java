package org.Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Reuseable_Methods {
	
	public static void handleDropdown(WebElement element , String value)
	{
		Select sl = new Select(element);
		sl.selectByValue(value);
	}

}
