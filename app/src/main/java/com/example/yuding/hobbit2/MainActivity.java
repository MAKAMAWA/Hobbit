package com.example.yuding.hobbit2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //Hobbit
        TextView hobbit =(TextView)findViewById(R.id.hobbit);

        hobbit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent hobbitIntent=new Intent(MainActivity.this,HobbitActivity.class);

                startActivity(hobbitIntent);
            }
        });

        //Wizard
        TextView wizard=(TextView)findViewById(R.id.wizard);

        wizard.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent wizardIntent=new Intent(MainActivity.this, WizardActivity.class);
                startActivity(wizardIntent);
            }
        });


        //Elf
        final TextView elf=(TextView)findViewById(R.id.elf);

        elf.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent elfIntent=new Intent(MainActivity.this,ElfActivity.class);
                startActivity(elfIntent);
            }
        });

        //Dwarf
        TextView dwarf =(TextView)findViewById(R.id.dwarf);

        dwarf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dwarfIntent=new Intent(MainActivity.this,DwarfActivity.class);
                startActivity(dwarfIntent);
            }
        });

        //Galley
        final TextView galley=(TextView)findViewById(R.id.galley);

        galley.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent galleyIntent=new Intent(MainActivity.this,GalleryActivity.class);
                startActivity(galleyIntent);
            }
        });
    }



}
