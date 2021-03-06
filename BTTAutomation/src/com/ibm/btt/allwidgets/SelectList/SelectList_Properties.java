package com.ibm.btt.allwidgets.SelectList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;
import com.ibm.btt.util.Event;

public class SelectList_Properties extends AllWidgetsProjectMain_Class {

	private boolean acceptNextAlert = true;
	private static StringBuffer verificationErrors = new StringBuffer();
	private static SelectList_PageObject drv;

	@BeforeClass
	public static void setUp() throws Exception {
		
		AllWidgetsProjectMain_Class.setUp();
		drv = PageFactory.initElements(driver, SelectList_PageObject.class);
		drv.Establish();
		drv.BTT8200_tab();
		drv.SelectList_widget();
		drv.SelectList_properties();
		AllWidgetsProjectMain_Class.waitUntilLoadElement(20, "widget_SelectList_properties_selectList_03");

	}
	
	@Test
	public void proTab() throws InterruptedException{
		AllWidgetsProjectMain_Class.widget_tabIndex();
		assertEquals(2, drv.proTab());
	}
	
	@Test
	public void proId(){
		assertEquals("widget_SelectList_properties_selectList_03", drv.proId());
	}
	
	@Test
	public void proDataname() {
		assertEquals("AccountInfoList.0.AccountNo", drv.proDataname());
	}

	@Test
	public void proUrlForList() {
		assertEquals("urlForlist", drv.proUrlForList());
	}

	@Test
	public void proDataNameForList(){
		String[] strings = drv.proDataNameForL();
		for(int i = 0; i < strings.length; i++){
			assertEquals("Account" + i, strings[i]);
		}
	}
	

	@Test
	public void proLabelField() {
		assertEquals("Account0", drv.proLabelField());
	}

	@Test
	public void proValueField() {
		assertEquals("0", drv.proValueField());
	}

	@Test
	public void proVisible() {
		assertEquals(true, drv.proVisible());
	}

	@Test
	public void proHidden() {
		assertEquals("visibility: hidden;", drv.proHidden());
	}
	
	@Test
	public void proGone(){
		assertEquals("display: none; visibility: inherit;", drv.proGone());
	}
	
	@Test
	public void proDisableFalse(){
		assertEquals(true, drv.proDisableFalse());
	}	
	
	@Test
	public void proDisableTrue(){
		assertEquals("true", drv.proDisableTrue());
	}

	@Test
	public void proReadonlyFalse(){
		assertEquals(true, drv.proReadonlyFalse());
	}
	
	@Test
	public void proReadonlyTrue(){
		assertEquals("true", drv.proReadonlyTrue());
	}
	
	@Test
	public void proShortcut(){
		assertEquals(2, drv.proShortcut());
	}
	
	@Test
	public void proNLSHint(){
		assertEquals("TradingVolume", drv.proNLSHint());
	}
	
	@Test
	public void proHint(){
		assertEquals("Test hint", drv.proHint());
	}
	
	@Test
	public void proTabIndex(){
		assertEquals("12", drv.proTabIndex());
	}
	
	@Test
	public void proTypeAHeadFalse(){
		assertEquals("", drv.proTypeAHeadFalse());
	}
	
	@Test
	public void proTypeAHeadTrue(){
		assertEquals(true, drv.proTypeAHeadTrue());
	}
	
	@Test
	public void proPlaceHolder(){
		assertEquals("Transfer", drv.proPlaceHolder());
	}

	@AfterClass
	public static void tearDown() throws Exception {
		Tools.snapshot((TakesScreenshot) driver, AllWidgetsProjectMain_Class.allwidgets,SelectList_Properties.class);
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
