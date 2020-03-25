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
import internal.GlobalVariable

public class BizagiExtendedText {

	@Keyword
	def static TestObject getTestObject(String xpath){
		return buildTestObject(xpath)
	}


	private static TestObject buildTestObject(String xpath){
		String absolutePath = "/child::div/child::div/child::div/child::textarea"
		String path = String.format(BizagiSelectors.dynamicIdPath, xpath) + absolutePath
		TestObject to = new TestObject("objectName")
		to.addProperty("xpath", ConditionType.EQUALS, path)
		return to
	}

	@Keyword
	def static void getValue(String xpath){
		String absolutePath = "/child::span/child::label"
	}
}
