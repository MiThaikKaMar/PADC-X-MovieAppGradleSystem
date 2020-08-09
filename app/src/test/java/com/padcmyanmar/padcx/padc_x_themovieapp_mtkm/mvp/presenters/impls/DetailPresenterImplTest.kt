package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.presenters.impls

import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.models.impls.MockPopularMovieModelImpl
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.models.PopularMovieModel
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.models.impls.PopularMovieModelImpl
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.views.DetailView
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.verify
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config

@RunWith(AndroidJUnit4::class)
@Config( manifest = Config.NONE)
class DetailPresenterImplTest {

    private lateinit var mPresenter : DetailPresenterImpl
    @RelaxedMockK
    private lateinit var mView : DetailView
    private lateinit var mModel : PopularMovieModel

    @Before
    fun setUpPresenter(){
        MockKAnnotations.init(this)

        PopularMovieModelImpl.initDetailDatabase(ApplicationProvider.getApplicationContext())
        mModel=
            MockPopularMovieModelImpl

        mPresenter=
            DetailPresenterImpl()
        mPresenter.initPresenter(mView)
        mPresenter.mPopularModel=this.mModel
    }

    @Test
    fun onTapBackButton_callFinishActivity(){
        mPresenter.onTapBackButton()
        verify {
            mView.finishActivity()
        }
    }

//    @Test
//    fun onUiReady_callBindDetailData(){
//        val lifecycleOwner = Mockito.mock(LifecycleOwner::class.java)
//        val lifecycleRegistry = LifecycleRegistry(lifecycleOwner)
//        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME)
//        Mockito.`when`(lifecycleOwner.lifecycle).thenReturn(lifecycleRegistry)
//
//        mPresenter.onUIReady(lifecycleOwner,550)
//        verify {
//            mView.bindDetailData(getDummyDetailMovie())
//        }
//    }
}