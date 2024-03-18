plugins {
  id("java")
  id("maven-publish")
}

group = "io.github.jonelo"
version = "0.12.0"

java {
  sourceCompatibility = JavaVersion.VERSION_1_8
  targetCompatibility = JavaVersion.VERSION_1_8
}

repositories {
  mavenCentral()
}

publishing {
  publications {
    withType<MavenPublication> {
      pom {
        url.set("https://github.com/jonelo/jAdapterForNativeTTS")
        name.set("jAdapterForNativeTTS")
        scm {
          url.set("https://github.com/jonelo/jAdapterForNativeTTS")
        }
      }
    }
  }
}
