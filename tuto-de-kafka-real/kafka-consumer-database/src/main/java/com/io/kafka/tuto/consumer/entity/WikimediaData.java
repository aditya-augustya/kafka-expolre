package com.io.kafka.tuto.consumer.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name  = "WIKIMEDIA_RECENTCHANGE")
@Data
public class WikimediaData {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;

    @Lob
    private String wikiEventData;


}
