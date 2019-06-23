package dev.william.sikoex.stdlib

/**
 * Execute some action if the collection is not empty
 */
fun <C : Collection<*>> C.ifNotEmpty(consumer: (C) -> Unit) {
    if (this.isNotEmpty()) {
        consumer(this)
    }
}
