package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.bumptech.glide.Glide
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.R
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.DetailVO
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.presenters.DetailPresenter
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.presenters.impls.DetailPresenterImpl
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.views.DetailView
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.utils.IMAGE_BASE_URL
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity(),DetailView {
    private lateinit var mDetailPresenter : DetailPresenter

    companion object {

        const val MOVIE_ID_EXTRA = "Movie Id Extra"

        fun newItent(context: Context, movieId : Int): Intent {
            val intent =  Intent(context, DetailActivity::class.java)
            intent.putExtra(MOVIE_ID_EXTRA, movieId)
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val movieId = intent.getIntExtra(MOVIE_ID_EXTRA,0)

        setUpPresenter()
        mDetailPresenter.onUIReady(this,movieId)

        iv_icon.setOnClickListener { mDetailPresenter.onTapBackButton() }
    }

    override fun finishActivity() {
        finish()
    }

    override fun bindDetailData(movie : DetailVO) {
        Glide
            .with(window.decorView)
            .load(IMAGE_BASE_URL+movie.posterPath)
            .into(iv_detail_img)

        tv_detail_title.text=movie.title
        tv_detail_vote_count.text=movie.voteCount
        tv_rating.text=movie.voteAverage
        tv_storyline_overview.text=movie.overview
        tv_original_title.text=movie.originalTitle
        tv_premiere.text=movie.releaseDate
        tv_description.text=movie.overview
    }

    fun setUpPresenter(){
        mDetailPresenter=ViewModelProviders.of(this).get(DetailPresenterImpl::class.java)
        mDetailPresenter.initPresenter(this)
    }
}
