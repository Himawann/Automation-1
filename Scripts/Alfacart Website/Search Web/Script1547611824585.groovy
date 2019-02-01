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

WebUI.setText(findTestObject('Object Repository/Search Web/Page_Alfacart - Belanja Online Jadi/input_Daftar Jadi Penjual_q'), 
    'A13730685847')

WebUI.click(findTestObject('Search Web/Page_Alfacart - Belanja Online Jadi/button_A09350001881_btn btn-de'))

WebUI.click(findTestObject('Object Repository/checkout Web/Page_Harga Susu Bendera Frisian Fla/a_Add to cart'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Object Repository/checkout Web/Page_Harga Susu Bendera Frisian Fla/button_Batal'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/checkout Web/Page_Harga Susu Bendera Frisian Fla/a_1'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Search Web/Page_Alfacart - Belanja Online Jadi/button_Batal'))

WebUI.delay(3)

