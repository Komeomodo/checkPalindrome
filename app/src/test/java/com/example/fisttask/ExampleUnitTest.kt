package com.example.fisttask

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
//    @Test
//    fun addition_isCorrect() {
//        assertEquals(4, 2 + 2)
//    }
    @Test
    fun for_short_string(){
        assertEquals(checkPalindrome("madam"), true)
    }

    @Test
    fun for_long_string(){
        assertEquals(checkPalindrome("Was it a cat I saw"), true)
    }

    @Test
    fun for_very_long_string(){
        assertEquals(checkPalindrome("was it a car or a cat I saw"), true)
    }
    @Test
    fun for_Empty_Field(){
        assertEquals(checkPalindrome(""), false)
    }
    @Test
    fun for_Space_Between(){
        assertEquals(checkPalindrome(" ra ce car"), true)
    }
    @Test
    fun for_Special_Character(){
        assertEquals(checkPalindrome("1542'[]$"), false)
    }
}
