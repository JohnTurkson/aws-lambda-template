plugins {
    id("org.gradle.application")
    id("com.johnturkson.kotlin")
}

group = "com.johnturkson.example"
version = "1.0.0-SNAPSHOT"

dependencies {
    implementation(project(":function"))
    implementation("software.amazon.awscdk:aws-cdk-lib:2.57.0")
}

application {
    mainClass.set("com.johnturkson.example.infrastructure.ExampleAppKt")
}
