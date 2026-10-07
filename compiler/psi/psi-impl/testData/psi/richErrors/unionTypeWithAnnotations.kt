// COMPILATION_ERRORS
error class Foo

@Target(AnnotationTarget.TYPE)
annotation class Ann

fun foo(): @Ann String | Foo = ""
