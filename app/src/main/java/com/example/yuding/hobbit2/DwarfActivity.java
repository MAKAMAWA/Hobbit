package com.example.yuding.hobbit2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class DwarfActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);

        ArrayList<Info> infos=new ArrayList<Info>();


        infos.add(new Info("Thorin Oakenshield ","King of Durin's Folk, King under the Mountain ",
                R.drawable.t0));
        infos.add(new Info("Kili ","He wore a blue hood and grew a yellow beard.",
                R.drawable.t1));
        infos.add(new Info("Dain ","Second cousin to Thorin",R.drawable.t2));
        infos.add(new Info("Fili ","He wore a blue hood and grew a yellow beard.",
                R.drawable.t3));
        infos.add(new Info("Bofur ","He wore a yellow hood and played clarinet.",R.drawable.t4));
        infos.add(new Info("Dwalin ","He wore a dark green hood and a golden belt.",R.drawable.t5));
        infos.add(new Info("Balin ","He wore a red hood and had a white beard.",R.drawable.t6));
        infos.add(new Info("Nori ","He wore a purple hood.",R.drawable.t7));
        infos.add(new Info("Bombur ","He wore a pale green hood.",R.drawable.t8));
        infos.add(new Info("Bifur ","He wore a yellow hood and played clarinet.",R.drawable.t9));
        infos.add(new Info("Ori ","He wore a grey hood.",R.drawable.t10));
        infos.add(new Info("Dori ","He wore a purple hood.",R.drawable.t11));
        infos.add(new Info("Oin ","He wore a brown hood.",R.drawable.t12));
        infos.add(new Info("Gloin ","He wore a white hood.",R.drawable.t13));


        InfoAdapter infoAdapter=new InfoAdapter(this, infos,R.color.category_dwarf);

        ListView listView=(ListView)findViewById(R.id.list);

        listView.setAdapter(infoAdapter);
    }
}
