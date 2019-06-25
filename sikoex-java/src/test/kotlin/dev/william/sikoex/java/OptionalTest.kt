package dev.william.sikoex.java

import io.kotlintest.specs.StringSpec
import java.util.*

class OptionalTest : StringSpec({
    "should create optional from any object" {
        val shouldBeOption = "something".asOptional()
        assert(shouldBeOption is Optional)
        assert(shouldBeOption.isPresent)
        assert(shouldBeOption.get() == "something")
    }
})
