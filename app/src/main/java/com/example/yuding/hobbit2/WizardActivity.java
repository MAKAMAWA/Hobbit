package com.example.yuding.hobbit2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.yuding.hobbit2.R.id.hobbit;
import static com.example.yuding.hobbit2.R.id.wizard;

public class WizardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_list);

        ArrayList<Info> infos=new ArrayList<Info>();


        infos.add(new Info("Gandalf ","Servant of the Secret Fire, Elf-friend",R.drawable.w0));
        infos.add(new Info("Saruman","Head of the White Council, Lord of Isengard",R.drawable.w1));
        infos.add(new Info("Radagast","The Brown Wizard",R.drawable.w2));
        infos.add(new Info("Alatar and Pallando","The Blue Wizards "));


        InfoAdapter infoAdapter=new InfoAdapter(this, infos,R.color.category_wizard);

        ListView listView=(ListView)findViewById(R.id.list);

        listView.setAdapter(infoAdapter);


    }
}
