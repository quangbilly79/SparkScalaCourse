//// VALUES are immutable constants.
//val hello: String = "Hola!"
//
//// VARIABLES are mutable, có thể assign value
//var helloThere: String = hello
//helloThere = hello + " There!"
//println(helloThere)
//
//val immutableHelloThere = hello + " There"
//println(immutableHelloThere)
//
//// Data Types
//// 1 số kdl khác
//val numberOne: Int = 1
//val truth: Boolean = true
//val letterA: Char = 'a'
//val pi: Double = 3.14159265
//val piSinglePrecision: Float = 3.14159265f
//val bigNumber: Long = 123456789
//val smallNumber: Byte = 127
//val nothing = Option(null) // Cach' khai bao' null chuan?
//var x = null

//val list: List[Any] = List(1,2,3,4,5) //list: List[Any] = List(1, 2, 3, 4, 5)
//print(list) //List(1, 2, 3, 4, 5)
//println(list.length) //5

//// Tự động chuyển về kdl string, ngc voi' Python
//print(3 + helloThere) //3Hola! There!
//println("Here is a mess: " + numberOne + truth + letterA + pi + bigNumber)
////Here is a mess: 1truea3.14159265123456789
//print(nothing + hello) //NoneHola!
//
//
//println(f"Pi is about $piSinglePrecision%.3f") // Pi is about 3.142
////Format voi' bien', $ de? khai bao' bien', % de? format so'
//println(f"Zero padding on the left: $numberOne%05d") //Zero padding on the left: 00001
//// 5 số 0 ở bên trái, tuy vậy nếu thay 0 = số khác thì sẽ là khoảng trống
//
//println(s"I can use the s prefix to use variables like $numberOne $truth $letterA")
////I can use the s prefix to use variables like 1 true a
//println(s"The s prefix isn't limited to variables; I can include any expression. Like ${1 + 2}")
////The s prefix isn't limited to variables; I can include any expression. Like 3
//
//val theUltimateAnswer: String = "To life, the universe, and everything is 42."
//val pattern = """.* ([\d]+).*""".r // thêm .r để tạo thah regex pattern
//val pattern(answerString) = theUltimateAnswer
////Cu' pháp hơi lạ xíu, túm lại là gán kết quả cho answerString
//val answer = answerString.toInt // Chuyển thành int
//println(answer)
//
//// Booleans
//val bool: Boolean = 1 > 2 //false
//val isGreater = 1 > 2 //false
//val isLesser = 1 < 2 //true
//val impossible = isGreater && isLesser //false, có thể dùng 1 & hoặc 2 &&
//val anotherWay = isGreater || isLesser //true
//
//val picard: String = "Picard"
//val bestCaptain: String = "Picard"
//val isBest: Boolean = picard == bestCaptain //isBest: Boolean = true

// EXERCISE
// Write some code that takes the value of pi, doubles it, and then prints it within a string with
// three decimal places of precision to the right.
//val pi = math.Pi * 2
//println(f"$pi%.3f")
//val piRoundFloat : Float = f"$pi%.3f".toFloat
//val piRoundString : String = f"$pi%.3f"

val list: List[Any] = List(1,2,3,4,5)
print(list(0))