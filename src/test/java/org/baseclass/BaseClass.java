package org.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass<Takescreenshot> {
	public static WebDriver driver;

	public static void browserSetup(String url) {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
	}

	public static void url(String url) {

		driver.get(url);
	}

	public static void max() {
		driver.manage().window().maximize();

	}

	public static void sendkeys(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void clik(WebElement element) {
		element.click();
	}

	public static void quit() {
		driver.quit();
	}

	public static WebElement findById(String vlaue) {
		WebElement element = driver.findElement(By.id(vlaue));
		return element;
	}

	public static WebElement findByName(String vlaue) {
		WebElement element = driver.findElement(By.name(vlaue));
		return element;

	}

	public static WebElement findByXpath(String value) {
		WebElement element = driver.findElement(By.xpath(value));
		return element;
	}

	public static void sleep(long value) throws InterruptedException {

		Thread.sleep(value);
	}

	public static void moveToElement(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();

	}

	public static void DragDrop(WebElement target, WebElement source) {
		Actions action = new Actions(driver);
		action.dragAndDrop(source, target).perform();

	}

	public static void contextClick(WebElement element) {
		Actions action = new Actions(driver);
		action.contextClick(element).perform();

	}

	public static void keyPress(int KeyEvent) throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent);
		robot.keyRelease(KeyEvent);
	}

	public static void doubleclick(WebElement element) {
		Actions action = new Actions(driver);
		action.doubleClick(element).perform();

	}

	public static void keyDown(CharSequence value) {

		Actions action = new Actions(driver);
		action.keyDown(value).perform();
		action.keyUp(value).perform();
	}

	public static void acSendKeyCap(CharSequence key, CharSequence value, CharSequence element) {
		Actions action = new Actions(driver);
		action.keyDown(key).sendKeys(element, value).keyDown(key).perform();

	}

	public static void acSendKey(CharSequence keys, CharSequence element) {
		Actions action = new Actions(driver);
		action.sendKeys(element, keys);
	}

	public static void alertAccept() {
		driver.switchTo().alert().accept();
	}

	public static void alertDismiss() {
		driver.switchTo().alert().dismiss();
	}

	public static void alertSendKey(String value) {
		driver.switchTo().alert().sendKeys(value);
		driver.switchTo().alert().accept();
	}

	public static String alertGetText(String value) {
		driver.switchTo().alert().sendKeys(value);
		String text = driver.switchTo().alert().getText();
		return text;
	}

	public static void selectIndex(WebElement element, int value) {
		Select select = new Select(element);
		select.selectByIndex(value);
	}

	public static void selectValue(WebElement element, String value) {
		Select select = new Select(element);

		select.selectByValue(value);

	}

	public static void selectByText(WebElement element, String value) {
		Select s = new Select(element);

		s.selectByVisibleText(value);

	}

	public static void deSelectIndex(WebElement element, int value) {
		Select s = new Select(element);
		s.deselectByIndex(value);
	}

	public static void deSelectValue(WebElement element, String value) {
		Select s = new Select(element);
		s.deselectByValue(value);
	}

	public static void deSelectText(WebElement element, String value) {
		Select s = new Select(element);
		s.deselectByVisibleText(value);
	}

	public static void deSelectAll(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();
	}

	public static List<WebElement> getOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		return options;
	}

	public static void screenShot(String value) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File s = screenshot.getScreenshotAs(OutputType.FILE);
		File d = new File(value);
		FileUtils.copyFile(s, d);
	}

	public static void screenShotElement(WebElement element) throws IOException {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File s = element.getScreenshotAs(OutputType.FILE);
		File d = new File("");
		FileUtils.copyFile(s, d);
	}

	public static List<WebElement> getAllSelectedOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> allOptions = s.getAllSelectedOptions();
		return allOptions;
	}

	public static String getAtribute(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		return attribute;
	}

	public static String getText(WebElement element) {
		String text = null;
		if (isDisplayed(element)) {
			text = element.getText();
		}
		return text;
	}

	public static boolean isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	public static void sendKeys(WebElement element, CharSequence value) {
		if (isDisplayed(element) && value != null) {
			element.sendKeys(value);
		}
	}

	public static void imWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

	}

	public static void exwait(WebElement element) {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(200));
		w.until(ExpectedConditions.visibilityOf(element));
	}

	public static String getCell(String sheetname, int row, int cellnum) throws IOException {
		String value = null;
		File f = new File("");
		FileInputStream stream = new FileInputStream(f);
		Workbook work = new XSSFWorkbook(stream);
		Sheet s = work.getSheet(sheetname);
		Row row2 = s.getRow(row);
		Cell cell = row2.getCell(cellnum);
		CellType type = cell.getCellType();
		switch (type) {

		case STRING:
			value = cell.getStringCellValue();
			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat s1 = new SimpleDateFormat("dd-MM-YYY");
				value = s1.format(dateCellValue);
			} else {
				double numericCellValue = cell.getNumericCellValue();
				long round = Math.round(numericCellValue);
				value = String.valueOf(cellnum);
			}

		default:
			break;
		}
		return value;
	}

	public static void updateCell(String sheetname, int row, int cellnum, String oldData, Date newData)
			throws IOException {
		File f = new File("");
		FileInputStream stream = new FileInputStream(f);
		Workbook work = new XSSFWorkbook(stream);
		Sheet s = work.getSheet(sheetname);
		Row row2 = s.getRow(row);
		Cell cell = row2.getCell(cellnum);
		String value = cell.getStringCellValue();
		if (value.equals(oldData)) {
			cell.setCellValue(newData);

		}
		FileOutputStream fileoutput = new FileOutputStream(f);
		work.write(fileoutput);

	}

	public static void createCell(String value, int rowNum, int cellNum) throws InvalidFormatException, IOException {
		File f = new File("");
		Workbook work = new XSSFWorkbook(f);
		Sheet sheet = work.createSheet(value);
		Row row = sheet.createRow(rowNum);
		Cell cell = row.createCell(cellNum);
		FileOutputStream fileoutput = new FileOutputStream(f);
		work.write(fileoutput);

	}

	public static void jseSet(String index, String userValue, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[" + index + "].setAttribute('value','" + userValue + "')", element);

	}

	public static void jseGet(String index, Object element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[" + index + "].getAttribute('value')", element);

	}

	public static void jseClick(String element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", element);

	}

	public static void jseScrollDown(String element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}

	public static void jseScrollUp(String element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	public static void jse() {

	}
//
//public static void exwait() {
//	
//}	
//public static void exwait() {
//	
//}	
//public static void exwait() {
//	
//}	

}
