## Demoblaze Task - Cucumber BDD Framework

---
Introduction
--
This framework is designed to facilitate Behavior-Driven Development (BDD) approach using Cucumber
that encourages collaboration between developers, QA and non-technical or business participants in a
software project.

### Features

- **Page Object Model(POM):** Implement the POM design pattern for maintainable and modular test automation.
- **Cucumber BDD:** Write and execute test scenarios in a human-readable format using Gherkin syntax.
- **Extensive Reporting:** Generate comprehensive test reports using Extent Reports for easy analysis.


### Prerequisites
Before you begin, ensure you have met the following requirements:
   * JDK 1.8
   * Maven project build tool
   * Intellij IDE
   * Browser driver

### Installation

1. Clone this repository to your local machine:

   ```bash
   git clone <https://github.com/AnkitaGoriya/Demoblaze-Task.git>
   
1. Navigate to the project directory:
   ```bash
   cd selenium-cucumber-java
2. Update the src/test/resources/config.properties file with your application's URL and other configurations.
3. Run the following command to download project dependencies:
   ```bash
   mvn clean install

### Usage
#### Writing Tests
1. Create feature files in the src/test/resources/featurefile/ directory using Gherkin syntax. 
   For example:
   ```gherkin
   Feature: Login functionality
    Scenario: Successful login
      Given   User is on the homepage
      When    User enter valid credentials
      Then    User should be login successfully
   
2. Implement step definitions in the com.demoblaze.steps package to map Gherkin steps to Java code.

#### Running Tests
 -  You can run tests using runner class and specify the cucumber tags to execute specific scenarios
   or features.
 -  You can find detailed reports in the target/Extent_Reports/report.html directory.

#### Test Reports
This framework generates test reports using Extent Reports, providing clear visualization of test results.

### Configuration
You can customize the framework's configuration by modifying the src/test/resources/config.properties file and other configuration files as needed.





   

