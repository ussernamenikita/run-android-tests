package com.sromku.sample.runtests.notif;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.sromku.sample.runtests.ClearNotifications;
import com.sromku.sample.runtests.MainActivity;
import com.sromku.sample.runtests.Utils;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NotifOne {

    @Rule
    public IntentsTestRule<MainActivity> mActivity = new IntentsTestRule<>(MainActivity.class);

    @Test
    public void testA() throws Exception {
        Context appContext = InstrumentationRegistry.getTargetContext();
        Utils.sleep(2000);
        assertEquals("com.sromku.sample.runtests", appContext.getPackageName());
        // TODO - send notifications
    }

    @Test
    @ClearNotifications
    public void testB() throws Exception {
        Context appContext = InstrumentationRegistry.getTargetContext();
        Utils.sleep(2000);
        assertEquals("com.sromku.sample.runtests.wrong", appContext.getPackageName());
    }

}
