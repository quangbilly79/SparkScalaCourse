// Flow control

// If / else / else if:
if (1 > 3) println("Impossible!") else println("The world makes sense.")

if (1 > 3) {
  println("Impossible!")
  println("Really?")
}
else if (false){
  print("elif1")
}
else if (true) {
  if (1>3){
    print("elif2_1")
  }
  else{
    print("elif2_2")
  }
}
else {
  println("The world makes sense.")
  println("still.")
}

// Matching voi' match + case (va` if nua~)
val number = 2
number match {
  case number if number > 5 => println("One")
  case number if number == 3 => println("Two")
  case 3 => println("Three")
  case _ => println("Something else")
}
// to la` <=, until la` <, step them by
for (x <- 1 until 4 by 2) {
  val squared = x * x
  println(squared) // 1->1, 3->9
}

var x = 10
while (x >= 0) {
  println(x) //10 -> 0
  x -= 1 // Phai? dung` var
}

// do while
x = 0
do { println(x); x+=1 } while (x <= 10)
//
//// Expressions
// Implicity Return, co' the? coi cum. trong {} la` 1 function
// Tra? ve` 1 gia' tri.

//{val x = 10; x + 20} // res6: Int = 30
//println({val x = 10; x + 20}) //30
//
//{var x = 10; println(x)} //10
//val y = {var x = 10; println(x)}  //10y: Unit = ()
//println({var x = 10; println(x)}) //10 ()
//println(y) //()


// EXERCISE
// Write some code that prints out the first 10 values of the Fibonacci sequence.
// This is the sequence where every number is the sum of the two numbers before it.
// So, the result should be 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
// Dung` Seq/List ~ Immutable
var Sequence : Seq[Int] = Seq(0) //Sequence: Seq[Int] = List(0)
for (x<-1 to 10) {
  if (x == 1) {
    Sequence = Sequence :+ x //append
  }
  else {
    Sequence = Sequence :+ (Sequence(x-1) + Sequence(x-2)) //index
  }
}
print(Sequence) //List(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55)

var list : List[Int] = List(0) //list: List[Int] = List(0)
for (x<-1 to 10) {
  if (x == 1) {
    list = list :+ x //append
  }
  else {
    list = list :+ (list(x-1) + list(x-2)) //index
  }
}
print(list) //List(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55)