package bizagi

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.testobject.ConditionType

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.By.ByClassName
import org.openqa.selenium.By

import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

import internal.GlobalVariable

public class BizagiNewCaseWindow {


	@Keyword
	def static TestObject getTestObject(String bizagiClass){
		return buildTestObject(bizagiClass);
	}

	private static TestObject buildTestObject(String bizagiClass){
		String path = String.format(BizagiSelectors.dynamicClassPath, bizagiClass)
		TestObject to = new TestObject("objectName")
		to.addProperty("class", ConditionType.EQUALS, path)
		return to
	}

	@Keyword
	def static TestObject createCase(){
		WebDriver driver = DriverFactory.getWebDriver()
		String value = 'Criar'
		WebElement btnCreate = driver.findElement(By.xpath('//input[@value="Criar"]'))
		btnCreate.click()
	}
}
