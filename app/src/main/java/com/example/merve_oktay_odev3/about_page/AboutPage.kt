package com.example.merve_oktay_odev3.about_page

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.security.identity.AccessControlProfile
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.merve_oktay_odev3.MainActivity
import com.example.merve_oktay_odev3.R
import com.example.merve_oktay_odev3.blog_page.BlogPage
import com.example.merve_oktay_odev3.connect_page.ConnectPage
import com.example.merve_oktay_odev3.portfolio_page.PortfolioPage
import com.example.merve_oktay_odev3.services.UserAboutService

class AboutPage : AppCompatActivity() {

    lateinit var txtAbout:TextView
    lateinit var schoolsListView:ListView
    lateinit var experiencesListView: ListView
    lateinit var skillsListView: ListView
    lateinit var imgProfile: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_page)

        val uAbout=UserAboutService()
        val profileImage="https://i.ibb.co/pKbDsvD/1659611763819.jpg"

        txtAbout=findViewById(R.id.txtAbout)
        schoolsListView=findViewById(R.id.schoolsListView)
        experiencesListView=findViewById(R.id.experiencesListView)
        skillsListView=findViewById(R.id.skillsListView)
        imgProfile=findViewById(R.id.imgProfile)

       val schoolsArrayAdapter: ArrayAdapter<String> = ArrayAdapter(this,R.layout.simple_list_item,R.id.textView,uAbout.userAboutData().education)
        schoolsListView.adapter=schoolsArrayAdapter

        val experiencesArrayAdapter: ArrayAdapter<String> = ArrayAdapter(this,R.layout.simple_list_item,R.id.textView,uAbout.userAboutData().experience)
        experiencesListView.adapter=experiencesArrayAdapter

        val skillsArrayAdapter: ArrayAdapter<String> = ArrayAdapter(this,R.layout.simple_list_item,R.id.textView,uAbout.userAboutData().skill)
       skillsListView.adapter=skillsArrayAdapter


        txtAbout.text=uAbout.userAboutData().about

        Glide.with(this).load(profileImage).into(imgProfile)


    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
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
            R.id.portfolio->{
                val portfolioMenuIntent = Intent(this, PortfolioPage::class.java)
                startActivity(portfolioMenuIntent)
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