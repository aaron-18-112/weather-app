plugins {
    id("java")
    application
}

group = "Application"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

application {
    // Specify the main class without the file extension
    mainClass.set("Application.WeatherApp") // Adjusted to the correct package and class name
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "Application.WeatherApp" // Specify the main class in the manifest
    }
    from({
        configurations.runtimeClasspath.get().filter { it.exists() }.map { if (it.isDirectory) it else zipTree(it) }
    })
}