// RUN_PIPELINE_TILL: FRONTEND
// FIR_DUMP
error class Foo

@Target(AnnotationTarget.TYPE)
annotation class Ann

fun foo(): @Ann (String | Foo) = ""
fun foo2(): @Ann String | Foo = ""
fun foo3(): @Ann (@Ann String | Foo) = ""

/* GENERATED_FIR_TAGS: annotationDeclaration, classDeclaration, functionDeclaration, stringLiteral */
