package com.ordering.activity;

import com.ordering.platform.R;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * @author ZhengZhiying<br>
 * @function 	 注册界面
 */
public class RegisterActivity extends BaseActivity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		findViewById(R.id.ibtn_back).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.ibtn_back:
			finish();
			break;

		default:
			break;
		}
	}
}
