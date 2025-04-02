# Selenium E-commerce Test Suite

## Overview

This project is an **automated test suite** for an e-commerce website, developed using **Selenium WebDriver**, **TestNG**, and **Maven**. It automates key functionalities such as user authentication, adding items to the cart, checkout, and payment processing to ensure website reliability and efficiency.

## Features

- **Automated Testing**: Validates essential user interactions.
- **Cross-Browser Testing**: Can be extended to support multiple browsers.
- **Structured Execution**: Uses TestNG for test management.
- **Maven Integration**: Handles dependencies and execution.

## Prerequisites

Before running the tests, ensure you have:

- **Java** (JDK 8 or later) installed and configured.
- **Maven** installed and added to the system path.
- **Google Chrome** and the correct version of ChromeDriver.
- **TestNG** dependencies in `pom.xml`.

## Installation

1. **Clone the Repository**:
   ```sh
   git clone https://github.com/yourusername/ecommerce-test-suite.git
   cd ecommerce-test-suite
   ```
2. **Install Dependencies**:
   ```sh
   mvn clean install
   ```
3. **Update ChromeDriver Path**:
   - Modify `System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");` in `EcommerceTestSuite.java`.

## Running the Tests

To execute all tests, run:

```sh
mvn test
```

## Test Cases

The suite includes the following test scenarios:

1. **Valid Login Test** - Verifies user authentication.
2. **Checkout Process Test** - Ensures users can add items and proceed to checkout.
3. **Payment Processing Test** - Checks the payment confirmation flow.

## Troubleshooting

- **Private Connection Error**:
  - Run Chrome in **headless mode** or set `acceptInsecureCerts` to `true`.
- **Element Not Found**:
  - Ensure the website structure hasn't changed.
  - Use explicit waits: `WebDriverWait`.

## Future Enhancements

- **Add support for Firefox & Edge**.
- **Integrate with CI/CD pipelines**.
- **Generate detailed test reports using Allure.**

## License

This project is licensed under the MIT License.

---

### Author

[Your Name]\
GitHub: [yourusername](https://github.com/yourusername)

