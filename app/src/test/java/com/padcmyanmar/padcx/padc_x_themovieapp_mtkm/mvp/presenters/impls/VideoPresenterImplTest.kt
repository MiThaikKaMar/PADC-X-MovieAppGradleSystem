package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.presenters.impls

import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.models.impls.MockPopularMovieModelImpl
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.models.PopularMovieModel
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.models.impls.PopularMovieModelImpl
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.views.VideoView
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.RelaxedMockK
import org.junit.Before
import org.junit.runner.RunWith
import org.robolectric.annotation.Config

@RunWith(AndroidJUnit4::class)
@Config(manifest = Config.NONE)
class VideoPresenterImplTest {

    private lateinit var mPresenter : VideoPresenterImpl
    @RelaxedMockK
    private lateinit var mView : VideoView
    private lateinit var mModel : PopularMovieModel

    @Before
    fun setUpPresenter(){
        MockKAnnotations.init(this)

        PopularMovieModelImpl.initVideoDatabase(ApplicationProvider.getApplicationContext())
        mModel=
            MockPopularMovieModelImpl

        mPresenter=
            VideoPresenterImpl()
        mPresenter.initPresenter(mView)
        mPresenter.mPopularMovieModel=this.mModel
    }

//    @Test
//    fun onUiReady_callShowVideo(){
//        val lifecycleOwner = Mockito.mock(LifecycleOwner::class.java)
//        val lifecycleRegistry = LifecycleRegistry(lifecycleOwner)
//        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME)
//        Mockito.`when`(lifecycleOwner.lifecycle).thenReturn(lifecycleRegistry)
//
//        mPresenter.onUiReady(lifecycleOwner,550)
//        verify {
//            mView.showVideo("BdJKm16Co6M")
//        }
//    }
}