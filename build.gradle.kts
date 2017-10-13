plugins {
    base
    kotlin("android") version "1.1.51" apply false
    id("com.android.application") version "3.0.0-beta7" apply false
}

allprojects {
    repositories {
        google()
        jcenter()
    }
}
