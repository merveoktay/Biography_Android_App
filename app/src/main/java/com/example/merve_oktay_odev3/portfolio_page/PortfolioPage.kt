package com.example.merve_oktay_odev3.portfolio_page

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.ListView
import com.example.merve_oktay_odev3.MainActivity
import com.example.merve_oktay_odev3.R
import com.example.merve_oktay_odev3.about_page.AboutPage
import com.example.merve_oktay_odev3.adapter.UserProjectsCustomAdapter
import com.example.merve_oktay_odev3.blog_page.BlogPage
import com.example.merve_oktay_odev3.connect_page.ConnectPage
import com.example.merve_oktay_odev3.models.UserProjects
import com.example.merve_oktay_odev3.services.UserProjectsService

class PortfolioPage : AppCompatActivity() {
    lateinit var listView: ListView
    val userService = UserProjectsService()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_portfolio_page)

        listView = findViewById(R.id.userListView)
        val customAdapter = UserProjectsCustomAdapter(this, userService.projectData())
        listView.adapter = customAdapter
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater =menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId)
        {
            R.id.mainPage->{
                val mainMenuIntent = Intent(this, MainActivity::class.java)
                startActivity(mainMenuIntent)
            }
            R.id.aboutMe->{
                val aboutMenuIntent = Intent(this, AboutPage::class.java)
                startActivity(aboutMenuIntent)
            }
            R.id.connectWithMe->{
                val connectMenuIntent = Intent(this, ConnectPage::class.java)
                startActivity(connectMenuIntent)
            }
            R.id.myBlogPage->{
                val blogMenuIntent = Intent(this, BlogPage::class.java)
                startActivity(blogMenuIntent)
            }

        }
        return super.onOptionsItemSelected(item)
    }
}