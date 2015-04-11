package com.ordering.activity;

import android.os.Bundle;

import com.ordering.fragment.MainFragment;
import com.ordering.platform.R;
import com.ordering.slidinglib.BaseSlingActivity;

/**
 * @author ZhengZhiying<br>
 * @function  主页面
 */
public class MainFragmentActivity extends BaseSlingActivity {
	
	public MainFragmentActivity() {
		super(R.string.title_bar_slide);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		getActionBar().hide();
		// set the Above View
		setContentView(R.layout.activity_main_fragment);
		getSupportFragmentManager()
		.beginTransaction()
		.replace(R.id.content_frame, new MainFragment())
		.commit();
		
		setSlidingActionBarEnabled(true);
	}


}
