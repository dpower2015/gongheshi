package com.ordering.fragment;

import java.util.ArrayList;
import java.util.List;

import com.ordering.platform.R;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * @author ZhengZhiying<br>
 * @function 左侧菜单页面
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
		datas.add(new Data(R.drawable.ic_left_menu_all, R.string.all));
		datas.add(new Data(R.drawable.ic_left_menu_construction, R.string.construction_class));
		datas.add(new Data(R.drawable.ic_left_menu_elec, R.string.electromechanical_class));
		datas.add(new Data(R.drawable.ic_left_menu_wash, R.string.wash_class));
		datas.add(new Data(R.drawable.ic_left_menu_wooden, R.string.wooden_class));
		datas.add(new Data(R.drawable.ic_left_menu_face, R.string.face_class));
		datas.add(new Data(R.drawable.ic_left_menu_light, R.string.light_class));
		datas.add(new Data(R.drawable.ic_left_menu_decorate, R.string.decorate_class));
		listView_left.setAdapter(new CusAdapter());
		return view;
	}

	private class CusAdapter extends BaseAdapter {

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
			ViewHolder holder;
			if (convertView == null) {
				convertView = LayoutInflater.from(getActivity()).inflate(
						R.layout.item_left_menu, parent, false);
				holder = new ViewHolder();
				holder.img_item_icon = (ImageView) convertView
						.findViewById(R.id.img_item_icon);
				holder.txt_item_title = (TextView) convertView
						.findViewById(R.id.txt_item_title);
				convertView.setTag(holder);
			} else {
				holder = (ViewHolder) convertView.getTag();
			}
			holder.img_item_icon
					.setImageResource(datas.get(position).resDrawable);
			holder.txt_item_title.setText(datas.get(position).resTitle);
			return convertView;
		}
	}

	private class Data {
		int resDrawable;
		int resTitle;

		public Data(int resDrawable, int resTitle) {
			super();
			this.resDrawable = resDrawable;
			this.resTitle = resTitle;
		}
	}

	private class ViewHolder {
		ImageView img_item_icon;
		TextView txt_item_title;
	}

}
