package com.patrickchow.advancedkotlinassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) 

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.drawer_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu_rock -> {

                rv_music.apply{
                    hasFixedSize()
                    layoutManager = LinearLayoutManager(this@MainActivity)
                    adapter = musicAdapter(rockList)

                }

            }
            R.id.menu_pop-> {
                rv_music.apply{
                    hasFixedSize()
                    layoutManager = LinearLayoutManager(this@MainActivity)
                    adapter = musicAdapter(popList)

                }

            }
            R.id.menu_classical -> {
                rv_music.apply{
                    hasFixedSize()
                    layoutManager = LinearLayoutManager(this@MainActivity)
                    adapter = musicAdapter(classicalList)

                }

            }
        }
        return super.onOptionsItemSelected(item)
    }
}
