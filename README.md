This project demonstrates the automation of a login/signup feature for a website using Selenium and TestNG. It focuses on modularity and scalability, employing design patterns and frameworks to ensure efficient and maintainable code.

#Key Features

1-Page Factory Implementation:
The PageFactory class centralizes the creation and management of page objects, enhancing code reusability and reducing initialization complexity.
Implementation Details:
Each page class (e.g., homePage, loginPage) is instantiated through the PageFactory class.
This approach ensures a single point of modification for page object initialization, improving maintainability.

2-Data-Driven framework
Data-driven testing is implemented in the loginTests class using TestNG's @DataProvider annotation.
Key Benefits:
Test data is dynamically read from a CSV file, allowing flexible and extensive test coverage.
The CSVReaderUtil simplifies reading and parsing data from external sources, improving test scalability.
