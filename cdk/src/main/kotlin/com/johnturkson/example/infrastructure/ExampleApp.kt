package com.johnturkson.example.infrastructure

import com.johnturkson.example.generated.infrastructure.ExampleFunction
import software.amazon.awscdk.App
import software.amazon.awscdk.Stack

fun main() {
    val app = App()
    val stack = Stack(app, "ExampleStack")
    ExampleFunction.build(stack)
    app.synth()
}
