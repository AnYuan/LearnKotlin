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
    printMultipleOfFive(10)

    printMultipleOf1(4)
}

fun printMultipleOfFive(value: Int) {
    println("$value * 5 = ${value * 5}")
}

// muti-param
fun printMultipleOf(multiplier: Int, andValue: Int) {
    println("$multiplier * 5 = ${multiplier * andValue}")
}

// default value
fun printMultipleOf1(multiplier: Int, value: Int = 1) {
    println("$value * 5 = ${value * multiplier}")
}

// return value
fun multiply(number: Int, multiplier: Int): Int {
    return number * multiplier
}

fun multiplyAndDivide(number: Int, factor: Int): Pair<Int, Int> {
    return Pair(number * factor, number / factor)
}

fun multiplyInferred(number: Int, multiplier: Int) = number * multiplier

// Parameters as Values
fun incrementAndPrint(value: Int): Int {
    val newValue = value + 1
    println(newValue)
    return newValue
}

// overloading
// 1. A different number of parameters
// 2. Different parameter types
fun getValue(value: Int): Int {
    return value + 1
}

fun getValue(value: String): String {
    return "The value is $value"
}

// Functions as variables
fun add(a: Int, b: Int): Int {
    return a + b
}

// method reference operator, ::
var function = ::add
//function(2,3)

fun printResult(function: (Int, Int) -> Int, a: Int, b: Int) {
    val result = function(a, b)
    print(result)
}

// printResult(::add, 4, 2)