package com.example.aflkg.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aflkg.DataModel;
import com.example.aflkg.R;
import com.example.aflkg.RecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private TextView txt0, txt1, txt2, txt3, txt4, txt5, txt6, txt7;

    private RecyclerView recyclerView;
    private RecyclerAdapter adapter;
    private List<DataModel> data;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);  // обязательно добавить при создании метода onCreateOptionsMenu
        adapter = new RecyclerAdapter(getContext());
        dataAdd();
    }

    private void dataAdd() {
        DataModel dataModel1 = new DataModel(1,"Жорго", 7,4,2,2,16,16);
        adapter.addItem(dataModel1);
        DataModel dataModel2 = new DataModel(2,"VIP 9999", 7,4,2,2,16,16);
        adapter.addItem(dataModel2);
        DataModel dataModel3 = new DataModel(3,"Пинта", 7,4,2,2,16,16);
        adapter.addItem(dataModel3);
        DataModel dataModel4 = new DataModel(4,"МФК Шоро", 7,4,2,2,16,16);
        adapter.addItem(dataModel4);
        DataModel dataModel5 = new DataModel(5,"Аскона", 7,4,2,2,16,16);
        adapter.addItem(dataModel5);
        DataModel dataModel6 = new DataModel(6,"Ала-Тоо", 7,4,2,2,16,16);
        adapter.addItem(dataModel6);
        DataModel dataModel7 = new DataModel(7,"Кара-Куль", 7,4,2,2,16,16);
        adapter.addItem(dataModel7);
        DataModel dataModel8 = new DataModel(8,"BMG Int", 7,4,2,2,16,16);
        adapter.addItem(dataModel8);
        DataModel dataModel9 = new DataModel(9,"ФК Ак Суу", 7,4,2,2,16,16);
        adapter.addItem(dataModel9);
        DataModel dataModel10 = new DataModel(10,"Ал-Халал", 7,4,2,2,16,16);
        adapter.addItem(dataModel10);
        DataModel dataModel11 = new DataModel(11,"Ал-Халал", 7,4,2,2,16,16);
        adapter.addItem(dataModel11);
        DataModel dataModel12 = new DataModel(12,"Ал-Халал", 7,4,2,2,16,16);
        adapter.addItem(dataModel12);
        DataModel dataModel13 = new DataModel(13,"Ал-Халал", 7,4,2,2,16,16);
        adapter.addItem(dataModel13);
        DataModel dataModel14 = new DataModel(14,"Ал-Халал", 7,4,2,2,16,16);
        adapter.addItem(dataModel14);
        DataModel dataModel15 = new DataModel(15,"Ал-Халал", 7,4,2,2,16,16);
        adapter.addItem(dataModel15);
        DataModel dataModel16 = new DataModel(16,"Ал-Халал", 7,4,2,2,16,16);
        adapter.addItem(dataModel16);
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override // метод для создания меню (три точки)
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.tables_menu, menu);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerViewTables);
        txt0 = view.findViewById(R.id.txtViewNum);
        txt1 = view.findViewById(R.id.txtViewTeams);
        txt2 = view.findViewById(R.id.txtViewGames);
        txt3 = view.findViewById(R.id.txtViewWin);
        txt4 = view.findViewById(R.id.txtViewDraw);
        txt5 = view.findViewById(R.id.txtViewLoss);
        txt6 = view.findViewById(R.id.txtListGoals);
        txt7 = view.findViewById(R.id.txtListPoints);

        initList();
    }

    private void initList() {
        recyclerView.setAdapter(adapter);
    }

}