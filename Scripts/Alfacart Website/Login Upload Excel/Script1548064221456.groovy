import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')
WebUI.navigateToUrl('https://www.alfacart.com/')

WebUI.click(findTestObject('Object Repository/Login Web/Page_Alfacart - Belanja Online Jadi/span_x'))
String result = WebUI.getText(findTestObject('Object Repository/Login Web/Page_Alfacart - Belanja Online Jadi/span_x'))
String result2 = WebUI.getText(findTestObject('Object Repository/Login Web/Page_Alfacart - Belanja Online Jadi/a_MasukDaftar'))

WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Login Web/Page_Alfacart - Belanja Online Jadi/a_MasukDaftar'))

String[] data0 = new String[2];
data0[0] = result;
data0[1] = "test";

String[] data1 = new String[2];
data1[0] = result2;
data1[1] = "test";

CustomKeywords.'excel.writeExcel.demoKey'(0, data0)
CustomKeywords.'excel.writeExcel.demoKey'(1, data1)

