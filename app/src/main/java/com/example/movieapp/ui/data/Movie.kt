package com.example.movieapp.data

data class Movie(
    val id: Int,
    val title: String,
    val genre: String,
    val rating: Double,
    val posterUrl: String,
    val description: String
)