package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.utils

import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.BuildConfig

const val BASE_URL="https://api.themoviedb.org/3/"
const val GET_POPULAR="movie/popular"
const val GET_GENRE_MOVIE="genre/movie/list"
const val GET_SHOWCASE="movie/now_playing"
const val GET_BEST_ACTOR="person/popular"
const val GET_DISCOVER="discover/movie"
const val GET_DETAIL="movie/{movie_id}"
const val GET_VIDEO="movie/{MOVIE_ID}/videos"
const val GET_TOP_RATED="movie/top_rated"
const val GET_CREDIT="movie/{MOVIE_ID}/credits"

const val PARAM_API_KEY="api_key"
const val PARAM_API_VALUE=BuildConfig.API_KEY

const val PARAM_KEY="with_genres"

const val IMAGE_BASE_URL="https://image.tmdb.org/t/p/w500"