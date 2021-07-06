package com.example.fizzbuzz

fun fizzbuzz(max: Int) {
    for (i in 1..max) {
        val printString = arrayListOf<String>()
        if (i % 3 == 0) {
            printString.add("Fizz")
        }
        if (i % 5 == 0) {
            printString.add("Buzz")
        }
        if (i % 7 == 0) {
            printString.add("Bang")
        }
        if (i % 11 == 0) {
            printString.clear()
            printString.add("Bong")
        }
        if (i % 13 == 0) {
            var insertionIndex = 0
            if (printString.isNotEmpty() && printString.first() == "Fizz") {
                insertionIndex = 1
            }
            printString.add(insertionIndex, "Fezz")
        }
        if (printString.isNotEmpty()) {
            for ( str in ( if (i % 17 == 0) { printString.reversed() } else { printString } ) ) {
                print(str)
            }
        } else {
            print(i)
        }
        print("\n")
    }
}

fun main() {
    fizzbuzz(17 * 3 * 5 * 11)
}