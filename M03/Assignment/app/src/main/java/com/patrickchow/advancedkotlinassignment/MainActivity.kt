package com.patrickchow.advancedkotlinassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rockList = mutableListOf<Music>(
            Rock("Rock 1"),
            Rock("Rock 2"),
            Rock("Rock 3")
        )

        var popList = mutableListOf<Music>(
            Pop("Pop 1"),
            Pop("Pop 2"),
            Pop("Pop 3")
        )

        var classicalList = mutableListOf<Music>(
            Classical("Classical 1"),
            Classical("Classical 2"),
            Classical("Classical 3")
        )
    }
}
