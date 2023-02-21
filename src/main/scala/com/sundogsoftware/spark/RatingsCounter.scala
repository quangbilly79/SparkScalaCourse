package com.sundogsoftware.spark

import org.apache.spark._
import org.apache.log4j._

/** Count up how many of each star rating exists in the MovieLens 100K data set. */
object RatingsCounter {
 
  /** Our main function where the action happens */
  def main(args: Array[String]) {
   
    // Set the log level to only print errors
    Logger.getLogger("org").setLevel(Level.ERROR)
        
    // Create a SparkContext using every core of the local machine, named RatingsCounter
    val sc = new SparkContext("local[*]", "RatingsCounter")
   
    // Load up each line of the ratings data into an RDD
    val lines = sc.textFile("data/ml-100k/u.data")
    
    // Convert each line to a string, split it out by tabs, and extract the third field.
    // (The file format is userID, movieID, rating, timestamp).
    // Type class org.apache.spark.rdd.MapPartitionsRDD [3,2,1,4,...]
    val ratings = lines.map(x => x.split("\t")(2))
    // println(ratings.getClass) // ~ type(ratings)
    // Count up how many times each value (rating) occurs
    val results = ratings.countByValue()
    //class scala.collection.immutable.HashMap$HashTrieMap (1,6110), (2,11370)

    // Sort the resulting map of (rating, count) tuples
    // _1 la` method goi. ptu? dau` tien cua? tuple. _._1 nghia~ la` sap xep theo ptu? dau` tien
    // ~  sortBy(_._1)
    val sortedResults = results.toSeq.sortBy({x => x._1})(Ordering[String].reverse)
    //class scala.collection.immutable.Vector
    // Print each result on its own line.
    sortedResults.foreach(println)
  }
}
