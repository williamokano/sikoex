package dev.william.sikoes.stdlib

import dev.william.sikoex.stdlib.isNotNull
import dev.william.sikoex.stdlib.isNull
import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

class NullableTest : StringSpec({
    "should have isNull on nullable types" {
        val any: Any? = null
        any.isNull()
    }

    "given a null nullable type, isNull should return true" {
        val any: Any? = null
        any.isNull() shouldBe true
    }

    "given a not null nullable type, isNotNull should return false" {
        val any: String? = "Am I null?"
        any.isNull() shouldBe false
    }

    "should have isNotNull on nullable types" {
        val any: Any? = null
        any.isNotNull()
    }

    "given a null nullable type, isNotNull should return false" {
        val any: Any? = null
        any.isNotNull() shouldBe false
    }

    "given a not null nullable type, isNotNull should return true" {
        val any: String? = "Am I null?"
        any.isNotNull() shouldBe true
    }
})
