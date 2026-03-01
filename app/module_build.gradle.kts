
plugins {
 id("com.android.application")
 id("org.jetbrains.kotlin.android")
}
android {
 compileSdk=34
 defaultConfig{
  applicationId="vexefy.live.nofication.android.com"
  minSdk=23
  targetSdk=34
  versionCode=1
  versionName="1.0"
 }
}
dependencies{
 implementation("androidx.appcompat:appcompat:1.6.1")
 implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.21")
}
