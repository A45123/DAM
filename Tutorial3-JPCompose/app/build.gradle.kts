plugins {
    kotlin("jvm")
    kotlin("kapt")
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test"))

    implementation(project(":annotations"))
    kapt(project(":processor"))
}

application {
    mainClass.set("com.example.app.MainKt")
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(23)
}
