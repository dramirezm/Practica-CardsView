package com.facebook_login.diegoramirez.cardsview;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {

    private List<RowItem> rowItems;

    private static Integer[] images =
    {
            R.drawable.germany,
            R.drawable.usa,
            R.drawable.germany,
            R.drawable.usa,
            R.drawable.germany,
            R.drawable.usa,
            R.drawable.germany,
            R.drawable.usa
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Intialize and set the Action Bar Background to Holo Blue
        ActionBar actionBar = getActionBar();

        ListView lv = (ListView) findViewById(R.id.lista);
        rowItems = new ArrayList<>();

        final String[] titles = {"Imagen1","Imagen2","Imagen3","Imagen4","Imagen5","Imagen6","Imagen7","Imagen8"};
        String[] descriptions = {"Descripcion 1","Descripcion 2","Descripcion 3","Descripcion 4","Descripcion 5",
                "Descripcion 6","Descripcion 7","Descripcion 8"};

        //Llena la lista
        for (int i = 0; i < titles.length; i++)
        {
            RowItem item = new RowItem(images[i], titles[i], descriptions[i]);
            rowItems.add(item);
        }

        // Coloca el array en el adapter
        adaptador adapter = new adaptador(getApplicationContext(), R.layout.cards, rowItems);
        lv.setAdapter(adapter);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                MensajeToast("se Presiono la imagen " + titles[position]);
            }
        });

        lv.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                MensajeToast("Mensaje Largo ");
                return true;
            }
        });
    }


    public void MensajeToast(String mensaje)
    {
        Toast.makeText(getApplicationContext(),mensaje,Toast.LENGTH_SHORT).show();
    }

}
