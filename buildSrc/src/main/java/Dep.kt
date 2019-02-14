object Dep {
    object Version {
        val gradle = "3.2.1"
        val kotlin = "1.2.71"
        val supportSdk = "28.0.0"
        val constraint = "1.1.3"
        val runner = "1.0.2"
        val espresso = "3.0.2"
    }

    // class path
    val buildTools = "com.android.tools.build:gradle:${Version.gradle}"
    val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlin}"

    // library
    val kotlinLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Version.kotlin}"
    val appCompat = "com.android.support:appcompat-v7:${Version.supportSdk}"
    val constraintLayout = "com.android.support.constraint:constraint-layout:${Version.constraint}"
    val junit = "junit:junit:4.12"
    val testRunner = "com.android.support.test:runner:${Version.runner}"
    val espressoCore = "com.android.support.test.espresso:espresso-core:${Version.espresso}"
}