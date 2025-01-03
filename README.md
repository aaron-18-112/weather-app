# Console Based Weather App

## Description

A console-based weather application built with Java that provides current weather information for any location. Features
include displaying local weather and a world forecast. This project uses Gradle for build automation.

## Features

- Display the current weather for a given location.
- Displays a world forecast, that shows the current weather around the world.

## Technologies

- **Java** - [Main Application](src/main/java/Application)
- **Kotlin** - [Build Script](build.gradle.kts) & [Settings Script](settings.gradle.kts) for Gradle
- **Gradle** - Build Tool

## Setup

To run this project, you need to have Java installed on your machine. If you don't have Java installed, you can download
JDK 23 from [here](https://www.oracle.com/uk/java/technologies/downloads/#java23).

The project has a gradle wrapper, so you don't need to have gradle installed on your machine.

You are instructed below how to build the jar file and run the project. This is the fastest way to run the project.

### IDE
1. Open the project in an IDE (VSCode, Intellij IDEA)
2. Open a terminal
### Windows - Command Prompt
1. Open the folder containing the project in Windows Explorer.
2. Click on the address bar, type `cmd`, and press Enter. This will open a Command Prompt window in the current directory.
### Mac - Terminal
1. Open Finder and navigate to the folder containing the project.
2. Right-click on the folder and select "New Terminal at Folder" (if using iTerm, right-click and select "Open iTerm Here").
### Linux - Terminal
1. Open your terminal.
2. Navigate to the folder containing the project using the `cd` command.

## Build and Run

1. **Clone** the repository:
    ```bash
    git clone https://github.com/aaron-18-112/weather-app.git your-repo-name
    ```
2. **Navigate** to the project directory:
    ```bash
    cd your-repo-name
    ```
3. Build the project:
    ```bash
    # For Windows - Command Prompt
    gradlew build jar
    
    # For Unix-like systems (Linux, macOS) OR a terminal in the IDE
    ./gradlew build jar
    ```
4. **Run** the project:
    ```bash
    java -jar build/libs/WeatherApp-1.0-SNAPSHOT.jar
    ```

The main class can be found in [`src/main/java/Application/WeatherApp.java`](src/main/java/Application/WeatherApp.java).

## Unit Tests

**Run** the unit tests:
   ```bash
    # For Windows - Command Prompt
    gradlew test
    
    # For Unix-like systems (Linux, macOS) OR a terminal in the IDE
    ./gradlew test
   ```
The unit tests can be found in [`src/test/java`](src/test/java).

## Usage

After running the project, follow the on-screen instructions to get the weather information for your desired location.
