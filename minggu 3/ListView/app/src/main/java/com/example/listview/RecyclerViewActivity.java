package com.example.listview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {
    private MahasiswaAdapter mAdapter;
    private RecyclerView rvMahasiswa;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        addData();

        rvMahasiswa = findViewById(R.id.rv_mahasiswa);

        mAdapter = new MahasiswaAdapter(mahasiswaArrayList);
        rvMahasiswa.setLayoutManager(new LinearLayoutManager(this));
        rvMahasiswa.setAdapter(mAdapter);
    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Fajar", "E41191240", "080000000000"));
        mahasiswaArrayList.add(new Mahasiswa("Zami", "E41194509", "080000000000"));
        mahasiswaArrayList.add(new Mahasiswa("Fahrony", "E41190878", "080000000000"));
        mahasiswaArrayList.add(new Mahasiswa("Nurico", "E41190321", "080000000000"));
        mahasiswaArrayList.add(new Mahasiswa("Ipang", "E41192090", "080000000000"));
        mahasiswaArrayList.add(new Mahasiswa("Tegar", "E41190868", "080000000000"));
        mahasiswaArrayList.add(new Mahasiswa("Rifjan", "E41190860", "080000000000"));

    }
}
