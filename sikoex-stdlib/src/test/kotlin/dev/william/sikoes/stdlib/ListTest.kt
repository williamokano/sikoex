package dev.william.sikoes.stdlib

import dev.william.sikoex.stdlib.ifNotEmpty
import io.kotlintest.specs.StringSpec
import io.mockk.spyk
import io.mockk.verify

class ListTest : StringSpec({
    "should execute consumer if list if not empty" {
        val consumer: (Collection<*>) -> Unit = spyk { }
        val list = listOf(1, 2, 3, 4)
        list.ifNotEmpty(consumer)
        verify(exactly = 1) { consumer(list) }
    }

    "should not execute consumer if list if not empty" {
        val consumer: (Collection<*>) -> Unit = spyk { }
        val list = emptyList<Int>()
        list.ifNotEmpty(consumer)
        verify(exactly = 0) { consumer(list) }
    }
})
