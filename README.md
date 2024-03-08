"# MasterSelenuimFramework" 


# Project-Master-Automation-Selenium-Framework project.

✨ Project # 8✨

📅 Project Date: November 26, 2023

✨ Master-Automation-Selenium-Framework Practice ==> Selenium Test Automation ✨

🌐 Website : https://rahulshettyacademy.com/client



📝 The main Frameworks included in the project:

Grid > Cross-browser Testing

Page Object Model, also known as POM,design pattern

Data driven testing framework  
    1.GetDataFrom-Excel-into-Data-driver
    2.Data-driver annotation

BDD (Behavior Driven Development) Framework  > Cucumber Framework
     1.Example for Test-data

Maven build management tools basics

TestNG for test runner

Cucumber Report

Extent report

jenkins for Continuous Integration (CI) and Continuous Deployment (CD)

Git / Github for source distributed version control system



🎨 Project Design:

Page Object Model design pattern

Data Driven framework Cucumber Example keywords

BDD framework

Java OOP



🏗️ Project Structure:

Maven Project

           src / main / java

           src / main / test



🔊 this project included

📦️ 1 packages in src/main/java

>AbstractionComponent > PageBase
>pages contains pages (locators & methods)
>resources (global.properties - ExtentReporterNG - GetDataFromExcelintoDatadriver)


📦️ 4 packages in src/test/java

>cucumber.runner (TestNGTestRunner)
>feature (SubmitOrder.feature)
>stepDefinitions (StepDefinition methods)
> tests
> test component (BaseTest - Listeners)




⚗️ 5 xml files

pom.xml ( XML file that contains information about the project and configuration details used by Maven to build the project)

- Grid execution
- SP1_Login_VerifyLogin
- SmokeTesting
- RegressionTesting 
- Parallel execution
- sequential  execution 


🧱Reports
- Cucumber reports integrated with TestNG (/target/cucumber.html)
- ExtentReports extent =new ExtentReports();
- extent.attachReporter(reporter);
- path : /reports//index.html

  <listeners>
    <listener class-name="baseComponent.Listeners"/>
  </listeners>

- mvn test




🔎 Take a look at my README.md file



🌐GitHubLink: https://github.com/eslamlotfy213/MasterSelenuimFramework

#selenuim #Webautomation #project #java #testng #datadriven #POM
 



