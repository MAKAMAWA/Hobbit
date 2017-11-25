package com.example.yuding.hobbit2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class HobbitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);


        ArrayList<Info> infos=new ArrayList<Info>();


        infos.add(new Info("Bilbo Baggins ","Burglar, Elf-friend, Ring-bearer ",
                R.drawable.h1));
        infos.add(new Info("Frodo Baggins","Deputy Mayor of Michel Delving, Bearer of the One Ring, Elf-friend",
                R.drawable.h2));
        infos.add(new Info("Samwise Gamgee","Mayor of the Shire",R.drawable.h3));
        infos.add(new Info("Peregrin Took","Thain of the Shire, Guard of the Citadel, Knight of Gondor",
                R.drawable.h4));
        infos.add(new Info("Meriadoc Brandybuck","Esquire of Rohan, Master of Buckland",R.drawable.h5));


        Log.i("HobbitActivity","Can you see those Hobbit?");


        InfoAdapter infoAdapter=new InfoAdapter(this, infos,R.color.category_hobbit);

        ListView listView=(ListView)findViewById(R.id.list);

        listView.setAdapter(infoAdapter);

    }



}
