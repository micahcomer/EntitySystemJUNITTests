package com.example.entitysystem.test;

import android.content.Intent;
import android.test.ActivityUnitTestCase;

import com.mjc.simpleengine.MainActivity;
import com.mjc.tools.GameLoader;

import junit.framework.TestCase;


public class LoaderTest extends ActivityUnitTestCase {

	public LoaderTest(Class activityClass) {
		super(activityClass);
		
	}

	protected void setUp() throws Exception {
		super.setUp();
		Intent mLaunchIntent = new Intent(getInstrumentation().getTargetContext(), MainActivity.class);
        startActivity(mLaunchIntent, null, null);
	}

	public void testLoader(){
		assertTrue(!(GameLoader.loadBitmap(getActivity(), "slash_vertical.png").equals(null)));
	}
	
	
}
