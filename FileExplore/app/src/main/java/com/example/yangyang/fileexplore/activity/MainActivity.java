package com.example.yangyang.fileexplore.activity;

import android.database.DataSetObserver;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.yangyang.fileexplore.R;
import com.example.yangyang.fileexplore.activity.BaseActivity;

public class MainActivity extends BaseActivity {

    private ListView mListView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.file_list) ;
        mListView.setAdapter(null);
    }
    
}
