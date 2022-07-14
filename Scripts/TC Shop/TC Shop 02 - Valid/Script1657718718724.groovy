import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://kotakoki.wijaysali.my.id/')

WebUI.click(findTestObject('Shop/On Sale/span_Shop'))

WebUI.click(findTestObject('Shop/img_album'))

WebUI.click(findTestObject('Object Repository/Shop/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Shop/a_View cart'))

WebUI.click(findTestObject('Object Repository/Shop/a_Proceed to checkout'))

WebUI.setText(findTestObject('Object Repository/Shop/input__billing_first_name'), 'Ayub')

WebUI.setText(findTestObject('Object Repository/Shop/input__billing_last_name'), 'Yoga')

WebUI.setText(findTestObject('Object Repository/Shop/input_(optional)_billing_company'), 'Man Utd')

WebUI.setText(findTestObject('Object Repository/Shop/input__billing_address_1'), 'Sarijadi')

WebUI.setText(findTestObject('Object Repository/Shop/input_(optional)_billing_address_2'), 'Blok 13 No 78')

WebUI.setText(findTestObject('Object Repository/Shop/input__billing_city'), 'Bandung')

WebUI.setText(findTestObject('Object Repository/Shop/input__billing_postcode'), '14045')

WebUI.setText(findTestObject('Object Repository/Shop/input__billing_phone'), '08112310222')

WebUI.setText(findTestObject('Object Repository/Shop/input__billing_email'), 'akunbaruu1@gmail.com')

WebUI.setText(findTestObject('Object Repository/Shop/textarea_(optional)_order_comments'), 'send immediately please')

WebUI.click(findTestObject('Shop/input_TEST MODE_payment_method'))

WebUI.click(findTestObject('Object Repository/Shop/button_Place order'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/div_IDR 15.000'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/div_Virtual Account'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/div_Nama Virtual Account'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/li_Atm'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Shop/li_Mbanking'), 0)

WebUI.closeBrowser()

// ayp
