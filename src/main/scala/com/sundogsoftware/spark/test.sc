// Functions

// format def <function name>(parameter name: type...) : return type = { }

def squareIt(x: Int) : Int = { //squareIt: (x: Int)Int
  return x * x
}
println(squareIt(2)) //4
def returnVoid(): Unit = { //returnVoid: ()Unit ~ return Void
  print("abc")
}
returnVoid() //abc
def cubeIt(x : Int) : Int = {x * x * x}
println(cubeIt(3)) //27

// Thêm hàm làm tham số dau` vao`, ham` nhan. gia' tri. int trả về int
def transformInt(x: Int, g: Int => Int): Int = {
  g(x)
}
// cubeIt(2)
val result = transformInt(2, cubeIt) //result: Int = 8
println(result) //8
// Tương tự lambda, áp hàm vào cho 1 tham số
transformInt(3, x => x * x * x) //res4: Int = 27
transformInt(10, x => x / 2) //res5: Int = 5
transformInt(2, x => {val y = x * 2; y * y}) //res6: Int = 16

// EXERCISE
// Strings have a built-in .toUpperCase method. For example, "foo".toUpperCase gives you back FOO.
// Write a function that converts a string to upper-case, and use that function of a few test strings.
// Then, do the same thing using a function literal instead of a separate, named function.

def upperString(s: String): String = {
  s.toUpperCase()
}
print(upperString("abv")) //ABV
def convertToUpperCase(s: String, f: String => String): String = {
  f(s)
}
// Using named function
convertToUpperCase("son nguyen", upperString) //res9: String = SON NGUYEN

// Using lambda
convertToUpperCase("sonnguyen", s => s.toUpperCase) // res10: String = SONNGUYEN
