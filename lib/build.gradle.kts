plugins {
    kotlin("multiplatform") version "2.0.0-Beta5"
}

kotlin {
    explicitApi()

    macosArm64()
    jvm()
}