package com.example.merve_oktay_odev3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.merve_oktay_odev3.about_page.AboutPage
import com.example.merve_oktay_odev3.blog_page.BlogPage
import com.example.merve_oktay_odev3.connect_page.ConnectPage
import com.example.merve_oktay_odev3.portfolio_page.PortfolioPage


class MainActivity : AppCompatActivity() {

    lateinit var btnAbout:Button
    lateinit var btnPortfolio:Button
    lateinit var btnConnect:Button
    lateinit var btnBlog:Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAbout=findViewById(R.id.btnAbout)
        btnPortfolio=findViewById(R.id.btnPortfolio)
        btnConnect=findViewById(R.id.btnConnect)
        btnBlog=findViewById(R.id.btnBlog)



        btnBlog.setOnClickListener {
            val blogPageIntent = Intent(this, BlogPage::class.java)
            startActivity(blogPageIntent)
        }
        btnAbout.setOnClickListener {
            val aboutMenuIntent = Intent(this, AboutPage::class.java)
            startActivity(aboutMenuIntent)
        }
       btnConnect.setOnClickListener {
           val connectMenuIntent = Intent(this, ConnectPage::class.java)
          startActivity(connectMenuIntent)
       }
        btnPortfolio.setOnClickListener {
            val portfolioMenuIntent = Intent(this, PortfolioPage::class.java)
            startActivity(portfolioMenuIntent)

        }


    }





}