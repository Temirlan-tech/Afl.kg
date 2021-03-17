package com.example.aflkg;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aflkg.ui.home.HomeFragment;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{

    private List<DataModel> dataList;
    private Context context;

    public RecyclerAdapter(Context context) {
        dataList = new ArrayList<>();
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_recycler,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ViewHolder holder, int position) {
        holder.bind(dataList.get(position));
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public void addItem(DataModel note) {
        dataList.add(note);
        notifyItemInserted(dataList.indexOf(0));
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textView0, textView1, textView2, textView3, textView4, textView5, textView6, textView7;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textView0 = itemView.findViewById(R.id.txtListNum);
            textView1 = itemView.findViewById(R.id.txtListTeams);
            textView2 = itemView.findViewById(R.id.txtListGames);
            textView3 = itemView.findViewById(R.id.txtListWin);
            textView4 = itemView.findViewById(R.id.txtListDraw);
            textView5 = itemView.findViewById(R.id.txtListLoss);
            textView6 = itemView.findViewById(R.id.txtListGoals);
            textView7 = itemView.findViewById(R.id.txtListPoints);
        }

        public void bind(DataModel dataModel) {
            textView0.setText(String.valueOf(dataModel.getNum()));
            textView1.setText(dataModel.getTeam());
            textView2.setText(String.valueOf(dataModel.getGames()));
            textView3.setText(String.valueOf(dataModel.getWin()));
            textView4.setText(String.valueOf(dataModel.getDraw()));
            textView5.setText(String.valueOf(dataModel.getLoss()));
            textView6.setText(String.valueOf(dataModel.getGoals()));
            textView7.setText(String.valueOf(dataModel.getPoints()));
        }
    }
}
