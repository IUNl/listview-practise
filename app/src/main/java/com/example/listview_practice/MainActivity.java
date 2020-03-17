package com.example.listview_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int p;
    public TextView tvname;
    public ImageView img;
    private String [] numbers = new String []{"20161707","20161713","20171591","20171592",
            "20171616","20171627","20171641","20171649","20171650","20171653",
            "20171654","20171655","20171656","20171659","20171664","20171666",
            "20171667","20171668","20171669","20171670","20171679","20171688",
            "20171697","20171705","20171707","20171714","20171717","20171731",
            "20171742","20175064","20175980","20175990"};
    private int[] imagesId={R.drawable.emoji_kids_02,R.drawable.emoji_kids_03,R.drawable.emoji_kids_04,R.drawable.emoji_kids_05,
            R.drawable.emoji_kids_06,R.drawable.emoji_kids_07,R.drawable.emoji_kids_08,R.drawable.emoji_kids_09,
            R.drawable.emoji_kids_10,R.drawable.emoji_kids_11,R.drawable.emoji_kids_12,R.drawable.emoji_kids_13,
            R.drawable.emoji_kids_14,R.drawable.emoji_kids_15,R.drawable.emoji_kids_16,R.drawable.emoji_kids_17,
            R.drawable.emoji_kids_18,R.drawable.emoji_kids_19,R.drawable.emoji_kids_20,R.drawable.emoji_kids_21,
            R.drawable.emoji_kids_22,R.drawable.emoji_kids_23,R.drawable.emoji_kids_24,R.drawable.emoji_kids_25,
            R.drawable.emoji_kids_26,R.drawable.emoji_kids_27,R.drawable.emoji_kids_28,R.drawable.emoji_kids_29,
            R.drawable.emoji_kids_30,R.drawable.emoji_kids_31,R.drawable.emoji_kids_32,R.drawable.emoji_kids_33};
    private ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        listview = findViewById( R.id.list_view );
        MyAdapter myAdapter = new MyAdapter();
        listview.setAdapter( myAdapter );

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {

                Intent intent = new Intent();
                intent.putExtra( "position", arg2 );
                intent.setClass(MainActivity.this, InfoActivity.class);
                startActivity(intent);
            }
        });

    }

    private class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return numbers.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position, View convertview, ViewGroup parent) {

            System.out.println( "position:" + position );

            View view = getLayoutInflater().inflate(R.layout.list_item,null);
            tvname = view.findViewById( R.id.tv_list_item );
            img = view.findViewById(R.id.img_list_item);
            //为TextView赋值
            tvname.setText( numbers[position] );
            img.setImageResource( imagesId[position] );

            return view;
        }
    }

}
