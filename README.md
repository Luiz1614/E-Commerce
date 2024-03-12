

## Project Title
###E-Commerce System

## Description
This project is a simple e-commerce system developed in Java. It includes functionalities such as managing customers, products, and sales. The system uses JSON files to store and retrieve data.

## Technologies Used
- Java
- Maven
- Gson

## Setup and Installation
1. Clone the repository.
2. Open the project in IntelliJ IDEA 2023.3.4 or any other Java IDE.
3. Build the project using Maven.

## Usage
The main entry point of the application is the `Main.java` file located in the `src/main/java/org/eCommerce` directory. This file initializes the repositories and creates some sample data for customers, products, and sales. It then exports this data to a JSON file and reads it back.

## Code Structure
- `src/main/java/org/eCommerce/entities`: This directory contains the entity classes for the system, including `Cliente`, `Produto`, `ItemVenda`, and `Venda`.
- `src/main/java/org/eCommerce/repositories`: This directory contains the repository classes for managing the entities. Each repository provides methods for exporting data to a JSON file and deserializing data from a JSON file.
- `src/main/java/org/eCommerce/utils`: This directory contains utility classes such as `LocalDateTimeAdapter` for handling `LocalDateTime` serialization and deserialization with Gson.
- `JsonFiles`: This directory is where the JSON files are stored.

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.
