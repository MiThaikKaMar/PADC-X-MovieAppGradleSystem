package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.fragments


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.R
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.activities.DetailActivity
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.adapters.DiscoverAdapter
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.DiscoverVO
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.presenters.GenreMoviePresenter
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.presenters.impls.GenreMoviePresenterImpl
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.views.GenreMovieView
import kotlinx.android.synthetic.main.fragment_genre_movie.*

private const val ARG_PARAM1 = "param1"


class GenreMovieFragment : Fragment(),GenreMovieView {



    protected var param1: Int = 0

    protected lateinit var mDiscoverAdapter: DiscoverAdapter
    private lateinit var mGenreMoviePresenter: GenreMoviePresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getInt(ARG_PARAM1)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_genre_movie, container, false)
    }


    companion object {
        @JvmStatic
        fun newInstance(param1: Int) =
            GenreMovieFragment().apply {
                arguments = Bundle().apply {
                    putInt(ARG_PARAM1, param1)
                }
            }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpPresenter()
        setUpRecyclerView()
        mGenreMoviePresenter.onUiReady(this,param1)

    }

    override fun showData(list: List<DiscoverVO>) {
            mDiscoverAdapter.setData(list.toMutableList())
    }

    private fun setUpPresenter(){
        mGenreMoviePresenter= ViewModelProviders.of(this).get(GenreMoviePresenterImpl::class.java)
        mGenreMoviePresenter.initPresenter(this)
    }

    private fun setUpRecyclerView(){
        mDiscoverAdapter= DiscoverAdapter(mGenreMoviePresenter)
        val linearLayoutManager=LinearLayoutManager(context,RecyclerView.HORIZONTAL,false)
        rv_genre_movies.adapter=mDiscoverAdapter
        rv_genre_movies.layoutManager=linearLayoutManager
    }

    override fun navigateToDetail(id: Int) {
        startActivity(DetailActivity.newItent(this.requireContext(),id))
    }

}
