// Data structures

// Tuples
// Immutable lists

//val captainStuff = ("Picard", "Enterprise-D", "NCC-1701-D")
//println(captainStuff) //(Picard,Enterprise-D,NCC-1701-D)
//
//// Refer to the individual fields with a ONE-BASED index
//println(captainStuff._1) //Picard
//println(captainStuff._2) //Enterprise-D
//println(captainStuff._3) //NCC-1701-D
//
//
//val picardsShip = "Picard" -> "Enterprise-D" //(Picard,Enterprise-D)
//println(picardsShip._2) //Enterprise-D
//
//val aBunchOfStuff = ("Kirk", 1964, true)
//aBunchOfStuff: (String, Int, Boolean) = (Kirk,1964,true)

// Lists
// Like a tuple, but more functionality
// Must be of same type

val shipList = List("Enterprise", "Defiant", "Voyager", "Deep Space Nine")
// shipList: List[String] = List(Enterprise, Defiant,
println(shipList(1)) //Defiant
// zero-based

println(shipList.head) //Enterprise (ptu? dau`)
println(shipList.tail) // List(Defiant, Voyager, Deep Space Nine)
// tat' ca? tru` item dau`

// ~ for ship in shipList
for (ship <- shipList) {println(ship)}
//Enterprise
//Defiant
//Voyager
//Deep Space Nine

//Builds a new collection by applying a function
// to all elements of this general collection
// ~ map(lambda x: x.upper(), list1)
val backwardShips = shipList.map( (ship: String) => {ship.reverse})
//backwardShips: List[String] = List(es
for (ship <- backwardShips) {println(ship)}
//esirpretnE
//tnaifeD
//regayoV
//eniN ecapS peeD

//// reduce() to combine together all the items
// in a collection using some function
// A , B => A
val numberList = List(1, 2, 3, 4, 5)
val sum = numberList.reduce( (x: Int, y: Int) => x + y) //sum: Int = 15
println(sum) //15

//// filter() removes stuff A => Boolean
val iHateFives = numberList.filter( (x: Int) => x != 5)
//iHateFives: List[Int] = List(1, 2, 3, 4)
val iHateThrees = numberList.filter(_ != 3) // _ thay the cho x
////iHateThrees: List[Int] = List(1, 2, 4, 5)

//// Concatenate lists
val moreNumbers = List(6,7,8)
//moreNumbers: List[Int] = List(6, 7, 8)
//numberList: List[Int] = List(1, 2, 3, 4, 5)
//val lotsOfNumbers = numberList ++ moreNumbers //lotsOfNumbers: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8)
//val reversed = numberList.reverse //reversed: List[Int] = List(5, 4, 3, 2, 1)
//val sorted = reversed.sorted(Ordering[String].reverse) // sorted: List[Int] = List(5, 4, 3, 2, 1)
//val lotsOfDuplicates = numberList ++ numberList //lotsOfDuplicates: List[Int] = List(1, 2, 3, 4, 5, 1, 2, 3, 4, 5)
//val distinctValues = lotsOfDuplicates.distinct //distinctValues: List[Int] = List(1, 2, 3, 4, 5)
//val maxValue = numberList.max //5
//val total = numberList.sum //15
//val hasThree = iHateThrees.contains(3) // false
//val append = lotsOfNumbers :+ (4) // append: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 4)

//// MAPS ~ Dictionary
val shipMap = Map("Kirk" -> "Enterprise", "Picard" -> "Enterprise-D",
  "Sisko" -> "Deep Space Nine", "Janeway" -> "Voyager")
//shipMap: scala.collection.immutable.Map[String,String] = Map(Kirk -> E
println(shipMap("Janeway")) //Voyager
val archersShip = util.Try(shipMap("Archer")) getOrElse "Unknown" //archersShip: String = Unknown
println(shipMap.getOrElse("Archer", "Unknown")) // Unknown
println(shipMap.contains("Archer")) //false
print(shipMap.values) //MapLike.DefaultValuesIterable(Enterprise, Enterprise-D, Deep Space Nine, Voyager)

// EXERCISE
// Create a list of the numbers 1-20; your job is to print out numbers that are evenly divisible by three. (Scala's
// modula operator, like other languages, is %, which gives you the remainder after division. For example, 9 % 3 = 0
// because 9 is evenly divisible by 3.) Do this first by iterating through all the items in the list and testing each
// one as you go. Then, do it again by using a filter function on the list instead.

var list1 = List.range(1,21) // Tao. list tu` range
for (i <- list1) {
  if (i%3 == 0) { // Cac' so' chia het cho 3 tu` 1 den 20
    println(i) // 3, 6, 9, 12, 15, 18
  }
}

var list2 = list1.filter({ (x: Int) => x%3 == 0}) // cach' day` du?
var list3 = list1.filter(_ % 3 == 0) // cach' ngan'
