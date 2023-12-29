# MavenAutomationProject
This is Maven-TestNG Project


My Automation project- I created the maven project. In maven-Testng project under pom.xml Need to add all the dependencies like Testng, selenium, Webdriver manager. It maintains page objects package which has class file for every page. So, inside that class file It maintains web elements for that particular page and also has the corresponding action methods for that web elements. I created separate package for test cases and create classes for every page (ex: footer testcases ,login test cases , logout). In class file It has methods for test cases and those methods will tagged with @testannotations. For maintain the test data I use data provider this is the testng concept where we will create a separate method that returns object array, and we keep the data in that array. Then I created one testng.xml file and has the class names in that file, and I will execute this file. So that all the test cases will be executed as part of the class file.
About TestResults Report-  Test-output folder , Index.html has the testresults generated using system editor in Eclipse IDE.

