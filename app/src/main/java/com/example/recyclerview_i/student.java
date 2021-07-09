package com.example.recyclerview_i;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class student extends RecyclerView.ViewHolder {
    private ImageView iv1;
    private ImageView iv2;
    private TextView tva1, tvb1, tvc1,tvA1,tvB1;
    public student( View itemView) {
        super(itemView);
        iniviews();
    }

    private void iniviews() {
        iv1=itemView.findViewById(R.id.iv1);
        iv2=itemView.findViewById(R.id.iv2);
        tva1=itemView.findViewById(R.id.tva);
        tvb1=itemView.findViewById(R.id.tvb);
        tvc1=itemView.findViewById(R.id.tvc);
        tvA1=itemView.findViewById(R.id.tvA);
        tvB1=itemView.findViewById(R.id.tvB);
    }


    public void setData(modelclass modelclass) {
    }
}
