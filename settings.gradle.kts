pluginManagement {
    repositories {
        maven {
            setUrl("https://maven.aliyun.com/repository/central")
        }
        maven {
            setUrl("https://maven.aliyun.com/repository/public")
        }
        maven {
            setUrl("https://maven.aliyun.com/repository/google")
        }
        maven {
            setUrl("https://maven.aliyun.com/repository/gradle-plugin")
        }
        maven {
            setUrl("https://maven.aliyun.com/repository/spring")
        }
        maven {
            setUrl("https://maven.aliyun.com/repository/spring-plugin")
        }
        maven {
            setUrl("https://maven.aliyun.com/repository/grails-core")
        }
        maven {
            setUrl("https://maven.aliyun.com/repository/apache-snapshots")
        }

        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven {
            setUrl("https://maven.aliyun.com/repository/central")
        }
        maven {
            setUrl("https://maven.aliyun.com/repository/public")
        }
        maven {
            setUrl("https://maven.aliyun.com/repository/google")
        }
        maven {
            setUrl("https://maven.aliyun.com/repository/gradle-plugin")
        }
        maven {
            setUrl("https://maven.aliyun.com/repository/spring")
        }
        maven {
            setUrl("https://maven.aliyun.com/repository/spring-plugin")
        }
        maven {
            setUrl("https://maven.aliyun.com/repository/grails-core")
        }
        maven {
            setUrl("https://maven.aliyun.com/repository/apache-snapshots")
        }

        google()
        mavenCentral()
    }
}

rootProject.name = "WebViewTestEditor"
include(":app")
 