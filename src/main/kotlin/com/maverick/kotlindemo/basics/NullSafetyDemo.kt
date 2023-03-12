package com.maverick.kotlindemo.basics

import lombok.extern.slf4j.Slf4j

@Slf4j
class NullSafetyDemo {
    var nonNullVar = null
    var nullSafeString: String? = null
    var nullSafeFloat: Float? = null
}


fun main() {
    val newInstance = NullSafetyDemo()
    newInstance.nullSafeString = "after null"

    /**
     *      !!
     */
//    newInstance.nullSafeString = null
    val varAfterAbsoluteAssertionAndElvisOperator = newInstance.nullSafeString!!.length

    /**
     *      ?. and ?: (Elvis Operator)
     */
//    newInstance.nullSafeString = null
    val varAfterPartialAssertionAndElvisOperator = newInstance.nullSafeString?.length ?: 4
//    print("?. --> $varAfterPartialAssertionAndElvisOperator")

    /**
     *      Null safe casting with 'as?'
     */
    print(newInstance.nullSafeFloat)
    println("Before init: ${newInstance.nullSafeFloat}")
    newInstance.nullSafeFloat = 1.23f
    println("After init: ${newInstance.nullSafeFloat}")
    val castingWithNullSafety = newInstance.nullSafeFloat as? Double
    println("After casting into Double: $castingWithNullSafety")

    var doubleVar: Double? = 23.23
    doubleVar = null
    val doubleIntoFloat = doubleVar?.toFloat() ?: "hello from the other side \n"
    print(doubleIntoFloat)

    /**
     *      nullSafeVar.apply {// some action}
     */
//    newInstance.nullSafeString = null
    newInstance.nullSafeString.apply { print("hello from the apply side") }
}