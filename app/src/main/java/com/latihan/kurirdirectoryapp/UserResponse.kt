package com.latihan.kurirdirectoryapp

import com.google.gson.annotations.SerializedName

data class UserResponse(
    @SerializedName("id")
    val id: Int,

    @SerializedName("name")
    val name: String,

    @SerializedName("username")
    val username: String,

    @SerializedName("email")
    val email: String,

    @SerializedName("address")
    val address: AddressInfo? = null,

    @SerializedName("phone")
    val phone: String,

    @SerializedName("website")
    val website: String,

    @SerializedName("company")
    val company: CompanyInfo
)

data class AddressInfo(
    @SerializedName("street")
    val street: String? = null,

    @SerializedName("suite")
    val suite: String? = null,

    @SerializedName("city")
    val city: String? = null,

    @SerializedName("zipcode")
    val zipcode: String? = null,

    @SerializedName("geo")
    val geo: GeoInfo? = null
)

data class GeoInfo(
    @SerializedName("lat")
    val lat: String? = null,

    @SerializedName("lng")
    val lng: String? = null
)

data class CompanyInfo(
    @SerializedName("name")
    val companyName: String,

    @SerializedName("catchPhrase")
    val catchPhrase: String? = null,

    @SerializedName("bs")
    val bs: String? = null
)
