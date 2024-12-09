# Console Based Weather App

## Description
A console based weather app that displays the current weather for a given location.

## Features
- Display the current weather for a given location.
- Displays a world forecast, that shows the current weather around the world.
  
## Technologies
- Java
- Kotlin
- Gradle

## Setup
To run this project, you need to have Java installed on your machine. If you don't have Java installed, you can download it from [here](https://www.java.com/en/download/).

The project has a gradle wrapper, so you don't need to have gradle installed on your machine.

You are instructed below how to build the jar file and run the project. This is the fastest way to run the project.

### Windows
1. Open the folder containing the project in Windows Explorer.
2. Click on the address bar, type `cmd`, and press Enter. This will open a Command Prompt window in the current directory.

### Mac
1. Open Finder and navigate to the folder containing the project.
2. Right-click on the folder and select "New Terminal at Folder" (if using iTerm, right-click and select "Open iTerm Here").

### Build and Run
1. Clone the repository:
    ```bash
    git clone https://github.com/aaron-18-112/weather-app.git your-repo-name
    ```

2. Navigate to the project directory:
    ```bash
    cd your-repo-name
    ```

3. Build the project:
    ```bash
    # For Windows
    gradlew build

    # For Unix-like systems (Linux, macOS)
    ./gradlew build
    ```
    
4. Run the project:
    ```bash
    java -jar build/libs/WeatherApp-1.0-SNAPSHOT.jar
    ```

The main class can be found in `src/main/java/Application/WeatherApp.java`.
    
## Usage
After running the project, follow the on-screen instructions to get the weather information for your desired location.

## Unit Tests
The unit tests can be found in `src/test/java`.
