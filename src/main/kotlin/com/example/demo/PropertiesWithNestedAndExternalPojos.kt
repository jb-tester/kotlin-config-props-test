package com.example.demo

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.NestedConfigurationProperty
import java.time.Duration


@ConfigurationProperties(prefix = "boo")
class PropertiesWithNestedAndExternalPojos {

    var flag = true

    // @NestedConfigurationProperty
    val innerClassVal = InnerClass()

   // @NestedConfigurationProperty
    var innerClassVar = InnerClass()

    @NestedConfigurationProperty
    val externalClassVal = ExternalClass()

    @NestedConfigurationProperty
    var externalClassVar = ExternalClass()

    @NestedConfigurationProperty
    lateinit var externalDataClass: ExternalDataClass

    class InnerClass {
        var strProp: String = "default"
        var durationProp: Duration = Duration.ofMinutes(1L)
        var longProp: Long = 11L
    }
}