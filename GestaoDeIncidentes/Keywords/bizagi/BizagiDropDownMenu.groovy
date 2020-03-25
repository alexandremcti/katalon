package bizagi

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement


import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.ConditionType

import org.junit.After
import org.openqa.selenium.By as By

import internal.GlobalVariable

public class BizagiDropDownMenu {

	private static def tags = [
		input: '/child::div/child::div/child::div/child::div/child::div/child::input',
		i: '/child::div/child::div/child::div/child::div/child::div/child::i',
		ul: '/child::div/child::div[2]/ul',
		label: '/child::div/child::div/child::div/child::label[@class="readonly-control"]'
	]


	@Keyword
	def static TestObject getTestObject(String xpath, String tag){
		return buildTestObject(generatePath(xpath, tag))
	}


	private static TestObject buildTestObject(String xpath){
		TestObject to = generatePropertyToTestObject("xpath", xpath)
		return to
	}


	private static String generatePath(String xpath, String tag){
		String absolutePath = tag
		String path = String.format(BizagiSelectors.dynamicIdPath, xpath) + absolutePath
		return path
	}

	@Keyword
	def static void selectOption(String xpath, String value){
		WebUI.click(getTestObject(xpath, tags['i']))
		WebUI.verifyElementPresent(getComboBox(xpath), 5)
		WebUI.click(searchValue(getComboBox(xpath),value))
	}

	private static TestObject getComboBox(xpath){
		return buildTestObject(generatePath(xpath, tags['ul'] ))
	}

	private static TestObject searchValue(TestObject to, String value){
		def xpathProcurado = to.getProperties().get(0).getValue()
		WebDriver driver = DriverFactory.getWebDriver()
		WebElement ul = driver.findElement(By.xpath(xpathProcurado))
		List<WebElement> liList = ul.findElements(By.tagName('li'))
		int liCount =  liList.size()
		for(int i = 0; i < liCount; i++){
			if( equals(value, liList.get(i).getText() ) ){
				TestObject toLi = generatePropertyToTestObject("data-value", liList.get(i).getAttribute("data-value"))
				return toLi
			}
		}
		return new TestObject("objecName")
	}

	private static Boolean equals(String valueActual, String valueExpected){
		return valueActual == valueExpected
	}

	private static TestObject generatePropertyToTestObject(String property, String value){
		TestObject to = new TestObject("objectName");
		to.addProperty(property, ConditionType.EQUALS, value)
		return to;
	}

	@Keyword
	private static String getValue(String xpath){
		return WebUI.getText(getTestObject(xpath, tags['label']))
	}
}
