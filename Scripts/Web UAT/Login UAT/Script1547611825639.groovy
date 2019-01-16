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

not_run: autoit_prj = 'D:\\Katalon\\Authentication_Custom.exe'

not_run: Runtime.getRuntime().exec(autoit_prj)

not_run: Thread.sleep(500)

WebUI.navigateToUrl('https://uat.alfacart.com/')

not_run: for (def index : (0..0)) {
}

not_run: WebUI.click(findTestObject('Object Repository/Login Web/Page_Alfacart - Belanja Online Jadi/span_x'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Login Web/Page_Alfacart - Belanja Online Jadi/a_MasukDaftar'))

WebUI.setText(findTestObject('Object Repository/Login Web/Page_Alfacart.com - Belanja Online/input_Alamat Email_email'), 
    'automation@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Login Web/Page_Alfacart.com - Belanja Online/input_Password_password'), 
    'aNLBA2isM/JCWzdBOvM1fg==')

WebUI.click(findTestObject('Object Repository/Login Web/Page_Alfacart.com - Belanja Online/input_Password_btn btn-login m'))

