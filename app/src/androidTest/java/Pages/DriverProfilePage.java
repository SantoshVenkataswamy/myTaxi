package Pages;

import android.support.test.espresso.Espresso;
import com.mytaxi.android_demo.R;
import junit.framework.AssertionFailedError;

import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;
import static android.support.test.espresso.matcher.ViewMatchers.withId;


public class DriverProfilePage extends HomePage {
    // -------------------Call Button----------------------------

    public boolean isCallButtonVisible()
    {
        try {
            Espresso.onView(withId(R.id.fab)).check(matches(isDisplayed()));
        } catch(AssertionFailedError e){
            e.printStackTrace();
        }
        return true;

    }

    public boolean isCallButtonEnabled()
    {
        try {
            Espresso.onView(withId(R.id.fab)).check(matches(isEnabled()));
        } catch(AssertionFailedError e){
            e.printStackTrace();
        }
        return true;
    }

    public void clickCallButton()
    {
        try{
            if (isCallButtonVisible() && isCallButtonEnabled())
            {
                try{
                    Espresso.onView(withId(R.id.fab)).perform(click());

                }catch(Exception e){
                    System.out.println("Unable to click clickCallButton");
                    e.printStackTrace();
                }
            }
            else
            {
                System.out.println("Unable to click clickCallButton ");
            }
        }catch(Exception e){
            System.out.println("Unable to click clickCallButton");
            e.printStackTrace();
        }
    }
}
