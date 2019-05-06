package Pages;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;

import com.mytaxi.android_demo.R;

import junit.framework.AssertionFailedError;

import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.isEnabled;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class LoginPage extends HomePage {

     // -------------------UserName Edit Box----------------------------

    public boolean isUserEditBoxVisible()
    {
       try {
           Espresso.onView(withId(R.id.edt_username)).check(matches(isDisplayed()));
       } catch(AssertionFailedError e){
        e.printStackTrace();
       }
        return true;

    }

    public boolean isUserEditBoxEnabled()
    {
        try {
            Espresso.onView(withId(R.id.edt_username)).check(matches(isEnabled()));
        } catch(AssertionFailedError e){
            e.printStackTrace();
        }
        return true;
    }

    public void setUserName(String userName)
    {
        try{
            if (isUserEditBoxVisible() && isUserEditBoxEnabled())
            {
                try{
                    Espresso.onView(withId(R.id.edt_username)).perform(ViewActions.typeText(userName));
                }catch(Exception e){
                    System.out.println("Unable to writeInput in userNameEditBox");
                    e.printStackTrace();
                }
            }
            else
            {
                System.out.println("Unable to write in UserName editBox");
            }
        }catch(Exception e){
            System.out.println("Unable to setUserName");
            e.printStackTrace();
        }
    }

    // -------------------Password Edit Box----------------------------

    public boolean isPasswordEditBoxVisible()
    {
        try {
            Espresso.onView(withId(R.id.edt_password)).check(matches(isDisplayed()));
        } catch(AssertionFailedError e){
            e.printStackTrace();
        }
        return true;

    }

    public boolean isPasswordEditBoxEnabled()
    {
        try {
            Espresso.onView(withId(R.id.edt_password)).check(matches(isEnabled()));
        } catch(AssertionFailedError e){
            e.printStackTrace();
        }
        return true;
    }

    public void setPassword(String password)
    {
        try{
            if (isPasswordEditBoxVisible() && isPasswordEditBoxEnabled())
            {
                try{
                    Espresso.onView(withId(R.id.edt_password)).perform(ViewActions.typeText(password));
                }catch(Exception e){
                    System.out.println("Unable to writeInput in passwordEditBox");
                    e.printStackTrace();
                }
            }
            else
            {
                System.out.println("Unable to write in passwordEditBox ");
            }
        }catch(Exception e){
            System.out.println("Unable to setPassword");
            e.printStackTrace();
        }
    }

    // -------------------Login Button----------------------------

    public boolean isLoginButtonVisible()
    {
        try {
            Espresso.onView(withId(R.id.btn_login)).check(matches(isDisplayed()));
        } catch(AssertionFailedError e){
            e.printStackTrace();
        }
        return true;

    }

    public boolean isLoginButtonEnabled()
    {
        try {
            Espresso.onView(withId(R.id.btn_login)).check(matches(isEnabled()));
        } catch(AssertionFailedError e){
            e.printStackTrace();
        }
        return true;
    }

    public void clickLogin()
    {
        try{
            if (isLoginButtonVisible() && isLoginButtonEnabled())
            {
                try{
                    Espresso.onView(withId(R.id.btn_login)).perform(ViewActions.click());
                    //Espresso.onView(withId(R.id.btn_login)).perform(ViewActions.click());
                }catch(Exception e){
                    System.out.println("Unable to click LoginButton");
                    e.printStackTrace();
                }
            }
            else
            {
                System.out.println("Unable to click LoginButton ");
            }
        }catch(Exception e){
            System.out.println("Unable to click LoginButton");
            e.printStackTrace();
        }
    }



}
