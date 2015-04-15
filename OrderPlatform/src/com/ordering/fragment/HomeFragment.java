package com.ordering.fragment;

import com.ordering.adapter.BussinessGridViewAdapter;
import com.ordering.platform.R;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

public class HomeFragment extends BaseFragment {

	private View view;
	private GridView mBussinesList;
	private BussinessGridViewAdapter mBussinesListAdapter;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.fragment_home, container,false);
		mBussinesList=(GridView)view.findViewById(R.id.merchant_list);
		mBussinesListAdapter=new BussinessGridViewAdapter(getActivity());
		mBussinesList.setAdapter(mBussinesListAdapter);
		return view;
	}
}
