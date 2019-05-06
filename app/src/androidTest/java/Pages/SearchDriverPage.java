package Pages;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.rule.ActivityTestRule;

import com.mytaxi.android_demo.R;
import com.mytaxi.android_demo.activities.MainActivity;

import junit.framework.AssertionFailedError;

import Util.EspressoIdlingResource;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsNot.not;

public class SearchDriverPage extends HomePage {

   // public String searchText;


    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);


    public MainActivity mActivity;


    public void setActivity() {

        mActivity = mActivityRule.getActivity();
    }

    // -------------------SearchDriverAutoComplete Text Box----------------------------

    public boolean isSearchDriverAutoCompleteBoxVisible() {
        try {
            Espresso.onView(withId(R.id.textSearch)).check(matches(isDisplayed()));
        } catch (AssertionFailedError e) {
            e.printStackTrace();
        }
        return true;

    }

    public boolean isSearchDriverAutoCompleteBoxEnabled() {
        try {
            Espresso.onView(withId(R.id.textSearch)).check(matches(isEnabled()));
        } catch (AssertionFailedError e) {
            e.printStackTrace();
        }
        return true;
    }

    public void setSearchDriverAutoComplete(String searchText) {
        try {
            if (isSearchDriverAutoCompleteBoxVisible() && isSearchDriverAutoCompleteBoxEnabled()) {
                try {

                    Espresso.onView(withId(R.id.textSearch)).perform(ViewActions.typeText(searchText));

                } catch (Exception e) {
                    System.out.println("Unable to writeInput in SearchDriverAutoComplete Edit box");
                    e.printStackTrace();
                }
            } else {
                System.out.println("Unable to writeInput in SearchDriverAutoComplete Edit box");
            }
        } catch (Exception e) {
            System.out.println("Unable to writeInput in SearchDriverAutoComplete Edit box");
            e.printStackTrace();
        }
    }

}