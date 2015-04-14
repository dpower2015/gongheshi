package com.ordering.activity;
//
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * @author Administrator
 *
 */
public class BaseActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
	}
}
