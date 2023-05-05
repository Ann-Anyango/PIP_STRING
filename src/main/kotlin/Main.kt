fun main() {

    var word=" Hello "
    println(word.trim())
    println(detels("Ann",20,"Kenya"))
    var name1="Student"
    println(name1.length)
    statenment("Ann")
    character("eat")


}
fun trimWhiteSpace(name:String):String{
    return  name


}
//Write a function that takes in 3 parameters, name, age,
// and country, and returns a String with this structure “Hi, my name is x,
// I am y years old and I am from z.”
// Where x, y, and z are the provided name, age, and country respectively. (3 points)
fun detels(name:String,age:Int,country:String): String{
    var word="Hi, my name is $name , I am $age and i am from$country"
    return  word

}
//2. Write a function that takes in a String and returns its length (2 points)
fun words(name:String):String{
    return  name
}
//. Write a function that takes in a name and prints out “That’s me!”
// when your name is passed to it, otherwise,
// it prints out “I don’t know who that is” (3 points)
fun statenment(word:String){
    var name = "Ann"

    if (word == name) {
        println("That's me!")
    } else {
        println("I don't know who that is")
    }
}


//. Write a Kotlin function that takes in a
// string will all the vowels replaces by the character ‘*’.
// Use string interpolation to generate the output. (2 points)
fun character(names:String){
    var word= "a\",\"e\",\"i\",\"o\",\"u\""
    var vowels=names.replace(word,"*")
    println("$vowels ")
}