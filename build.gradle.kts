plugins {
    kotlin("jvm") version "1.9.23"
    id("org.jlleitschuh.gradle.ktlint") version "11.1.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("io.kotest:kotest-runner-junit5:5.6.2")
    testImplementation("io.kotest:kotest-assertions-core:5.6.2")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(21)
}

// ktlint 설정 추가
ktlint {
    version.set("0.48.2")  // 원하는 ktlint 버전으로 설정
    android.set(false)    // 안드로이드 관련 설정 비활성화 (필요시 활성화)
    outputToConsole.set(true)  // 콘솔 출력 설정
    outputColorName.set("RED") // 색상 출력
}
