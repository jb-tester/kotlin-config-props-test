package com.example.demo

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.NestedConfigurationProperty
import java.time.Duration


@ConfigurationProperties(prefix = "boo")
class RequestCacheProperties {

    var flag = true

    @NestedConfigurationProperty
    val user = InnerClass() // val or var makes no difference

    @NestedConfigurationProperty
    val api = InnerClass()

    class InnerClass {

        var `duration-prop`: Duration = Duration.ofMinutes(1L)


        var longProp: Long = 11L
    }
}