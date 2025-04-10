# Amazon Automation

This project is an automated test suite for the **Amazon India** website, using **Selenium WebDriver** with **TestNG** and **Java**. The goal is to automate the process of searching for an iPhone, verifying search suggestions, interacting with product pages, and validating various UI elements on the site.

## Table of Contents

- [Project Overview](#project-overview)
- [Technologies Used](#technologies-used)
- [Setup](#setup)
- [Running the Tests](#running-the-tests)
- [Folder Structure](#folder-structure)
- [Screenshot - TestNG Report](#screenshot---testng-report)
- [Screenshot - Allure Dashboard](#screenshot---allure-dashboard)
- [Watch the Demo](#watch-the-demo)
- [Contributing](#contributing)
- [License](#license)

## Project Overview

This project automates the following tasks:

1. Open Amazon India and search for **iPhone 13**.
2. Validate that the search suggestions are related to **iPhone 13**.
3. Refine the search with the **iPhone 13 128 GB** variant.
4. Click on the suggested product and validate the product page in a **new tab**.
5. Click on the **Visit the Apple Store** link from the product page.
6. Click on **Apple Watch dropdown** and select **Apple Watch SE (GPS + Cellular)**.
7. Hover over the **Apple Watch** image to trigger the **Quick Look** modal.
8. Validate that the modal is related to the **Apple Watch SE (GPS + Cellular)** for which Quick look is performed.

The tests are written in Java and use **TestNG** for test management. Selenium WebDriver is used to simulate the user interactions. **Allure Reporting** is integrated for visualizing test results.

## Technologies Used

- **Selenium WebDriver** – for browser automation
- **TestNG** – for running and managing tests
- **Java** – for writing the test scripts
- **Maven** – for dependency management and build automation
- **Allure** – for generating beautiful test reports

## Setup

### Prerequisites

- **JDK 11 or higher** installed on your machine.
- **Maven** installed for managing dependencies.
- **ChromeDriver** for Chrome browser automation (make sure it's in your `PATH` or specify the location in the code).

#### Chrome Version and ChromeDriver Version Used:

- **Chrome Version:** 135.0.7049.85
- **ChromeDriver Version:** 135.0.7049.84

Download the specific ChromeDriver version here: [ChromeDriver 135.0.7049.84](https://googlechromelabs.github.io/chrome-for-testing/)

### Clone the Repository

```bash
git@github.com:effusiveanam/Amazon-Automation.git
cd Amazon-Automation
```

### Install Dependencies

Run the following Maven command to install the necessary dependencies:

```bash
mvn clean install
```

### Running the Tests

To run the tests, use TestNG. You can run it from your IDE or via Maven. For Maven:

```bash
mvn test
This will execute the tests as per the configuration in testng.xml.
```

### Allure Reporting

After running the tests, you can generate an Allure report by using the following Maven command:

```bash
mvn allure:serve
```

This will open a local server to display the test results.

### Folder Structure

Here’s an overview of the project structure:

```bash

amazon-automation/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── amazon/
│   │               ├── base/
│   │               │   ├── BasePage.java
│   │               │   └── BaseTest.java
│   │               ├── constants/ # Stores constant variables (URLs, search text, etc.)
│   │               │   └── Constants.java
│   │               ├── pages/ # Page Object Model (POM) classes
│   │               │   ├── AppleStorePage.java
│   │               │   ├── HomePage.java
│   │               │   └── IphoneProductPage.java
│   │               └── utils/ # Utility classes (Waits, Element interactions)
│   │                   ├── AppleStorePageUtil.java
│   │                   ├── BasePageUtil.java
│   │                   ├── CommonUtil.java
│   │                   └── IphoneProductPageUtil.java
│   └── test/
│       └── java/
│           ├── com/
│           │   └── amazon/
│           │       ├── amazon_automation/
│           │       └── tests/ # Test classes (TestNG tests)
│           │           └── AmazonTest.java
├── pom.xml # Maven build file
├── testng.xml # TestNG configuration file
├── README.md # Project documentation
├── .gitignore # Ignored files/folders (like IDE files, build files)
├── test-output/ # TestNG output (ignored by Git)
├── target/ # Compiled project files (ignored by Git)
│   ├── allure-results/ # Allure test results folder
│   ├── generated-sources/
│   ├── generated-test-sources/
│   ├── maven-status/
│   └── site/
├── allure-results/ # Allure test results folder
```

### Screenshot - TestNG Report

<img width="1710" alt="Screenshot 2025-04-10 at 3 42 52 PM" src="https://github.com/user-attachments/assets/d1e663c2-ffd4-4d51-a6c7-d941607f5f5c" />

### Screenshot - Allure Dashboard

<img width="1710" alt="Screenshot 2025-04-10 at 4 10 59 PM" src="https://github.com/user-attachments/assets/34296424-3c3a-4760-aa3c-be9550e958c4" />

<img width="1710" alt="Screenshot 2025-04-10 at 4 09 41 PM" src="https://github.com/user-attachments/assets/23c2f327-390d-47c8-8df7-4239371a72fb" />

## Watch the Demo

[Video Link](https://www.youtube.com/watch?v=o8gRpRXaDpY)

### Contributing

Feel free to fork this repository, make improvements, and create pull requests. Contributions are always welcome!

1. Fork the repository.

2. Create a new branch (`bash git checkout -b feature-name `).

3. Commit your changes (`bash git commit -am 'Add new feature' `).

4. Push to the branch (`bash git push origin feature-name `).

5. Create a new Pull Request.

### License

This project is open source and available under the MIT License.
