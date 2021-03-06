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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.util.internal.PathUtil as PathUtil

Mobile.startApplication('D:\\Katalon\\alfacart-2.2.4-verify.apk', false)

Mobile.tap(findTestObject('search/android.widget.TextView14 - Cari Barang Disini'), 0)

Mobile.setText(findTestObject('search/android.widget.EditText0 - Cari Barang Disini'), 'A09350001881', 0)

Mobile.tap(findTestObject('search/android.widget.TextView0 - A09350001881 dalam Makanan Minuman  Buah Segar (1)'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('search/android.view.View0'), 0)

Mobile.tap(findTestObject('search/android.widget.Button0 - TAMBAHKAN KE KERANJANG'), 0)

Mobile.tap(findTestObject('search/android.widget.Button1 - BATAL'), 0)

Mobile.tap(findTestObject('search/android.widget.FrameLayout20'), 0)

Mobile.tap(findTestObject('search/android.widget.Button1 - BATAL'), 0)

Mobile.tap(findTestObject('checkout/android.widget.TextView17 - CHECKOUT'), 0)

Mobile.tapAndHold(findTestObject('checkout/android.widget.ScrollView0'), 0, 0)

Mobile.scrollToText('TOTAL', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('checkout/android.widget.Button0 - BAYAR'), 0)

Mobile.tap(findTestObject('apg/android.view.View29 -  Bank Transfer'), 0)

not_run: Mobile.tapAndHold(findTestObject('apg/android.view.View29 -  Bank Transfer'), 0, 0)

Mobile.scrollToText('Total', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('apg/android.widget.Button5 - BAYAR'), 0)

