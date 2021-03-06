grails.project.work.dir = 'target'
grails.project.docs.output.dir = "docs"

grails.project.dependency.resolver = "maven"
grails.project.dependency.resolution = {

    inherits "global"
    log "warn"

    repositories {
        grailsPlugins()
        grailsHome()
        grailsCentral()

        mavenLocal()
        mavenCentral()
    }

    plugins {
        compile ":rest-client-builder:1.0.3"
    }

    dependencies {
        compile("org.apache.maven:maven-ant-tasks:2.1.3") {
            excludes "commons-logging", "xml-apis", "groovy"
        }
        test("org.gmock:gmock:0.8.0") {
            export = false
        }
    }
}
