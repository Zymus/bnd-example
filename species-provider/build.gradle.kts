import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
	val bndVersion = "4.1.0"
	val kotlinVersion = "1.3.10"

	repositories {
		mavenCentral()
	}

	dependencies {
		classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")

		classpath("biz.aQute.bnd:biz.aQute.bnd.gradle:$bndVersion")
	}
}

plugins {
	idea
	java
	id("biz.aQute.bnd.builder") version "4.1.0"
	kotlin("jvm") version "1.3.10"
}

repositories {
	mavenCentral()
}

dependencies {
	implementation(project(":species-config"))
	implementation(kotlin("stdlib-jdk8"))
	implementation("org.osgi:osgi.annotation:6.0.1")
	implementation("org.osgi:osgi.cmpn:6.0.0")
}

val compileKotlin: KotlinCompile by tasks

compileKotlin.kotlinOptions {
	jvmTarget = "1.8"

}

// TODO:
