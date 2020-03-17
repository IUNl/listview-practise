package com.example.listview_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class InfoActivity extends AppCompatActivity {

    private int position;
    public ImageView img;
    private int[] imagesId={R.drawable.emoji_kids_02,R.drawable.emoji_kids_03,R.drawable.emoji_kids_04,R.drawable.emoji_kids_05,
            R.drawable.emoji_kids_06,R.drawable.emoji_kids_07,R.drawable.emoji_kids_08,R.drawable.emoji_kids_09,
            R.drawable.emoji_kids_10,R.drawable.emoji_kids_11,R.drawable.emoji_kids_12,R.drawable.emoji_kids_13,
            R.drawable.emoji_kids_14,R.drawable.emoji_kids_15,R.drawable.emoji_kids_16,R.drawable.emoji_kids_17,
            R.drawable.emoji_kids_18,R.drawable.emoji_kids_19,R.drawable.emoji_kids_20,R.drawable.emoji_kids_21,
            R.drawable.emoji_kids_22,R.drawable.emoji_kids_23,R.drawable.emoji_kids_24,R.drawable.emoji_kids_25,
            R.drawable.emoji_kids_26,R.drawable.emoji_kids_27,R.drawable.emoji_kids_28,R.drawable.emoji_kids_29,
            R.drawable.emoji_kids_30,R.drawable.emoji_kids_31,R.drawable.emoji_kids_32,R.drawable.emoji_kids_33};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_info );

        Intent intent = getIntent();
        position = intent.getIntExtra( "position",0 );

        img = findViewById( R.id.img );
        img.setImageResource( imagesId[position] );
    }
}
