package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.ViewModelProviders
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.R
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.presenters.VideoPresenter
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.presenters.impls.VideoPresenterImpl
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.views.VideoView
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import kotlinx.android.synthetic.main.activity_video.*

class VideoActivity : AppCompatActivity() ,VideoView, LifecycleObserver {
    companion object{

        const val movie ="MOVIE_ID_EXTRA"
        fun newIntent(context: Context,movieId : Int) :Intent{
            val intent =Intent(context,VideoActivity::class.java)
            intent.putExtra(movie,movieId)
            return intent
        }
    }

    private lateinit var mVideoPresenter  : VideoPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        val id = intent.getIntExtra(movie,0)

        setUpPresenter()

        mVideoPresenter.onUiReady(this,id)
    }

    fun setUpPresenter(){
        mVideoPresenter=ViewModelProviders.of(this).get(VideoPresenterImpl::class.java)
        mVideoPresenter.initPresenter(this)
    }

    override fun showVideo(movieKey : String) {
        lifecycle.addObserver(player_view)
        player_view.enterFullScreen()
        player_view.addYouTubePlayerListener(object : AbstractYouTubePlayerListener(){
            override fun onReady(youTubePlayer: YouTubePlayer) {
                youTubePlayer.loadVideo(movieKey,0f)
            }
        })
    }
}
