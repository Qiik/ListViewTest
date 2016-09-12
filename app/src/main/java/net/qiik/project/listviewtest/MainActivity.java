package net.qiik.project.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import by.itacademy.listviewtest.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView listView = (RecyclerView) findViewById(R.id.list_view);
        listView.setLayoutManager(new GridLayoutManager(this, 3));
        listView.setHasFixedSize(true);

        ArrayList<String> data = new ArrayList<>();
        data.add("1zsdgshdfksb jd");
        data.add("2zsdgshdfksb jd");
        data.add("3zsdgshdfksb jd");
        data.add("4zsdgshdfksb jd");
        data.add("5zsdgshdfksb jd");
        data.add("6zsdgshdfksb jd");
        data.add("7zsdgshdfksb jd");
        data.add("8zsdgshdfksb jd");
        data.add("9zsdgshdfksb jd");
        data.add("10zsdgshdfksb jd");
        data.add("11zsdgshdfksb jd");
        data.add("12zsdgshdfksb jd");
        data.add("13zsdgshdfksb jd");
        data.add("14zsdgshdfksb jd");
        data.add("9zsdgshdfksb jd");
        data.add("10zsdgshdfksb jd");
        data.add("11zsdgshdfksb jd");
        data.add("12zsdgshdfksb jd");
        data.add("13zsdgshdfksb jd");
        data.add("14zsdgshdfksb jd");

        net.qiik.project.listviewtest.MainActivity.MyAdapter myAdapter = new net.qiik.project.listviewtest.MainActivity.MyAdapter();
        myAdapter.setData(data);

        net.qiik.project.listviewtest.MainActivity.MyRecyclerAdapter myRecyclerAdapter = new net.qiik.project.listviewtest.MainActivity.MyRecyclerAdapter();
        myRecyclerAdapter.setData(data);
        listView.setAdapter(myRecyclerAdapter);
    }

    public class MyAdapter extends BaseAdapter {

        private final ArrayList<String> mData = new ArrayList<>();

        public void setData(ArrayList<String> data) {
            mData.clear();
            mData.addAll(data);
            notifyDataSetChanged();
        }

        @Override
        public int getCount() {
            return mData.size();
        }

        @Override
        public String getItem(int position) {
            return mData.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            net.qiik.project.listviewtest.MainActivity.ViewHolder holder;
            if (convertView == null) {
                convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
                holder = new net.qiik.project.listviewtest.MainActivity.ViewHolder();
                holder.mainTextView = (TextView) convertView.findViewById(R.id.main_text);
                convertView.setTag(holder);
            } else {
                holder = (net.qiik.project.listviewtest.MainActivity.ViewHolder) convertView.getTag();
            }

            holder.mainTextView.setText(getItem(position));

            return convertView;
        }
    }

    private static class ViewHolder {
        TextView mainTextView;
    }

    private static class RecyclerViewHolder extends RecyclerView.ViewHolder {
        final TextView mainTextView;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            mainTextView = (TextView) itemView.findViewById(R.id.main_text);
        }
    }

    public class MyRecyclerAdapter extends RecyclerView.Adapter<net.qiik.project.listviewtest.MainActivity.RecyclerViewHolder> {

        private final ArrayList<String> mData = new ArrayList<>();

        @Override
        public net.qiik.project.listviewtest.MainActivity.RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            return new net.qiik.project.listviewtest.MainActivity.RecyclerViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false));
        }

        @Override
        public void onBindViewHolder(net.qiik.project.listviewtest.MainActivity.RecyclerViewHolder holder, int position) {
            holder.mainTextView.setText(mData.get(position));
        }

        @Override
        public int getItemCount() {
            return mData.size();
        }

        public void setData(ArrayList<String> data) {
            mData.clear();
            mData.addAll(data);
            notifyDataSetChanged();
        }
    }
}