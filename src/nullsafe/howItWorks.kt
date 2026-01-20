package nullsafe

fun howItWorks() {
    // Success cases:
    println("123".toIntOrNull())      // 123
    println("-456".toIntOrNull())     // -456
    println("+789".toIntOrNull())     // 789
    println("0".toIntOrNull())        // 0

    // Failure cases (returns null):
    println("abc".toIntOrNull())      // null
    println("123.45".toIntOrNull())   // null (decimal point)
    println("12a3".toIntOrNull())     // null (mixed letters)
    println("".toIntOrNull())         // null (empty string)
    println("   ".toIntOrNull())      // null (whitespace)
    println("123 ".toIntOrNull())     // null (trailing space)
    println(" 123".toIntOrNull())     // null (leading space)
}