package com.ordering.fragment;

import com.ordering.platform.R;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MineFragment extends BaseFragment {

	View view;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.fragment_mine, container,false);
		TextView textView1 = (TextView) view.findViewById(R.id.textView1);
		textView1.setText("我的");
//		view = inflater.inflate(R.layout.fragment_home, container,false);
		//TextView textView1 = (TextView) view.findViewById(R.id.textView1);
		//textView1.setText("我的");
		return view;
	}
}
