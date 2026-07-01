rootProject.name = "Playzonemobile"
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

pluginManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google {
            mavenContent {
                includeGroupAndSubgroups("androidx")
                includeGroupAndSubgroups("com.android")
                includeGroupAndSubgroups("com.google")
            }
        }
        mavenCentral()
    }
}

include(":androidApp")
include(":shared")

include(":common:auth:api")
include(":common:auth:presentation")
include(":common:auth:data")

include(":common:tournaments:api")
include(":common:tournaments:presentation")
include("common:tournaments:data")

include(":common:games:api")
include(":common:games:presentation")
include(":common:games:data")

include(":common:core")

