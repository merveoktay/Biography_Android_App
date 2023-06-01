package com.example.merve_oktay_odev3.models

data class UserAbout(val image:String,
                     val about:String,
                     val education:List<String>,
                     val experience :List<String>,
                     val skill:List<String> )
