package com.maverick.kotlindemo.running_through_command_line


class Greeter(
    var message: String = "null"
)
fun main() {
    print(Greeter("Hello from the other side!!"))
}