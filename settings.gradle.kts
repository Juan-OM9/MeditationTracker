pluginManagement {
    repositories {
        google() // ✅ sin filtro
        mavenCentral()
        gradlePluginPortal()
    }
}


dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") } // Para MPAndroidChart
    }
}

rootProject.name = "Meditacion_y_Autocuidado"
include(":app")
