# 🛒 Web eCommerce Automation Testing

![Java](https://img.shields.io/badge/Java-11%2B-blue.svg)
![Maven](https://img.shields.io/badge/Maven-3.8%2B-brightgreen.svg)
![TestNG](https://img.shields.io/badge/TestNG-Automation-yellow.svg)
![Selenium](https://img.shields.io/badge/Selenium-WebDriver-orange.svg)

This project automates test cases for a Web eCommerce platform using **Java**, **Maven**, **Selenium WebDriver**, and **TestNG**. It implements the **Page Object Model (POM)** design pattern to improve maintainability and reusability.

---

## 📌 Scope
This project includes automated testing of several key features on the Swag Labs website, namely:

- Login page for all valid users as well as error scenarios.
- Product page, including sorting features and detailed product views.
- Shopping cart page for users who have successfully logged in.

---

## 📋 System Requirements

Make sure you have the following installed:

- **Java JDK** (minimum version 11)
- **Apache Maven** (minimum version 3.8)
- **IDE** such as **Visual Studio Code**, **IntelliJ IDEA**, etc.
- **Google Chrome** browser
- **ChromeDriver** (compatible with your Chrome version)

---

## 📄 Test Cases
- **For full details, plaase refer to the following documen:**
[**Test Cases - Ecommerce.xlsx**](TestCases-Ecommerce.xlsx)

---

## 🚀 Quick Installation

1. **Clone the repository**:

   ```bash
     git clone https://github.com/Raihannnhafid/projek-minggu-3.git
    ```
2. **Navigate to the project folder**:
    ```bash
    cd projek-minggu-3
    ```
3. **Open the project in VS Code:**:
    ```bash
    code .
    ```

---

## ▶️ Run All Tests
**To run all automated tests:**
```bash
mvn clean test
```

## 📁 Run Specific Test Suite
**To run tests using a specific suite (e.g., testng.xml):**
```bash
mvn clean test -Dsurefire.suiteXmlFiles=src/test/resources/testng.xml
```

---

## 🧰 Tech Stack Used
- **Java**
- **Maven**
- **Selenium WebDriver**
- **TestNG**
- **Page Object Model (POM)**
- **ExtentReports (optional if configured)**

---

## 📂 Project Structure (Sample)
```text
└───JuaraCodingEcom
    ├───.vscode
    ├───src
    │   ├───main
    │   │   └───java
    │   │       └───com
    │   │           └───juaracoding
    │   │               └───ecom
    │   │                   ├───pages
    │   │                   ├───repositories
    │   │                   └───utils
    │   └───test
    │       ├───java
    │       │   └───com
    │       │       └───juaracoding
    │       │           └───ecom
    │       │               └───providers
    │       └───resources
    └───target
        ├───classes
        │   └───com
        │       └───juaracoding
        │           └───ecom
        │               ├───pages
        │               ├───repositories
        │               └───utils
        ├───generated-sources
        │   └───annotations
        ├───generated-test-sources
        │   └───test-annotations
        ├───maven-status
        │   └───maven-compiler-plugin
        │       ├───compile
        │       │   └───default-compile
        │       └───testCompile
        │           └───default-testCompile
        ├───surefire-reports
        │   ├───junitreports
        │   └───Swaglabs eCommerce Suite
        └───test-classes
            └───com
                └───juaracoding
                    └───ecom
                        └───providers
```

---


## ⚠️ Notes
- **Ensure that your chromedriver version matches your Chrome browser version.**

- **You can configure WebDriver setup in DriverManager.java or use a config.properties file if available.**

---

## 📄 License
**project is for learning and testing purposes only.**





