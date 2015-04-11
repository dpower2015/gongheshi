package com.ordering.fragment;

import com.ordering.platform.R;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class MainFragment extends BaseFragment implements View.OnClickListener {

	private View view;
	private ImageButton imgButton;
	private int imgResId;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.fragment_main, container, false);
		view.findViewById(R.id.ibtn_home).setOnClickListener(this);
		view.findViewById(R.id.ibtn_brand).setOnClickListener(this);
		view.findViewById(R.id.ibtn_hotsell).setOnClickListener(this);
		view.findViewById(R.id.ibtn_mine).setOnClickListener(this);
		view.findViewById(R.id.ibtn_home).performClick();
		
		return view;
	}

	@Override
	public void onClick(View v) {
		ImageButton img = null;
		if(imgButton != null){
			imgButton.setImageResource(imgResId);
		}
		switch (v.getId()) {
		case R.id.ibtn_home:
			getActivity().getSupportFragmentManager()
			.beginTransaction()
			.replace(R.id.content_frame1, new HomeFragment())
			.commit();
			img = (ImageButton)view.findViewById(R.id.ibtn_home);
			img.setImageResource(R.drawable.ic_home_on);
			imgResId = R.drawable.ic_home_off;
			break;
		case R.id.ibtn_brand:
			getActivity().getSupportFragmentManager()
			.beginTransaction()
			.replace(R.id.content_frame1, new BrandFragment())
			.commit();
			img = (ImageButton)view.findViewById(R.id.ibtn_brand);
			img.setImageResource(R.drawable.ic_brand_on);
			imgResId = R.drawable.ic_brand_off;
			break;
		case R.id.ibtn_hotsell:
			getActivity().getSupportFragmentManager()
			.beginTransaction()
			.replace(R.id.content_frame1, new HotSellFragment())
			.commit();
			img = (ImageButton)view.findViewById(R.id.ibtn_hotsell);
			img.setImageResource(R.drawable.ic_hotsell_on);
			imgResId = R.drawable.ic_hotsell_off;
			break;
		case R.id.ibtn_mine:
			getActivity().getSupportFragmentManager()
			.beginTransaction()
			.replace(R.id.content_frame1, new MineFragment())
			.commit();
			img = (ImageButton)view.findViewById(R.id.ibtn_mine);
			img.setImageResource(R.drawable.ic_mine_on);
			imgResId = R.drawable.ic_mine_off;
			break;

		default:
			break;
		}
		imgButton = img;
	}

}
