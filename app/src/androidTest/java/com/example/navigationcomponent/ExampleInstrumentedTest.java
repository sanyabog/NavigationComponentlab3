package com.example.navigationcomponent;

import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {

        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.example.navigationcomponent", appContext.getPackageName());
    }
}
