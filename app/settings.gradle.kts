import java.util.Properties
import java.io.File

pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

val localProperties = Properties().apply {
    val localFile = File(rootDir, "local.properties")
    if (localFile.exists()) {
        localFile.inputStream().use { load(it) }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            url = uri("https://maven.pkg.github.com/levibostian/Multi-Module-Android-dev-environment-lib")
            credentials {
                username = localProperties["githubpackages.user"] as String? ?: ""
                password = localProperties["githubpackages.key"] as String? ?: ""
            }
        }
    }
}

rootProject.name = "Android app"
include(":app")
