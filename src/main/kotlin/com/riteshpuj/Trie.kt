package com.riteshpuj

class Trie {
    val root = TrieNode(mutableMapOf())

    fun insert(word: String) {
        var currNode: TrieNode = root
        var i = 0
        while (i < word.length && currNode.map.containsKey(word[i])) {
            currNode = currNode.map[word[i]]!!
            i++
        }
        while (i < word.length) {
            val node = TrieNode(mutableMapOf(word[i] to null))
            currNode.map[word[i]] = node
            currNode = node
            i++
        }
        currNode.isWord = true
    }

    fun search(word: String): Boolean {
        var currNode: TrieNode = root
        var i = 0
        while (i < word.length && currNode.map.containsKey(word[i])) {
            currNode = currNode.map[word[i]]!!
            i++
        }
        return i == word.length && currNode.isWord
    }
}

data class TrieNode(val map: MutableMap<Char, TrieNode?>, var isWord: Boolean = false)

fun main() {
    val t = Trie()
    t.insert("Ritesh")
    t.insert("Rit")
    println("Ritesh is presnet ${t.search("Ritesh")}")
    println("Rit is present ${t.search("Rit")}")
}