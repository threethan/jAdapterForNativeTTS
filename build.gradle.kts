plugins {
  id("java")
  id("maven-publish")
}

group = "io.github.jonelo"
version = "0.9.9"

repositories {
  mavenCentral()
}

publishing {
  publications {
    withType<MavenPublication> {
      pom {
        url.set("https://github.com/jonelo/jAdapterForNativeTTS")
        name.set("jAdapterForNativeTTS")
        description.set("A purely functional algebraic graph library")
        scm {
          url.set("https://github.com/jonelo/jAdapterForNativeTTS")
        }
      }
    }
  }
}
