plugins {
    id("ktor-server-plugin-conventions")
}

version = "1.1.0"

kotlin {
    sourceSets {
        commonMain {
            dependencies {
                implementation("org.jetbrains.kotlinx:atomicfu:0.21.0")
            }
        }
    }
}