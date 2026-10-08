// DUMP_IR
error class Foo

fun produceUnion() : String | Foo = "ok"
fun produceUnion2() : String | Foo = Foo()

fun box(): String {
    if (produceUnion()|.length != 2) return "FAIL 1"
    if (produceUnion2()|.length !is Foo) return "FAIL 2"
    return "OK"
}
