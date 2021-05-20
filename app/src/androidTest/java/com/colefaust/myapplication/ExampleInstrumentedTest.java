package com.colefaust.myapplication;

import android.content.Context;
import android.util.Log;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(Parameterized.class)
public class ExampleInstrumentedTest {

  @Parameterized.Parameters(name = "testbool={0}")
  public static Object[] data() {
    return new Object[] { false, true };
  }

  public ExampleInstrumentedTest(boolean testBool) {
    Log.i("colefaust", "Test bool: "+testBool);
  }

  @Test
  public void useAppContext() {
    // Context of the app under test.
    Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
    assertEquals("com.colefaust.myapplication", appContext.getPackageName());
  }
}
