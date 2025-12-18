package com.example.demo

import org.springframework.boot.context.properties.ConfigurationProperties


@ConfigurationProperties(prefix="foo")
class MyProperties {
    /*
    * simple property description.
    * */
    var simpleProp1: String? = "default"

}