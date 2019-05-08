package com.jera.apptemplate.util.navigation

sealed class NavData{
    object Login : NavData()
    object SignUp : NavData()
}