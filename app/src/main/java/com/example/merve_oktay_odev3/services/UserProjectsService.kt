package com.example.merve_oktay_odev3.services

import com.example.merve_oktay_odev3.models.UserProjects

class UserProjectsService {
        fun projectData(): List<UserProjects> {

            val list = mutableListOf<UserProjects>()

            val pd1 = UserProjects(
                "Uygulama Giriş Sayfası",
                "Kullanıcıdan ad, soyad bilgilerini alan ve doğruluğunu kontrol eden, doğru olduğunda kullanıcının girişini sağlayan uygulamadır.",
                "https://i.ibb.co/Q8hr5mW/uygulama-giris-sayfasi.png"
            )
            val pd2 = UserProjects(
                "Basit Paint Uygulaması",
                "Kullanıcının dört farklı renk ve tek tip kalem seçeneği ile basit çizimler yapmasını sağlayan uygulamadır.",
                "https://i.ibb.co/xjZrYVm/basit-pain.png"
            )
            val pd3 = UserProjects(
                "Hava Durumu Uygulaması",
                "Custom olarak verilen şehrin hava durumunu gösteren uygulamadır.",
                "https://i.ibb.co/wBmS7Nx/hava-durumu.png"
            )

            list.add(pd1)
            list.add(pd2)
            list.add(pd3)

            return list

        }

}