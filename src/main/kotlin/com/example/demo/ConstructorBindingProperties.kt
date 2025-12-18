package com.example.demo

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.NestedConfigurationProperty
import org.springframework.boot.context.properties.bind.ConstructorBinding

@ConfigurationProperties(prefix = "bar")
data class ConstructorBindingProperties @ConstructorBinding constructor(
    @NestedConfigurationProperty
    val data: SomeDataClass,
    val inner: InnerDataClass
)
{
    data class InnerDataClass(val fooData: String)
}

data class SomeDataClass(
    val barData: String
)