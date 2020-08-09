package com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.uitests

import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.rule.ActivityTestRule
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.R
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.activities.MainActivity
import com.padcmyanmar.padcx.padc_x_themovieapp_mtkm.views.viewholders.MovieViewHolder
import org.junit.Before
import org.junit.Test

class GoToDetailScreen {

    private val activityTestRule = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Before
    fun setUpActivity(){
        activityTestRule.launchActivity(Intent())
    }

    @Test
    fun tapMovieItem_goToDetail(){

        onView(withId(R.id.rv_best_popular))
            .perform(RecyclerViewActions.actionOnItemAtPosition<MovieViewHolder>(1,click()))

        onView(withId(R.id.iv_detail_img)).check(matches(isDisplayed()))
    }
}