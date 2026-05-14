package com.example.demo

import org.springframework.boot.context.properties.ConfigurationProperties

// https://youtrack.jetbrains.com/issue/IDEA-389074/Configuration-property-key-not-collected-when-constructor-parameter-has-default-value-in-Kotlin
// uncomment the last parameter - the properties are resolved
@ConfigurationProperties("my.data")
data class DataClassProperties(val initializedProp: String = "default-value"
                               , val anotherInitializedProp: String = "default-another"
                              // , val notInitializedProp: String
)