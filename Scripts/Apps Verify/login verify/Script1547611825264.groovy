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

Mobile.startApplication('D:\\Katalon\\alfacart-2.2.4-verify.apk', false)

Mobile.tap(findTestObject('login apps verify/android.widget.ImageView9'), 0)

Mobile.tap(findTestObject('login apps verify/android.widget.TextView0 - Login'), 0)

Mobile.setText(findTestObject('login apps verify/android.widget.EditText0 - Alamat Email'), 'freak.fahmi@gmail.com', 0)

Mobile.setText(findTestObject('login apps verify/android.widget.EditText1 - Password'), 'fahmi237', 0)

Mobile.tap(findTestObject('login apps verify/android.widget.Button0 - MASUK'), 0)

