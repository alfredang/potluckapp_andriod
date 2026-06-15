# kotlinx.serialization
-keepattributes *Annotation*, InnerClasses
-dontnote kotlinx.serialization.**
-keepclassmembers class io.potluckhub.app.** {
    *** Companion;
}
-keepclasseswithmembers class io.potluckhub.app.** {
    kotlinx.serialization.KSerializer serializer(...);
}
-keep,includedescriptorclasses class io.potluckhub.app.**$$serializer { *; }

# OkHttp
-dontwarn okhttp3.**
-dontwarn okio.**
