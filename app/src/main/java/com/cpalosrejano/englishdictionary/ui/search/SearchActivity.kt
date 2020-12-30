package com.cpalosrejano.englishdictionary.ui.search

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.cpalosrejano.englishdictionary.R
import com.cpalosrejano.englishdictionary.repository.word.WordRepositoryImpl
import com.cpalosrejano.englishdictionary.repository.word.local.WordLocalDataSource
import com.cpalosrejano.englishdictionary.repository.word.remote.WordRemoteDataSource

class SearchActivity : AppCompatActivity() {

    lateinit var viewModel: SearchViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_activity)

        // bind ViewModel to this activity
        bindViewModel()

    }

    private fun bindViewModel() {

        // init Repository
        val localDataSource = WordLocalDataSource(this)
        val remoteDataSource = WordRemoteDataSource(this)
        val repository = WordRepositoryImpl(remoteDataSource, localDataSource)

        // init ViewModel
        val vmFactory = SearchViewModel.Factory(repository)
        viewModel = ViewModelProvider(this, vmFactory).get(SearchViewModel::class.java)
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