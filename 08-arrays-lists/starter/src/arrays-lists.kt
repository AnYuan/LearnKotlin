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

fun main(args: Array<String>) {
    // Arrays
    val evenNumber = arrayOf(2,4,6,8)
    val fiveFives = Array(5, { 5 }) // 5,5,5,5,5
    val vowels = arrayOf("a", "e", "i", "o", "u")

    // arrays of primitive types
    val oddNumbers = intArrayOf(1,3,5,7)
    val zeros = DoubleArray(4) // 0.0, 0.0, 0.0, 0.0
    val otherOddNumbers = arrayOf(1,3,5,7).toIntArray()


    for (arg in evenNumber) {
        println(arg)
    }

    evenNumber.forEach { arg -> println(arg) }


    // Lists
    val innerPlanets = listOf("Mercury", "Venus", "Earth", "Mars")
    val innerPlanetsArrayList = arrayListOf("Mercury", "Venus", "Earth", "Mars")

    // Mutable lists
    val outerPlanets = mutableListOf("Jupiter", "Saturn", "Uranus", "Neptune")
    val exoPlanets = mutableListOf<String>()

    // Accessing elements
    // using properties and methods
    val players = mutableListOf("Alice", "Bob", "Cindy", "Dan")
    println(players.isEmpty())
    var currentPlayer = players.first()
    println(players.last())
    val minPlayer = players.min()
    minPlayer.let { println("$minPlayer will start") }

    // using indexing
    val firstPlayer = players[0]
    val secondPlayer = players.get(1)
    //val player = players[4] > IndexOutOfBoundsException

    // using ranges to slice
    val upcomingPlayersSlice = players.slice(1..2)
    println(upcomingPlayersSlice.joinToString()) // > Bob, Cindy

    // checking for an element
    println(isEliminated("Bob")) // false
    players.slice(1..3).contains("Alice") // false

    // Modifying lists
    // appending elements
    players.add("Eli")
    players += "Gina"

    // inserting elements
    players.add(5, "Frank")

    // removing elements
    val wasPlayerRemoved = players.remove("Gina")
    println("It is $wasPlayerRemoved that Gina was removed")
    val removedPlayer = players.removeAt(2) // returns the element that was removed from the list.
    println("$removedPlayer was removed")

    // Nullability and collection types
    var nullableList: List<Int>? = listOf(1,2,3,4)
    nullableList = null
    var listOfNullables: List<Int?> = listOf(1,2,null,4)

    var nullableListOfNullables: List<Int?>? = listOf(1,2,null,4)
    nullableListOfNullables = null

}

fun isEliminated(player: String): Boolean {
    return player !in players
}