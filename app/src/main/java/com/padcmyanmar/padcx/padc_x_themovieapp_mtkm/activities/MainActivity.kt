package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.activities

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.R
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.adapters.*
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.models.*
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.models.impls.PopularMovieModelImpl
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.*
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.presenters.MainPresenter
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.presenters.impls.MainPresenterImpl
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.views.MainView
import com.padcmyanmar.padcx.shared.activities.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), MainView {

    private lateinit var mMovieAdapter : MovieAdapter
    private lateinit var mShowcaseAdapter : ShowcaseAdapter
    private lateinit var mBestActorAdapter : BestActorAdapter
    private lateinit var mTopRatedAdapter : TopRatedAdapter
    private lateinit var dynamicViewPagerAdapter : DynamicViewPagerAdapter
    val mPopularMovieModel : PopularMovieModel =
        PopularMovieModelImpl

    private lateinit var mMainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpPresenter()
        mMainPresenter.onUiReady(this)

        setUpBestActorRecycleView()
        setUpShowcaseRecyclerView()
        setUpPopularMovieRecyclerView()
        setUpTopRatedRecyclerView()

        showGerne(mPopularMovieModel.getGenreMovie())
    }


    override fun navigateToDetail(id : Int) {
        startActivity(DetailActivity.newItent(this,id))

    }

    override fun showPopularDataList(list : List<PopularMovieVO>) {
        mMovieAdapter.setData(list.toMutableList())
    }

    override fun showShowcaseList(list : List<ShowcaseVO>) {
        mShowcaseAdapter.setData(list.toMutableList())
    }

    override fun showBestActorList(list : List<BestActorVO>) {
        mBestActorAdapter.setData(list.toMutableList())
    }

    private fun setUpPresenter(){
        mMainPresenter=ViewModelProviders.of(this).get(MainPresenterImpl::class.java)
        mMainPresenter.initPresenter(this)
    }


    private fun showGerne(list: List<GenreMovieVO>){
        dynamicViewPagerAdapter = DynamicViewPagerAdapter(supportFragmentManager,list)
        vp.adapter = dynamicViewPagerAdapter
        tab_layout.setupWithViewPager(vp)
    }

    private fun setUpPopularMovieRecyclerView() {
        mMovieAdapter= MovieAdapter(mMainPresenter)
        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rv_best_popular.adapter = mMovieAdapter
        rv_best_popular.layoutManager = linearLayoutManager
    }

    private fun setUpShowcaseRecyclerView(){
        mShowcaseAdapter= ShowcaseAdapter(mMainPresenter)
        val linearLayoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rv_showcases.adapter=mShowcaseAdapter
        rv_showcases.layoutManager=linearLayoutManager
    }

    private fun setUpBestActorRecycleView(){
        mBestActorAdapter=BestActorAdapter()
        val linearLayoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rv_best_actor.adapter=mBestActorAdapter
        rv_best_actor.layoutManager=linearLayoutManager
    }

    override fun navigateToVideoScreen(id: Int) {
        startActivity(VideoActivity.newIntent(this,id))
    }

    override fun showTopRatedList(list: List<TopRateVO>) {
       mTopRatedAdapter.setData(list.toMutableList())
    }

    private fun setUpTopRatedRecyclerView(){
        mTopRatedAdapter= TopRatedAdapter()
        val linearLayoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        rv_collapse.adapter=mTopRatedAdapter
        rv_collapse.layoutManager=linearLayoutManager
    }
}
