package com.ordering.fragment;

import com.ordering.platform.R;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainFragment extends BaseFragment implements View.OnClickListener {

	private View view;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.fragment_main, container, false);
		view.findViewById(R.id.ibtn_home).setOnClickListener(this);
		view.findViewById(R.id.ibtn_brand).setOnClickListener(this);
		view.findViewById(R.id.ibtn_hotsell).setOnClickListener(this);
		view.findViewById(R.id.ibtn_mine).setOnClickListener(this);
		
		getActivity().getSupportFragmentManager()
		.beginTransaction()
		.replace(R.id.content_frame1, new HomeFragment())
		.commit();
		
		return view;
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.ibtn_home:
			getActivity().getSupportFragmentManager()
			.beginTransaction()
			.replace(R.id.content_frame1, new HomeFragment())
			.commit();
			break;
		case R.id.ibtn_brand:
			getActivity().getSupportFragmentManager()
			.beginTransaction()
			.replace(R.id.content_frame1, new BrandFragment())
			.commit();
			break;
		case R.id.ibtn_hotsell:
			getActivity().getSupportFragmentManager()
			.beginTransaction()
			.replace(R.id.content_frame1, new HotSellFragment())
			.commit();
			break;
		case R.id.ibtn_mine:
			getActivity().getSupportFragmentManager()
			.beginTransaction()
			.replace(R.id.content_frame1, new MineFragment())
			.commit();
			break;

		default:
			break;
		}
	}

}
