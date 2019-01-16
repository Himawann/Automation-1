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

Mobile.startApplication('D:\\Katalon\\alfacart-2.3.0.apk', false)

not_run: Mobile.tap(findTestObject('mobile/android.widget.Button0 - OK'), 0)

Mobile.tap(findTestObject('Login App Prod/android.widget.ImageView8'), 0)

Mobile.tap(findTestObject('Login App Prod/android.widget.TextView0 - Login'), 0)

Mobile.setText(findTestObject('Login App Prod/android.widget.EditText0 - Alamat Email'), 'freak.fahmi@gmail.com', 0)

Mobile.setText(findTestObject('Login App Prod/android.widget.EditText1 - Password'), 'fahmi237', 0)

Mobile.tap(findTestObject('Login App Prod/android.widget.Button0 - MASUK'), 0)

