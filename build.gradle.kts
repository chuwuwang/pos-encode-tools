import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm")
    id("org.jetbrains.compose")
}

group = "com.sea.pos"
version = "1.0"

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

dependencies {
    val list = "include" to listOf("*.jar")
    val map = mapOf("dir" to "libs", list)
    val fileTree = fileTree(map)
    implementation(fileTree)
    implementation(compose.desktop.currentOs)
    implementation("com.google.code.gson:gson:2.10.1")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}

compose.desktop {
    application {
        mainClass = "MainKt"
        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb, TargetFormat.Exe)
            packageName = "com.sea.pos.tools"
            packageVersion = "1.0.0"
        }
    }
}