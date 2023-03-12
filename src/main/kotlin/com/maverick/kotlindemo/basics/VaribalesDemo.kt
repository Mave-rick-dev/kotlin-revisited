package com.maverick.kotlindemo.basics

class VaribalesDemo {
    var inferredDecimalLiteral = 19.3
    var someOtherVar: Float = inferredDecimalLiteral.toFloat()
    var someOtherVar2: Int = someOtherVar as Int
}

fun main() {
    print("Double var: ${VaribalesDemo().inferredDecimalLiteral} \n")
    print("Float var: ${VaribalesDemo().someOtherVar}")
    print("Int var: ${VaribalesDemo().someOtherVar2}")

}