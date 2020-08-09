package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.presenters.impls

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.dummy.getDummyBestActorList
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.dummy.getDummyPopularMovieList
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.dummy.getDummyShowcaseList
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.models.impls.MockPopularMovieModelImpl
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.models.PopularMovieModel
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.models.impls.PopularMovieModelImpl
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.views.MainView
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.verify
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import org.robolectric.annotation.Config

@RunWith(AndroidJUnit4::class)
@Config(manifest = Config.NONE)
class MainPresenterImplTest {

    private lateinit var mPresenter : MainPresenterImpl
    @RelaxedMockK
    private lateinit var mView : MainView
    private lateinit var mModel : PopularMovieModel

    @Before
    fun setUpPresenter(){
        MockKAnnotations.init(this)

        PopularMovieModelImpl.initDatabase(ApplicationProvider.getApplicationContext())
        mModel =
            MockPopularMovieModelImpl

        mPresenter=
            MainPresenterImpl()
        mPresenter.initPresenter(mView)
        mPresenter.mPopularMovieModel=this.mModel
    }

    @Test
    fun onUiReady_callRequestPopularData(){
        val lifecycleOwner = mock(LifecycleOwner::class.java)
        val lifecycleRegistry = LifecycleRegistry(lifecycleOwner)
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME)
        `when`(lifecycleOwner.lifecycle).thenReturn(lifecycleRegistry)

        mPresenter.onUiReady(lifecycleOwner)
        verify {
            mView.showShowcaseList(getDummyShowcaseList())
            mView.showBestActorList(getDummyBestActorList())
            mView.showPopularDataList(getDummyPopularMovieList())
        }
    }

    @Test
    fun onTapItem_callNavigateToDetail(){
        mPresenter.onTapItem(550)
        verify {
            mView.navigateToDetail(550)
        }
    }

    @Test
    fun onTapMovieItem_callNavigateToDetailScreen(){
        mPresenter.onTapMovieItem(550)
        verify {
            mView.navigateToVideoScreen(550)
        }
    }
}