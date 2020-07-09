/*
 * Copyright (c) 2019 Razeware LLC
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * Notwithstanding the foregoing, you may not use, copy, modify, merge, publish, 
 * distribute, sublicense, create a derivative work, and/or sell copies of the 
 * Software in any work that is designed, intended, or marketed for pedagogical or 
 * instructional purposes related to programming, coding, application development, 
 * or information technology.  Permission for such use, copying, modification,
 * merger, publication, distribution, sublicensing, creation of derivative works, 
 * or sale is expressly withheld.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

fun main() {
    // Type conversion
    var integer: Int = 100
    var decimal: Double = 12.5
    integer = decimal.toInt()

    // Operators with mixed types
    val hourlyRate: Double = 19.5
    val hoursWorked: Int = 10
    val totalCost: Double = hourlyRate * hoursWorked.toDouble()

    // Type inference
    val typeInferredInt = 42
    val actuallyDouble: Double = 3.0 // can not use 3

    // Strings
    val characterA: Char = 'a'
    val stringDog: String = "Dog"
    val stringDog1 = "Dog"

    // concatenation
    var message = "Hello" + " my name is "
    val name = "Joe"
    message += name
    println(message)

    // String templates
    message = "Hello my name is $name!"
    println(message)

    val oneThird = 1.0 / 3.0
    val oneThirdLongString = "One third is $oneThird as a decimal."
    val oenThridLongString1 = "One third is ${1.0 / 3.0} as a decimal."

    // Multi-line strings
    val bigString = """
        |You can have a string
        |that contains multiple
        |lines
        |by
        |doing this.
    """.trimMargin()
    println(bigString)

    // Pairs and Triples
    val coordinates: Pair<Int, Int> = Pair(2,3)
    val coordinatesInferred = Pair(2,3)
    val coordinatesInferred1 = 2 to 3
    val coordinatesDoubles = Pair(2.1, 3.5)

    val x1 = coordinates.first
    val y1 = coordinates.second

    val (x, y) = coordinates

    val coordinates3D = Triple(2,3,1)
    val (x3, y3, _) = coordinates3D

    // Number types
    val a: Short = 12
    val b: Byte = 120
    val c: Int = -10000
    val answer = a + b + c // Answer will be an Int

    // Any, Unit, and Nothing Types
    val anyNumber: Any = 42
    val anyString: Any = "42"
}

// Unit
fun add(): Unit {
    val result = 2 + 2
    println(result)
}

// Nothing
fun doNothingForever(): Nothing {
    while (true) {

    }
}

