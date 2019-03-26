# Assessment Task2
I have completed this task using BDD framework(Cucumber).
In this, there will be two java classes and a feature file. 
Please find the references below:

    AddContactTestRunner(Java Class)- to run the test.(src/test/java/com.utilities.runner/AddContactTestRunner)
    AddContactStepDefinition(Java Class)- to define the test scripts.(src/test/java/com.stepDefinitions/AddContactStepDefinition) 
    AddContact.feature(Feature File)-to define the test cases.(src/test/resources/features)
## Prerequisites
    Java
    Selenium
    Cucumber
    Maven
    Junit 
### HOW TO RUN THE TEST
    Import the total project in your eclipse.
    In the src/test/java , you will be finding "AddContactTestRunner" class .
    Run AddContactTestRunner class using Junit.
#### Changes to be done to run the test in your local machine:
    In AddContactStepDefinition, in the setUP() method,Change the path of the Chrome driver. 
    You need to enter the path of chrome driver in your machine.
    Please install "Natural" plugin to your project from the eclipse marketplace or google.
##### Test Results
I have produced the results in multiple formats like xml,json,and html.

    xml report(karthik_xml/cucumber.xml)
    Json report(json_output/cucumber.json)
    html report(test-output/index.html)
    
###### Issues found
1. Results are not populating for the Customer field.
2. If i have proper database details regarding User List Table, i would have find the reason behind the issue.

