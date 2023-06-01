package com.example.merve_oktay_odev3.connect_page

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.MultiAutoCompleteTextView
import android.widget.TextView
import com.example.merve_oktay_odev3.MainActivity
import com.example.merve_oktay_odev3.R
import com.example.merve_oktay_odev3.about_page.AboutPage
import com.example.merve_oktay_odev3.blog_page.BlogPage
import com.example.merve_oktay_odev3.portfolio_page.PortfolioPage
import com.example.merve_oktay_odev3.services.UserProjectsService
import com.example.merve_oktay_odev3.services.UserService

class ConnectPage : AppCompatActivity() {


    lateinit var txtPhone:TextView
    lateinit var  txtEmail:TextView
    lateinit var txtWeb:TextView
    lateinit var  txtBlog:TextView
    lateinit var txtAddress:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_connect_page)

        val user=UserService()


        txtPhone=findViewById(R.id.txtPhone)
        txtEmail=findViewById(R.id.txtEmail)
        txtWeb=findViewById(R.id.txtWeb)
        txtBlog=findViewById(R.id.txtBlog)
        txtAddress=findViewById(R.id.txtAddress)


        txtPhone.text=user.userData().phone
        txtEmail.text= user.userData().email
        txtBlog.text=user.userData().blogPageAddress
        txtWeb.text= user.userData().webAddress
        txtAddress.text=user.userData().address


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
            R.id.portfolio->{
                val portfolioMenuIntent = Intent(this, PortfolioPage::class.java)
                startActivity(portfolioMenuIntent)
            }
            R.id.myBlogPage->{
                val blogMenuIntent = Intent(this, BlogPage::class.java)
                startActivity(blogMenuIntent)
            }

        }
        return super.onOptionsItemSelected(item)
    }

}