package com.cpalosrejano.englishdictionary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class SearchActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_activity)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.search, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {

            R.id.action_favorite ->
                Toast.makeText(this, "Favorite", Toast.LENGTH_LONG).show()

            R.id.action_history ->
                Toast.makeText(this, "History", Toast.LENGTH_LONG).show()

            R.id.action_information ->
                Toast.makeText(this, "About", Toast.LENGTH_LONG).show()
        }

        return super.onOptionsItemSelected(item)
    }
}