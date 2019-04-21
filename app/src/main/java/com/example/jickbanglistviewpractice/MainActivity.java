package com.example.jickbanglistviewpractice;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.jickbanglistviewpractice.Adapter.RoomAdapter;
import com.example.jickbanglistviewpractice.RoomModel.RoomM;
import com.example.jickbanglistviewpractice.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding atc;
    List<RoomM> appList = new ArrayList<RoomM>();

    RoomAdapter mAppData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        atc = DataBindingUtil.setContentView(this,R.layout.activity_main);

        roomList();

        mAppData = new RoomAdapter(MainActivity.this, appList);
        atc.addListItem.setAdapter(mAppData);
    }

    void roomList() {
        appList.add(new RoomM("100/13", "걍븍", "ㅇㅇㅇ"));
        appList.add(new RoomM("100/15", "걍븍", "ㅇㅇㅇ"));
        appList.add(new RoomM("100/16", "걍븍", "ㅇㅇㅇ"));
        appList.add(new RoomM("100/17", "걍븍", "ㅇㅇㅇ"));
        appList.add(new RoomM("100/5", "걍븍", "ㅇㅇㅇ"));
    }
}
