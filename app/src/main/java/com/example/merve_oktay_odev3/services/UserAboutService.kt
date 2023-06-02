package com.example.merve_oktay_odev3.services

import com.example.merve_oktay_odev3.models.UserAbout

class UserAboutService {
    fun  userAboutData():UserAbout
    {
        val  about="Ben Merve OKTAY. Android programlama üzerine kendimi geliştiriyorum. Çeşitli alanlarda projerler yapma imkanım oldu. " +
                "Üniversitede görüntü işleme projesi, yapay sinir ağları ile görüntü sınıflandırma ve doğal dil işleme projeleri geliştirdim."+
                "Üniversiteden sonra java ve C# eğitimleri alıp .Net projeleri geliştirdim." +
                " Aldığım eğitimler ve yapltığım projerler sonrasında Android uygulama geliştirmenin benim için daha iyi olduğuna ve severek öğrendiğimi düşündüğüm için bu alanda ilerlemeye karar verdim."
        val education=listOf("Anadolu ticaret Meslek Lisesi / Veri Tabanı Programcılığı ","Kocaeli Üniversitesi / Bilgisayar Programcılığı","Karadeniz Teknik Üniversitesi / Bilgisayar Mühendisliği")
        val experience=listOf("Kocaeli Büyükşehir Belediyesi /  Bilgi İşlem Dairesi")
        val  skills = listOf("C++","C#","Java","Kotlin","SQL","Görüntü İşleme", "Yapay Sinir Ağları")

        return UserAbout("res/drawable/profile_image.png", about,education,experience,skills)
    }
}