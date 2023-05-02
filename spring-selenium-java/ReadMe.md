Automation of 'J.P Morgan' Google Search

### Test Coverage

#### Positive Test Case:
Automated Tests are covered for the below requirement:
1. User is launching the Google Web URL
2. Search 'J. P. Morgan' as search term in the Google search bar
3. Click the first returned search result
4. Validate if the clicked link is J.P. Morgan's Home Page
5. Accept the Cookies on the Home page
6. Validate the J.P.Morgan Logo on the Home Page

#### Negative Test Case:
1. User is launching the Google Web URL
2. Search 'j p morgan uk' as search term in the Google search bar
3. Click the first returned search result
4. Validate the J.P.Morgan Home page and Logo are not present on the clicked web Page

### Features of framework
* Spring Dependency Injection Model
* BDD - Cucumber
* Maven Build
* Selenium Java

### Re-Usable PageObjects and Methods written in the Framework
1. init()  
2. click()  
3. getCurrentUrl()  
4. typeText()  
5. isElementDisplayed()  
6. waitForElement()  

### Software Pre-Requisites
Browsers - Chrome
IntelliJ IDE (along with Git, Cucumber, Gherkin Plugins) 
Java JDK 17
Maven
Git Bash
Spring Framework Dependencies

### Currently supported browsers
*Chrome

### Pre-Requisites
* Download Java JDK 17 and configure the Environment Properties as below : 
  	- JAVA_HOME as 'C:\Program Files\Java\jdk17.0.7' in System Variables 
	- Add 'C:\Program Files\Java\jdk17.0.7\bin' path to the Path Variable
* Download and Install IntelliJ IDE to write Test Scripts. Also Install Cucumber, Git, Gherkin Plugins in the IDE
* Download and Install Maven for Windows. 
	- set MAVEN_HOME system variable in Environment Properties and Maven Bin path in the Path Variable
* Make sure the .m2 repository is properly created to access the Maven Repository and Libraries while running the project

### Project Structure
	- pom.xml has spring framework, cucumber-testng dependency, Selenium java dependency, io.github.bonigarcia webdriver manager, cucumber-java dependency
	- src-> test -> java -> org.example -> config, driverUtil, tests, pages, stepdefs packages.
	- Driver Util package contains the WebDriver manager files
	- tests holds the Test Runner File that has feature path, step definitions path and cucumber reports been configured. It's the main file to kick-start the execution.
	- pages contains the Page Object files with actual Locators and re-usable methods to be used across the Test Suite
	- stepdefs contains the step file which calls the Page Objects to validate the Tests
	- Add src -> test -> resources -> features -> Google.feature defines the Acceptance Criteria of the J.P. Morgan Automation Test in Gherkin Language


### How to run?
Clone the Project to your Local using Git Clone commands:
gh repo clone VijayalakshmiNeelakandan/spring-selenium-java

Check all the Pre-requisites are set before trying to execute the project.
Issue the below commands in project root directory

##### Maven
```javascript
mvn clean verify
```
Or
```javascript
mvn clean verify -Dbrowser=chrome
```
'mvn verify' would refer the runner file to get the cucumber options to execute the respective features/ step definitions configured in it. 
By default, it takes Chrome as Driver to execute the project

### Reports
After the test execution completed, you can see Cucumber Basic HTML report as reports.html under target -> cucumber-report directory
