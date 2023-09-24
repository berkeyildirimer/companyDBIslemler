package com.berke.repository;

import com.berke.repository.entity.Calisan;

public class CalisanRepository implements ICrud<Calisan> {

    private ConnectionProvider connectionProvider;

    public CalisanRepository() {
        this.connectionProvider = new ConnectionProvider();
    }

    @Override
    public boolean save(Calisan calisan) {
        //    //INSERT INTO tblcalisan (ad, soyad) VALUES ('X_Kral','TR_X')
        String sqlSaveQuery = "INSERT INTO tblcalisan (ad, soyad) VALUES ('"
                +calisan.getAd()+ "','"
                +calisan.getSoyad()+ "' )";
        return connectionProvider.executeUpdate(sqlSaveQuery);
    }
}
