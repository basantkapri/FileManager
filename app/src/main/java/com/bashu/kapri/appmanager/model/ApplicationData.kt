package com.bashu.kapri.appmanager.model

import java.util.*

data class ApplicationData(
    val arrAppType: Array<String> = arrayOf("User-Apps", "System-Apps", "Harmful-Apps"),
    //Installed application apart from system apps
    var userAppSize: Int = 0,
    var userApps: MutableList<ApplicationDetail> = ArrayList(),

    //Installed application by OS/Device manufacturers
    var systemAppSize: Int = 0,
    var systemApps: MutableList<ApplicationDetail> = ArrayList(),

    //Installed harmful application
    var harmfulAppSize: Int = 0,
    var harmfulApps: MutableList<ApplicationDetail> = ArrayList()
)