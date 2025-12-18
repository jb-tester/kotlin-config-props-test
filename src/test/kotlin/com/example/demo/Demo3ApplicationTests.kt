package com.example.demo

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import kotlin.test.assertEquals

@SpringBootTest
class Demo3ApplicationTests(
    @Autowired private val propertiesWithNestedAndExternalPojos: PropertiesWithNestedAndExternalPojos,
    @Autowired private val constructorBindingProperties: ConstructorBindingProperties
) {


    @Test
    fun testNestedPojoVals() {
        println(propertiesWithNestedAndExternalPojos.innerClassVal.strProp)
        assertEquals("property of inner pojo defined as val property", propertiesWithNestedAndExternalPojos.innerClassVal.strProp)
    }
    @Test
    fun testNestedPojoVars() {
        println(propertiesWithNestedAndExternalPojos.innerClassVar.strProp)
        assertEquals("property of inner pojo defined as var property", propertiesWithNestedAndExternalPojos.innerClassVar.strProp)
    }
    @Test
    fun testExternalClassVals() {
        println(propertiesWithNestedAndExternalPojos.externalClassVal.prop1)
        println(propertiesWithNestedAndExternalPojos.externalDataClass.prop1)
        assertEquals("property of external class defined as val property", propertiesWithNestedAndExternalPojos.externalClassVal.prop1)
    }
    @Test
    fun testExternalClassVars() {
        println(propertiesWithNestedAndExternalPojos.externalClassVar.prop1)
        assertEquals("property of external class defined as var property", propertiesWithNestedAndExternalPojos.externalClassVar.prop1)
    }
    @Test
    fun testExternalDataClass() {
        println(propertiesWithNestedAndExternalPojos.externalDataClass.prop1)
        assertEquals("property of external data class defined as var property", propertiesWithNestedAndExternalPojos.externalDataClass.prop1)
    }
    @Test
    fun testNestedPojoWithConstructorBindingProperties() {
        assertEquals("property of inner data class defined as constructor parameter", constructorBindingProperties.inner.fooData)
    }
    @Test
    fun testExternalPojoWithConstructorBindingProperties() {
        assertEquals("property of external class defined as constructor parameter", constructorBindingProperties.data.barData)
    }
}
