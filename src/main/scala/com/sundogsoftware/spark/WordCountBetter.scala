package com.sundogsoftware.spark

import org.apache.spark._
import org.apache.log4j._

/** Count up how many of each word occurs in a book, using regular expressions. */
object WordCountBetter {
 
  /** Our main function where the action happens */
  def main(args: Array[String]) {
   
    // Set the log level to only print errors
    Logger.getLogger("org").setLevel(Level.ERROR)
    
     // Create a SparkContext using every core of the local machine
    val sc = new SparkContext("local[*]", "WordCountBetter")   
    
    // Load each line of my book into an RDD
    val input = sc.textFile("data/book.txt")
    
    // Split using a regular expression that extracts words
    // \W la` chi? nhung~ ki' tu. k phai? word, them 1 \ de? escape
    val words = input.flatMap(x => x.split("\\W+"))
    
    // Normalize everything to lowercase
    val lowercaseWords = words.map(x => x.toLowerCase())
    
    // Count of the occurrences of each word
    val wordCounts = lowercaseWords.countByValue()
    // Sort k dùng RDD
    val sortWordCounts = wordCounts.toSeq.sortBy(_._2)(Ordering[Long].reverse)
    // Print the results
    sortWordCounts.foreach(println)
  }
  
}

