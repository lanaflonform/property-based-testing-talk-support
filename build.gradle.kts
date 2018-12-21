plugins {
    id("io.franzbecker.gradle-lombok") version ("1.14")
    java
}

lombok {
    version = "1.18.4"
    sha256 = ""
}

group = "com.sir4ur0n"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // Functional control and immutable data types for Java
    compile("io.vavr", "vavr", "0.9.2")
    // JUnit 5
    val junitJupiterVersion = "5.3.2"
    testCompile("org.junit.jupiter", "junit-jupiter-api", junitJupiterVersion)
    testCompile("org.junit.jupiter", "junit-jupiter-engine", junitJupiterVersion)
    testCompile("org.junit.jupiter", "junit-jupiter-params", junitJupiterVersion)
    val junitPlatformVersion = "1.3.2"
    testCompile("org.junit.platform", "junit-platform-launcher", junitPlatformVersion)
    // Fluent test assertion framework
    testCompile("org.assertj", "assertj-core", "3.11.1")
    // Property Based Test framework
    val junitQuickcheck = "0.8.1"
    testCompile("com.pholser", "junit-quickcheck-core", junitQuickcheck)
    testCompile("com.pholser", "junit-quickcheck-generators", junitQuickcheck)
    // Avoid maintaining the explicit resource file with all Quickcheck generators
    testCompile("com.google.auto.service", "auto-service", "1.0-rc4")
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_11
}
