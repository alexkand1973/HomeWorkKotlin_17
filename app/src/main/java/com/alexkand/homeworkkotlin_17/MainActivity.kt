package com.alexkand.homeworkkotlin_17

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlin.concurrent.thread

//Сделайте приложение в котором будет реализована многопоточность четырьмя способами,
// которые мы прошли на данном занятие. В каждом из потоков нужно создать цикл от 0 до 1000.
// В теле цикла нужно указать println() с текстом "Поток сделанный тут_должен_быть_номер_способа
// способом!". Желательно текст указать на английском языке. Например:
// "Thread that is made by the first way!".

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstThread = FirstThread()
        firstThread.start()

        val secondThread = Thread(SecondRunnable())
        secondThread.start()

        val thirdThread = Thread {
            for (i in 0..1000) {
                println("Thread that is made by the third way!")
            }
        }
        thirdThread.start()

        thread (start = true) {
            for (i in 0..1000) {
                println("Thread that is made by the fourth way!")
            }
        }
    }
}