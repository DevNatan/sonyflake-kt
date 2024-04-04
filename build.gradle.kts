plugins {
    kotlin("multiplatform") version "2.0.0-Beta5"
}

repositories {
    mavenCentral()
}

kotlin {
    explicitApi()
    macosArm64()
    mingwX64()

    sourceSets {
        val commonMain by getting {}
        val macosArm64Main by getting { dependsOn(commonMain) }
        val mingwX64Main by getting { dependsOn(commonMain) }
    }
}