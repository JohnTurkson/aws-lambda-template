package com.johnturkson.example.function

import com.johnturkson.aws.runtime.annotations.Architecture
import com.johnturkson.aws.runtime.annotations.Function
import com.johnturkson.aws.runtime.annotations.Memory
import com.johnturkson.aws.runtime.annotations.Timeout
import com.johnturkson.aws.runtime.client.Request
import com.johnturkson.aws.runtime.events.HttpResponse

@Function
@Timeout(5)
@Memory(1024)
@Architecture("X86_64")
fun ExampleFunction(request: Request): String {
    return HttpResponse("Hello World")
}
