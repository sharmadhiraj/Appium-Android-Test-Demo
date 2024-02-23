# Appium Android Test Demo

This repository contains a simple Appium demo for performing UI testing on an Android app.

The demo includes tests to verify that a progress indicator is shown at the start of the application and that a currency
exchange recycler view is displayed once the progress indicator disappears.

### Setup

Before running the tests, make sure you have the following dependencies installed:

- Node.js: Install Node.js from [the official website](https://nodejs.org/).
- Appium: Install Appium globally using npm with the following command: `npm install --global appium`
- UIAutomator2 Driver: Install the UIAutomator2 driver for Appium using the following
  command: `appium driver install uiautomator2`
- IDE: This demo was developed using IntelliJ IDEA, but you can use any IDE of your choice.

### Running the Appium Server

Before running the tests, start the Appium server with the following
command: `appium server --address localhost --port 4723 --use-drivers uiautomator2 --base-path /wd/hub`

This command starts the Appium server with the UIAutomator2 driver enabled and listens on port 4723.

### Running the Tests

To run the tests, simply execute the test class AppiumDemoTest using your IDE's test runner or your preferred test
execution method.

### Demo

![Demo Gif](demo.gif)

### Feedback and Queries

Feedback and queries are welcome. Feel free to open an issue or reach out with any questions
or suggestions.