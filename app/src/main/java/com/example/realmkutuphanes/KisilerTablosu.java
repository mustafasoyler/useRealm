package com.example.realmkutuphanes;

import io.realm.RealmObject;
import io.realm.annotations.RealmClass;

@RealmClass
public class KisilerTablosu extends RealmObject {

    private String kisiIsmi;
    private String soyisim;
    private Integer maas;
    private Integer yas;

    public String getKisiIsmi() {
        return kisiIsmi;
    }

    public void setKisiIsmi(String kisiIsmi) {
        this.kisiIsmi = kisiIsmi;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public Integer getMaas() {
        return maas;
    }

    public void setMaas(Integer maas) {
        this.maas = maas;
    }

    public Integer getYas() {
        return yas;
    }

    public void setYas(Integer yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "KisilerTablosu{" +
                "kisiIsmi='" + kisiIsmi + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", maas=" + maas +
                ", yas=" + yas +
                '}';
    }
}
