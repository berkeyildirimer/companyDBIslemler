package com.berke.repository;

import com.berke.repository.CalisanRepository;
import com.berke.repository.entity.Calisan;
public class RunnerCalisanRepository {
    public static void main(String[] args) {
        CalisanRepository calisanRepository=new CalisanRepository();
        System.out.println(calisanRepository.save(new Calisan("X_Kral","Tr_X")));
    }
}
