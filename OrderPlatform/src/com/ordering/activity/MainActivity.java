package com.ordering.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.ordering.platform.R;

/**
 * @author ZhengZhiying<br>
 * @function  欢迎页面
 */
public class MainActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				startActivity(new Intent(MainActivity.this, LoginActivity.class));
				finish();
			}
		}, 3000);
	}
}
