package com.ordering.fragment;

import java.util.ArrayList;
import java.util.List;

import com.ordering.platform.R;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

/**
 * @author ZhengZhiying<br>
 * @function  左侧菜单页面
 */
public class LeftMenuFragment extends BaseFragment {

	private View view;
	private ListView listView_left;
	private List<Data> datas = new ArrayList<Data>();
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.fragment_left_menu, container, false);
		listView_left = (ListView) view.findViewById(R.id.listView_left);
		for(int i=0;i<8;i++){
			datas.add(new Data(R.drawable.ic_launcher,R.string.title_bar_slide));
		}
		listView_left.setAdapter(new CusAdapter());
		return view;
	}
	
	private class CusAdapter extends BaseAdapter{

		@Override
		public int getCount() {
			return datas.size();
		}

		@Override
		public Object getItem(int position) {
			return datas.get(position);
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			if(convertView == null){
				convertView = LayoutInflater.from(getActivity()).inflate(R.layout.item_left_menu, parent, false);
			}
			return convertView;
		}
	}
	
	private class Data{
		int resDrawable;
		int resTitle;
		
		public Data(int resDrawable, int resTitle) {
			super();
			this.resDrawable = resDrawable;
			this.resTitle = resTitle;
		}
		
	}
	
}
