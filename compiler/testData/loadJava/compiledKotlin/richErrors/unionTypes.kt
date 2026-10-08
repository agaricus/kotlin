// LANGUAGE: +RichErrors
// TARGET_BACKEND: JVM
package test

error class Foo
error object Bar

@Target(AnnotationTarget.TYPE)
annotation class Ann

fun foo(): @Ann (@Ann String | Foo | Bar) = ""
