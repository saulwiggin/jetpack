package com.drsilaswiggin.jetpack.api.data

import com.google.gson.annotations.SerializedName

data class UnsplashUser (
    @field:SerializedName("name") val name: String,
    @field:SerializedName("username") val username: String
) {
    // documentation for the api and returning a variable in the url is here (https://unsplash.com/documentation#get-a-users-public-profile)
    val attributeUrl: String
       get() {
           return "https://unsplash.com/$username?utm_source=sunflower&utm_medium=referral"
       }
}