package com.example.recyclerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superherolist = listOf<Superhero>(
            Superhero(
                R.drawable.antman,
                nameSuperhero = "Ant-man",
                descSuperhero = "super hero super hero"
            ),
            Superhero(
                R.drawable.black,
                nameSuperhero = "black panter",
                descSuperhero = "super hero super hero"
            ),
            Superhero(
                R.drawable.captain,
                nameSuperhero = "captain amerika",
                descSuperhero = "super hero super hero"
            ),
            Superhero(
                R.drawable.captain,
                nameSuperhero = "captain amerika",
                descSuperhero = "super hero super hero"
            ),
            Superhero(
                R.drawable.captain,
                nameSuperhero = "captain amerika",
                descSuperhero = "super hero super hero"
            ),
            Superhero(
                R.drawable.captain,
                nameSuperhero = "captain amerika",
                descSuperhero = "super hero super hero"
            ),
            Superhero(
                R.drawable.captain,
                nameSuperhero = "captain amerika",
                descSuperhero = "super hero super hero"
            ),
            Superhero(
                R.drawable.captain,
                nameSuperhero = "captain amerika",
                descSuperhero = "super hero super hero"
            ),
            Superhero(
                R.drawable.captain,
                nameSuperhero = "captain amerika",
                descSuperhero = "super hero super hero"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter= SuperheroAdapter(this, superherolist){
            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}