package com.mytaxi.android_demo;


import android.support.test.espresso.Espresso;

import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;



import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import Pages.DriverProfilePage;
import Pages.LoginPage;
import Pages.SearchDriverPage;
import Util.FKConstants;


import static android.support.test.espresso.matcher.ViewMatchers.isRoot;



@RunWith(AndroidJUnit4.class)

@LargeTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class CallDriver extends BaseTest{



    // Input Data
/*    private String userName="crazydog335";
    private String passWord="venture";
    private String autoComp="sa";
    private String searchText="Sarah Scott";*/


    // Page Initialization
    LoginPage lPage;
    SearchDriverPage sPage;
    DriverProfilePage dpPage;





    @Test
    public void CallDriverTest() throws InterruptedException {


        lPage = new LoginPage();
        sPage = new SearchDriverPage();
        dpPage = new DriverProfilePage();

        //---login page----//
        lPage.setUserName(FKConstants.userName);
        lPage.setPassword(FKConstants.passWord);
        lPage.clickLogin();

        //---SearchDriver Page---//
        //Espresso.registerIdlingResources(mActivityRule.getActivity().getIdlingResourceInTest());
        Espresso.onView(isRoot()).perform(waitFor(5000));
        //EspressoIdlingResource.increment();
        sPage.setSearchDriverAutoComplete(FKConstants.autoComp);
        //EspressoIdlingResource.decrement();
        Espresso.onView(isRoot()).perform(waitFor(2000));
        tapOnSuggestion(FKConstants.searchText);

        //---Driver Profile Page---//
        dpPage.clickCallButton();
    }
}
