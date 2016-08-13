package com.thb.you_me.activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.thb.you_me.R;
import com.thb.you_me.base.BaseActivity;
import com.thb.you_me.base.CommonAdapter;
import com.thb.you_me.base.Test;
import com.thb.you_me.utils.ViewHolder;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRightText("发布").setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "测试", Toast.LENGTH_SHORT).show();
            }
        });
        List<Test> tests = new ArrayList<>();
        Test test1 = new Test();
        test1.setName("1");
        tests.add(test1);
        Test test2 = new Test();
        test2.setName("2");
        tests.add(test2);
        listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(new CommonAdapter<Test>(MainActivity.this,tests,R.layout.item_test) {
            @Override
            public void convert(ViewHolder holder, Test test) {
                holder.setText(R.id.tv,test.getName());
            }
        });
    }

    @Override
    public void requsetData() {

    }
}
