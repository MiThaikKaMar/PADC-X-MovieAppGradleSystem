//package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.presenters.impls
//
//import androidx.test.core.app.ApplicationProvider
//import androidx.test.ext.junit.runners.AndroidJUnit4
//import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.models.impls.MockPopularMovieModelImpl
//import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.models.PopularMovieModel
//import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.models.impls.PopularMovieModelImpl
//import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.mvp.views.GenreMovieView
//import io.mockk.MockKAnnotations
//import io.mockk.impl.annotations.RelaxedMockK
//import io.mockk.verify
//import org.junit.Before
//import org.junit.Test
//import org.junit.runner.RunWith
//import org.robolectric.annotation.Config
//
//@RunWith(AndroidJUnit4::class)
//@Config(manifest = Config.NONE)
//class GenreMoviePresenterImplTest {
//
//    private lateinit var mPresenter : GenreMoviePresenterImpl
//    @RelaxedMockK
//    private lateinit var mView : GenreMovieView
//    private lateinit var mModel : PopularMovieModel
//
//    @Before
//    fun setUpPresenter(){
//        MockKAnnotations.init(this)
//
//        PopularMovieModelImpl.initDatabase(ApplicationProvider.getApplicationContext())
//        mModel=
//            MockPopularMovieModelImpl
//
//        mPresenter=
//            GenreMoviePresenterImpl()
//        mPresenter.initPresenter(mView)
//        mPresenter.mPopularMovieModel=this.mModel
//    }
//
////    @Test
////    fun onUiReady_callShowData(){
////        val lifecycleOwner = Mockito.mock(LifecycleOwner::class.java)
////        val lifecycleRegistry = LifecycleRegistry(lifecycleOwner)
////        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME)
////        Mockito.`when`(lifecycleOwner.lifecycle).thenReturn(lifecycleRegistry)
////
////        mPresenter.onUiReady(lifecycleOwner,0)
////        verify {
////            mView.showData(getDummyDiscoverMovieList())
////        }
////    }
//
//    @Test
//    fun onTapItem_callNavigateToDetail(){
//        mPresenter.onTapItem(0)
//        verify {
//            mView.navigateToDetail(0)
//        }
//    }
//}