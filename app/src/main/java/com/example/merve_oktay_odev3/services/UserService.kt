package com.example.merve_oktay_odev3.services
import  com.example.merve_oktay_odev3.models.User
class UserService {
    fun userData():User {
        return User("Merve", "OKTAY", "merve.oktay@hotmail.com","0538 875 17 02",
            "Çiftlik mah. Adnan M. cad. No:23 Daire:1 Gölcük/KOCAELİ",
            "https://www.linkedin.com/in/merve-oktay-392a24207/","https://github.com/merveoktay/",
            "res/drawable/profile_image.png")

    }

}