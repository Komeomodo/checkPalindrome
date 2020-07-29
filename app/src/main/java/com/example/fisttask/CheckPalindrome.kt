package com.example.fisttask

fun main(args: Array<String>){

    checkPalindrome("racecar")
}


fun checkPalindrome(input: String): Boolean {
    // receives characters from
    var text = input.toLowerCase().replace("""[\W+]""".toRegex(), "")
    var reservedText = ""
//    loop the through the string from the last character to the first
    for (index in text.length - 1 downTo 0) {
//        Appends the characters to the variable/ container
        reservedText += text[index]
    }
//    checks if the field is empty then return false
    if (reservedText == ""){
        return false
//        then it checks if the characters between a-z is not string then return false
    } else if (!reservedText.matches("^[a-z]*$".toRegex())){
           return  false
//        return true or false of the checked palindrome
    } else{
        return text == reservedText
    }

}
