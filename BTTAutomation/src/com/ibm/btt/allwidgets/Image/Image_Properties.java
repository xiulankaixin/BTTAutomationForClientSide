package com.ibm.btt.allwidgets.Image;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.Tools;

public class Image_Properties extends AllWidgetsProjectMain_Class {
	/*
	 * private static WebDriver driver; private static String
	 * baseUrl=PropertiesUtil.baseUrl;
	 */
	private boolean acceptNextAlert = true;
	private static StringBuffer verificationErrors = new StringBuffer();
	private static Image_PageObject drv;

	@BeforeClass
	public static void setUp() throws Exception {
		/*
		 * driver = new FirefoxDriver();
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 * driver.get(baseUrl);
		 */
		AllWidgetsProjectMain_Class.setUp();
		drv = PageFactory.initElements(driver, Image_PageObject.class);
		drv.Establish();
		drv.BTT8200_tab();
		drv.image_widget();
		drv.Image_properties();
		waitUntilLoadElement(20,"Image_properties_Image_id");

	}
	
	@Test
	public void Image_tabIndex() {
		AllWidgetsProjectMain_Class.widget_tabIndex();
		assertEquals(true, drv.Image_properties_isfocus());
	}

	@Test
	public void Image_properties_id() {
		assertEquals("Image_properties_Image_id", drv.Image_properties_id_getId());
	}

	@Test
	public void Image_properties_dataNamefromImage_Data() {
		assertEquals(AllWidgetsProjectMain_Class.baseUrl + "img/Bomb1.jpg", drv.Image_properties_dataNamefromImage_Data());
	}

	@Test
	public void Image_properties_Location() {
		assertEquals(AllWidgetsProjectMain_Class.baseUrl + "img/Bomb1.jpg", drv.Image_properties_Location());
	}

	@Test
	public void Image_properties_visible() {
		assertEquals(true, drv.Image_properties_visible());
	}

	@Test
	public void Image_properties_hidden() {
		assertEquals(1, drv.Image_properties_hidden());
	}

	@Test
	public void Image_properties_gone() {
		assertEquals(1, drv.Image_properties_gone());
	}

	@Ignore
	public void Text_properties_disableTrue() {
		assertEquals(null, drv.Image_properties_disableTrue());
	}

	@Ignore
	public void Image_properties_disableFalse() {
		assertEquals(null, drv.Image_properties_disableFalse());
	}
	
	@Test
	public void proTargetBlank() throws Exception {
		assertEquals("about:blank", drv.proTargetBlank());
		driver.close();
		Image_Properties.setUp();
	}
	
	@Test
	public void propertiesTargetSelf() {
		assertEquals("English", drv.propertiesTargetSelf());
		driver.navigate().to(AllWidgetsProjectMain_Class.baseUrl);
		drv.Establish();
		drv.BTT8200_tab();
		drv.image_widget();
		drv.Image_properties();
	}
	
	@Test
	public void propertiesTargetParent() {
		assertEquals("English", drv.propertiesTargetParent());
		driver.navigate().to(AllWidgetsProjectMain_Class.baseUrl);
		drv.Establish();
		drv.BTT8200_tab();
		drv.image_widget();
		drv.Image_properties();
	}
	
	@Test
	public void propertiesTargetTop() {
		assertEquals("English", drv.propertiesTargetTop());
		driver.navigate().to(AllWidgetsProjectMain_Class.baseUrl);
		drv.Establish();
		drv.BTT8200_tab();
		drv.image_widget();
		drv.Image_properties();
	}
	
	@Test
	public void propertiesPageName() {
		assertEquals(true, drv.propertiesPageName());
		driver.navigate().to(AllWidgetsProjectMain_Class.baseUrl);
		drv.Establish();
		drv.BTT8200_tab();
		drv.image_widget();
		drv.Image_properties();
	}

	@Test
	public void Image_properties_alt() {
		assertEquals("����", drv.Image_properties_alt());
	}
	
	@Test
	public void Image_properties_hint() {
		assertEquals("This is hint test", drv.Image_properties_hint());
	}
	
	@Test
	public void Image_properties_tapIndex(){
		assertEquals("1",drv.Image_properties_tapIndex());
	}

	@AfterClass
	public static void tearDown() throws Exception {
		Tools.snapshot((TakesScreenshot) driver, AllWidgetsProjectMain_Class.allwidgets,Image_Properties.class);
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
