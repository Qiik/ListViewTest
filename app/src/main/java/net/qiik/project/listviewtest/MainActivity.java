package net.qiik.project.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView listView = (RecyclerView) findViewById(R.id.list_view);

        ArrayList<String> data = new ArrayList<>();
        data.add("1asdfghjkl 999");
        data.add("2asdfghjkl 999");
        data.add("3asdfghjkl 999");
        data.add("4asdfghjkl 999");
        data.add("5asdfghjkl 999");
        data.add("6asdfghjkl 999");
        data.add("7asdfghjkl 999");
        data.add("8asdfghjkl 999");
        data.add("9asdfghjkl 999");
        data.add("10asdfghjkl 999");
        data.add("11asdfghjkl 999");
        data.add("12asdfghjkl 999");
        data.add("13asdfghjkl 999");
        data.add("14asdfghjkl 999");
        data.add("15asdfghjkl 999");
        data.add("15asdfghjkl 999");
        data.add("16asdfghjkl 999");
        data.add("17asdfghjkl 999");
        data.add("18asdfghjkl 999");
        data.add("19asdfghjkl 999");
        data.add("20asdfghjkl 999");
        data.add("21asdfghjkl 999");
        data.add("22asdfghjkl 999");
        data.add("23asdfghjkl 999");
        data.add("24asdfghjkl 999");
        data.add("25asdfghjkl 999");
        data.add("26asdfghjkl 999");
        data.add("27asdfghjkl 999");
        data.add("28asdfghjkl 999");
        data.add("29asdfghjkl 999");
        data.add("30asdfghjkl 999");

        MyAdapter myAdapter = new MyAdapter();
        myAdapter.setData(data);
        listView.setAdapter(myAdapter);
    }

    public class MyAdapter extends BaseAdapter{

        private final ArrayList<String> mData = new ArrayList<>();

        public void setData (ArrayList<String> data){
            mData.clear();
            mData.addAll(data);
            notifyDataSetChanged();
        }

        @Override
        public int getCount() {
            return mData.size();
        }

        @Override
        public Object getItem(int position) {
            return mData.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if (convertView == null){
                convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
            }
            ((Button)convertView).setText(getItem(position));
            return convertView;
        }


    }
}
