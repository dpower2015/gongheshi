package com.ordering.activity;

import java.net.ContentHandler;

import com.ordering.platform.R;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * @author ZhengZhiying<br>
 * @function 登录页面
 */
public class LoginActivity extends BaseActivity implements View.OnClickListener{

	private Context context;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		context = this;
		findViewById(R.id.btn_login).setOnClickListener(this);
	}
	
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_login:
			startActivity(new Intent(context,MainFragmentActivity.class));
			finish();
			break;

		default:
			break;
		}
	}
}
