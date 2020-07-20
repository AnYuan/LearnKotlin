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

    // Map
    // Creating maps
    var yearOfBirth = mapOf("Anna" to 1990, "Brian" to 1991, "Craig" to 1992, "Donna" to 1993)
    var namesAndScores = mutableMapOf("Anna" to 2, "Brian" to 2, "Craig" to 8, "Donna" to 6)
    namesAndScores = mutableMapOf()
    println(namesAndScores)
    var pairs = HashMap<String, Int>()
    // define its capacity
    pairs = HashMap<String, Int>(20)


    // Accessing values

    // using the index operator
    println(namesAndScores["Anna"])
    namesAndScores["Greg"] // null

    // using properties and methods
    println(namesAndScores.get("Craig"))
    namesAndScores.isEmpty()
    namesAndScores.size

    // Modifying mutable maps
    val bobData = mutableMapOf("name" to "Bob", "profession" to "CardPlayer", "country" to "USA")
    bobData.put("state", "CA")
    bobData["city"] = "San Francisco"

    // Updating values
    bobData.put("name", "Bobby")
    bobData["profession"] = "Mailman"
    val pair = "nickname" to "Bobby D"
    bobData += pair
    println(bobData)

    // Removing pairs
    bobData.remove("city")
    bobData.remove("state", "CA")

    // Iterating through maps
    for ((player, score) in namesAndScores) {
        println("$player - $score")
    }

    // Running time for map operations
    // Accessing elements: O(1)
    // Inserting elements: O(1)
    // Deleting elements: O(1)
    // searching for an elemnt: O(1)

    // For perermance-critical code, HashMap<K, V> should be used
    // via hashMapOf(), instead of mapOf()

    // Set
    // Creating sets
    val names = setOf("Anna", "Brian", "Craig", "Anna")
    println(names)
    val hashSet = HashSet<Int>()
    // set from arrays
    val someArray = arrayOf(1,2,3,1)
    var someSet = mutableSetOf(*someArray)

    // Accessing elements
    println(someSet.contains(1))
    println(4 in someSet)

    // Adding and removing elements
    someSet.add(5)
    val removedOne = someSet.remove(1)
}