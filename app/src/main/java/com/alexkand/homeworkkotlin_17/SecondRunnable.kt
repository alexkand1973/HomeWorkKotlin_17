package com.alexkand.homeworkkotlin_17

class SecondRunnable : Runnable {

    override fun run() {
        for (i in 0..1000) {
            println("Thread that is made by the second way!")
        }
    }
}