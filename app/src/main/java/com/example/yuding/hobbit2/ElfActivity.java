package com.example.yuding.hobbit2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ElfActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);

        ArrayList<Info> infos=new ArrayList<Info>();


        infos.add(new Info("Legolas ","Prince of the Woodland Realm",R.drawable.e0));
        infos.add(new Info("Thranduil ","King of the Elves of the Wood, King of the Woodland Realm",
                R.drawable.e1));
        infos.add(new Info("Tauriel ","Captain of the Mirkwood Elven Guard",R.drawable.e2));
        infos.add(new Info("Galadriel ","Lady of Light, Lady of the Galadhrim, Lady of the Wood",
                R.drawable.e3));
        infos.add(new Info("Elrond ","Lord of Rivendell",R.drawable.e4));
        infos.add(new Info("Elrond ","Queen of the Reunited Kingdom, Lady of Rivendell",R.drawable.e5));



        InfoAdapter infoAdapter=new InfoAdapter(this, infos,R.color.category_elf);

        ListView listView=(ListView)findViewById(R.id.list);

        listView.setAdapter(infoAdapter);
    }
}
