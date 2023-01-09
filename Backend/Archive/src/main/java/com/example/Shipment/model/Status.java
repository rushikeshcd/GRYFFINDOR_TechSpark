package com.example.Shipment.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Table(name = "Status")
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "status")
    private String status;
//
////    @OneToMany
////    Product product;
//    private Timestamp timestamp;
//
//    public Status(Product product, String status) {
//        super();
//        this.product = product;
//        this.status = status;
////        Timestamp now = LocalDateTime.now();
//    }

    public Status() {

    }
}