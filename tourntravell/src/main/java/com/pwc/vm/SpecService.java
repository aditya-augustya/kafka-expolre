package com.pwc.vm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.threeten.bp.chrono.Chronology;
import org.threeten.bp.chrono.IsoChronology;

@Service
public class SpecService {


    public String getMatters(){
        System.out.println("I'm called..");
        Chronology chr = IsoChronology.INSTANCE ;


        System.out.println(chr.dateNow());

        return  "app" ;
    }


}
