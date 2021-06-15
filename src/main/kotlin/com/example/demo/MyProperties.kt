package com.example.demo

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration
import org.springframework.stereotype.Component


@Component
@ConfigurationProperties(prefix="foo")
class MyProperties {
    var accountSid: String? = null
    var authToken: String? = null
    var serviceId: String? = null
}