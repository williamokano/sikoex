package dev.william.sikoex.stdlib

fun <T> T?.isNull() = this == null
fun <T> T?.isNotNull() = this.isNull().not()
