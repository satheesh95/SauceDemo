# SauceDemo
I have used the the Page object model to design the framework.
I have used the separate packages for the locators and tests.
i have stored the data in the Data.properties file.
I have created the TestBase class to initialize the browser and load data from the properties file.
i have used testNG to execute the test cases.
The test cases can be executed by running as TestNG suite.

Steps involved in the test are:
1.Open the URL "https://www.saucedemo.com/"
2.Enter the username and password and click on the login button.
3.In the Home page , select the product to add to the cart and cart link to enter the cart.
4.In the Cart page , click checkout button to land on the Customer details page.
5.In the customers details page , fill in the details and click continue.
6.In the checkout page click finish and validate the success message "THANK YOU FOR THE ORDER"

The required browser can be set in the properties file, in which the particular test cab be run.
I have configured to run the tests in chrome, firefox and microsodt Edge.
