package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.DiscoverVO
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.data.vos.GenreMovieVO
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.fragments.GenreMovieFragment

class DynamicViewPagerAdapter(fm: FragmentManager, var list:List<GenreMovieVO>) : FragmentStatePagerAdapter(fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {


    override fun getItem(position: Int): Fragment {
        return GenreMovieFragment.newInstance(list[position].id)
    }

    override fun getCount(): Int {
        return list.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return list[position].name
    }
}