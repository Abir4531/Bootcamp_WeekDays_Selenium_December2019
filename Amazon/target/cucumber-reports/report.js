$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/feature/testHomePage.feature");
formatter.feature({
  "name": "HomePage",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Amazon",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I am at amazon.com",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefination.TestHomePage_StepDefination.i_am_at_amazon_com()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am Clicking feedback button",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefination.TestHomePage_StepDefination.i_am_Clicking_feedback_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/span[2]/span[1]/input[1]\"}\n  (Session info: chrome\u003d80.0.3987.100)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-22KF3O9\u0027, ip: \u0027192.168.73.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002713.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.100, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: C:\\Users\\abirh\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:57114}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: e41ce6b19e91d5bed2ff28bd11df676b\n*** Element info: {Using\u003dxpath, value\u003d/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[2]/span[2]/span[1]/input[1]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy24.click(Unknown Source)\r\n\tat homepage.pageobject.HomePage.setAddFeedbackCancel(HomePage.java:107)\r\n\tat testhomepage.TestHomePage.testAddFeedback(TestHomePage.java:80)\r\n\tat stepdefination.TestHomePage_StepDefination.i_am_Clicking_feedback_button(TestHomePage_StepDefination.java:120)\r\n\tat ✽.I am Clicking feedback button(file:///C:/Users/abirh/IdeaProjects/Bootcamp_WeekDays_Selenium_December2019/Amazon/src/test/java/feature/testHomePage.feature:43)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "I am clicking the cancel button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.TestHomePage_StepDefination.i_am_clicking_the_cancel_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.background({
  "name": "Amazon",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I am at amazon.com",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefination.TestHomePage_StepDefination.i_am_at_amazon_com()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am hovering AccountAndListArray",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefination.TestHomePage_StepDefination.i_am_hovering_AccountAndListArray()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am going sign in page",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefination.TestHomePage_StepDefination.i_am_going_sign_in_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Opening new tab called Condition use",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.TestHomePage_StepDefination.opening_new_tab_called_Condition_use()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "Amazon",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I am at amazon.com",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefination.TestHomePage_StepDefination.i_am_at_amazon_com()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am Changing to spanish language",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefination.TestHomePage_StepDefination.i_am_Changing_to_spanish_language()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am taking screenShoot",
  "keyword": "And "
});
formatter.match({
  "location": "stepdefination.TestHomePage_StepDefination.i_am_taking_screenShoot()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Browser close",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefination.TestHomePage_StepDefination.browser_close()"
});
formatter.result({
  "status": "passed"
});
});