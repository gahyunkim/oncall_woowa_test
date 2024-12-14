plugins {
    kotlin("jvm") version "1.9.24"
}

repositories {
    mavenCentral()
    maven { setUrl("https://jitpack.io") }
}

dependencies {
    implementation("com.github.woowacourse-projects:mission-utils:1.1.0")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(19))
    }

    sourceCompatibility = JavaVersion.VERSION_19
    targetCompatibility = JavaVersion.VERSION_19
}

tasks {
    test {
        useJUnitPlatform()
    }
}
