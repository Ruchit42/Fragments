package edu.temple.fragments;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String[] colors_;

    public CustomAdapter(Context context, String[] colors_) {
        this.context = context;
        this.colors_ = colors_;
    }

    @Override
    public int getCount() {
        return colors_.length;
    }

    @Override
    public Object getItem(int position) {
        return colors_[(position)];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView = new TextView(context);
        textView.setPadding(50, 50, 50, 50);
        textView.setTextSize(25);
        if (position == 0) {
            textView.setBackgroundColor(Color.RED);
        } else if (position == 1) {
            textView.setBackgroundColor(Color.BLUE);
        } else if (position == 2) {
            textView.setBackgroundColor(Color.GREEN);
        } else if (position == 3) {
            textView.setBackgroundColor(Color.MAGENTA);
        } else if (position == 4) {
            textView.setBackgroundColor(Color.GRAY);
        } else if (position == 5) {
            textView.setBackgroundColor(Color.WHITE);
        } else if (position == 6) {
            textView.setBackgroundColor(Color.YELLOW);
        } else if (position == 7) {
            textView.setBackgroundColor(Color.CYAN);
        } else if (position == 8) {
            textView.setBackgroundColor(Color.rgb(128, 0, 128));
        }
        textView.setText(getItem(position).toString());

        return textView;
    }
}
