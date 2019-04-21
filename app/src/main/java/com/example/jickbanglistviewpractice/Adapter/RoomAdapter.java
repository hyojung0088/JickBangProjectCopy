package com.example.jickbanglistviewpractice.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.jickbanglistviewpractice.R;
import com.example.jickbanglistviewpractice.RoomModel.RoomM;

import org.w3c.dom.Text;

import java.util.List;

public class RoomAdapter extends ArrayAdapter<RoomM> {

    Context mContext;
    List<RoomM> mList;
    LayoutInflater inf;

    public RoomAdapter(Context context, List<RoomM> list) {
        super(context, R.layout.room_list_item, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @Override
    public View getView(int position, View ConvertView, ViewGroup parent) {
        View row = ConvertView;

        if (row == null) {
            row = inf.inflate(R.layout.room_list_item, null);
        }

        RoomM appData = mList.get(position);
        TextView priceTxt = row.findViewById(R.id.priceTxt);

        priceTxt.setText(appData.price);

        //TextView priceTxt = row.p
        //TextView rankAndTitleText = row.findViewById(R.id.id.rankAndTitleText);
        //TextView companyText = row.findViewById(R.id.companyText);

        //rankAndTitleText.setText(String.format("%d. %s", appData.rank, appData.title));
        //companyText.setText(appData.companyName);

        return  row;
    }
}
