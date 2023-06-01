package com.example.merve_oktay_odev3.blog_page

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.merve_oktay_odev3.MainActivity
import com.example.merve_oktay_odev3.R
import com.example.merve_oktay_odev3.about_page.AboutPage
import com.example.merve_oktay_odev3.connect_page.ConnectPage
import com.example.merve_oktay_odev3.models.User
import com.example.merve_oktay_odev3.portfolio_page.PortfolioPage
import com.example.merve_oktay_odev3.services.UserService

class BlogPage : AppCompatActivity() {
    lateinit var blogWebView: WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blog_page)

        val user=UserService()
        blogWebView=findViewById(R.id.blogWebView)

        blogWebView.loadUrl(user.userData().blogPageAddress)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater:MenuInflater=menuInflater
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
           R.id.connectWithMe->{
               val connectMenuIntent = Intent(this, ConnectPage::class.java)
               startActivity(connectMenuIntent)
           }

        }
        return super.onOptionsItemSelected(item)
    }

    class customWebViewClient : WebViewClient() {

        override fun shouldOverrideUrlLoading(
            view: WebView?,
            request: WebResourceRequest?
        ): Boolean {
            Log.d("shouldOverrideUrlLoading", "Loading")
            return super.shouldOverrideUrlLoading(view, request)
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            Log.d("onPageFinished", "Finish")
            super.onPageFinished(view, url)
        }

        override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
            Log.d("onPageStarted", "Start")
            super.onPageStarted(view, url, favicon)
        }

    }

}