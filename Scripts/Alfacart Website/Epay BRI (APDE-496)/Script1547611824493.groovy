import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.junit.After as After
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.testobject.SelectorMethod as SelectorMethod
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Object Repository/checkout Web/Page_Alfacart - Belanja Online Jadi/button_lanjut ke check out'))

WebUI.delay(5)

WebUI.click(findTestObject('apg web/Page_Alfacart.com - Belanja Online/button_BAYAR'))

WebUI.click(findTestObject('Epay BRI Web/Page_Alfacart.com - Belanja Online/a_LAINNYA (1)'))

WebUI.click(findTestObject('Epay BRI Web/Page_Alfacart.com - Belanja Online/a (1)'))

WebUI.delay(10)

WebUI.click(findTestObject('checkout Web/Page_Alfacart.com - Belanja Online/button_BAYAR_1'))

WebUI.delay(5)

//TestObject to = findTestObject('Epay BRI Web/Page_Midtrans Mock Payment Provider/input_Nama_username',[('id') : '{inputMerchantId}',[('(name)'):'{username}']])
//Change value of CSS selector
//to.setSelectorValue(SelectorMethod.CSS, 'testuser00')
//Change selection method from another selector to CSS selector
//to.setSelectorMethod(SelectorMethod.CSS)
//WebUI.setText(findTestObject(to), 'testuser00')
WebUI.setText(findTestObject('Epay BRI Web/Page_Midtrans Mock Payment Provider/input_Nama_username'), 'testuser00')

WebUI.delay(5)

WebUI.click(findTestObject('Epay BRI Web/Page_Midtrans Mock Payment Provider/button_Bayar'))

WebUI.delay(5)

WebUI.click(findTestObject('Epay BRI Web/Page_Midtrans Mock Payment Provider/button_Kembali ke website Merc'))

