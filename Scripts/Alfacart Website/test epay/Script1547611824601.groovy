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

WebUI.navigateToUrl('http://uat.alfacart.com/')

WebUI.setText(findTestObject('Object Repository/Gopay Web/Page_Alfacart - Belanja Online Jadi/input_Daftar Jadi Penjual_q'), 
    'bimoli')

WebUI.click(findTestObject('Object Repository/Gopay Web/Page_Alfacart - Belanja Online Jadi/a_Add to cart'))

WebUI.click(findTestObject('Object Repository/Gopay Web/Page_Alfacart - Belanja Online Jadi/a_1'))

WebUI.click(findTestObject('Object Repository/Gopay Web/Page_Alfacart - Belanja Online Jadi/button_lanjut ke check out'))

WebUI.setText(findTestObject('Object Repository/Gopay Web/Page_Alfacart.com - Belanja Online/input_Alamat Email_email'), 
    'freak.fahmi@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Gopay Web/Page_Alfacart.com - Belanja Online/input_Password_password'), 
    'aNLBA2isM/JCWzdBOvM1fg==')

WebUI.click(findTestObject('Object Repository/Gopay Web/Page_Alfacart.com - Belanja Online/input_Password_btn btn-login m'))

WebUI.click(findTestObject('Object Repository/Gopay Web/Page_Alfacart - Belanja Online Jadi/button_lanjut ke check out'))

WebUI.click(findTestObject('Object Repository/Gopay Web/Page_Alfacart.com - Belanja Online/button_BAYAR (1)'))

WebUI.click(findTestObject('Object Repository/Gopay Web/Page_Alfacart.com - Belanja Online/a_LAINNYA (1)'))

WebUI.click(findTestObject('Object Repository/Gopay Web/Page_Alfacart.com - Belanja Online/a (1)'))

WebUI.click(findTestObject('Object Repository/Gopay Web/Page_Alfacart.com - Belanja Online/img'))

WebUI.click(findTestObject('Object Repository/Gopay Web/Page_Alfacart.com - Belanja Online/button_BAYAR_1'))

