package com.example.realmkutuphanes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import io.realm.Realm;
import io.realm.RealmResults;

public class MainActivity extends AppCompatActivity {
    Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        tabloyaEkle();
        goster();
    }

    public void tanimla() {
        realm = Realm.getDefaultInstance();
    }

    public void tabloyaEkle() {
        realm.beginTransaction();

        KisilerTablosu kisilerTablosu = realm.createObject(KisilerTablosu.class);
        kisilerTablosu.setKisiIsmi("Mustafa");
        kisilerTablosu.setSoyisim("Söyler");
        kisilerTablosu.setMaas(5000);
        kisilerTablosu.setYas(22);

        realm.commitTransaction();


    }
    public void goster(){
        realm.beginTransaction();

        RealmResults<KisilerTablosu> sonuc =realm.where(KisilerTablosu.class).findAll();
        for(KisilerTablosu k : sonuc)
        {
            Log.i("çıktı",k.toString());
        }



        realm.commitTransaction();


    }
}
