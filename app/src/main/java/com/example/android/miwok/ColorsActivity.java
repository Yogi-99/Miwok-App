package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        words.add(new Word("red", "ede", R.drawable.color_red));

        words.add(new Word("green", "eta", R.drawable.color_green));

        words.add(new Word("brown", "angsi", R.drawable.color_brown));

        words.add(new Word("gray", "tune", R.drawable.color_gray));

        words.add(new Word("black", "taachi", R.drawable.color_black));

        words.add(new Word("white", "chalitti", R.drawable.color_white));

        words.add(new Word("dusty yellow", "tete", R.drawable.color_dusty_yellow));

        words.add(new Word("mustard yellow", "chiwiite", R.drawable.color_mustard_yellow));


        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
