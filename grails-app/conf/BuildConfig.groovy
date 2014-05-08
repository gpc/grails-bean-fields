
grails.project.work.dir = "target"
grails.project.fork = false

grails.project.dependency.resolver = "maven"
grails.project.dependency.resolution = {

    inherits("global")

    repositories {
        grailsCentral()
        mavenLocal()
        mavenCentral()
    }
    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.

        // runtime 'mysql:mysql-connector-java:5.1.5'
    }

    plugins {
        build ":tomcat:7.0.52.1", ":hibernate:3.6.10.14", ':release:3.0.1', ':rest-client-builder:1.0.3', {
            export = false
        }
    }
}
