package com.vincent.samplematerial.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.vincent.samplematerial.R;
import com.vincent.samplematerial.bean.OldMan;

import java.util.List;

/**
 * Created by Administrator on 2015/1/6.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private List<OldMan> oldMans;

    public RecyclerAdapter(List<OldMan> oldMans) {
        this.oldMans = oldMans;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = View.inflate(viewGroup.getContext(),R.layout.item_recycler,null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        OldMan oldMan = oldMans.get(i);
        viewHolder.imageView.setImageResource(oldMan.getAvatar());
        viewHolder.textView.setText(oldMan.getName());
    }

    @Override
    public int getItemCount() {
        return oldMans.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        private final ImageView imageView;
        private final TextView textView;
        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.imageView);
            textView = (TextView) itemView.findViewById(R.id.textView);
        }
    }
}
