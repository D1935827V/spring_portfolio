//package com.example.sping_portfolio.SQL;
//
//// https://projectlombok.org/features/all
//
//import lombok.*;
//
//import javax.persistence.*;
//import javax.validation.constraints.Size;
//
///*
//Family Information Class
// */
//@NoArgsConstructor
//@Getter
//@Setter
//@ToString
//@Entity
//public class Star {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    @NonNull
//    @Size(min = 2, max = 30, message = "Name (2 to 30 chars)")
//    private String star;
//
//    /* In JPA the main difference between a OneToOne and a ManyToOne relationship ...
//     a ManyToOne always contains a foreign key from the source object's table
//     a OneToOne relationship the foreign key may either be in the source object's table or the target object's table.
//     */
//    @ManyToOne
//    @JoinColumn(name = "primary_id")    //foreign key is stored in table
//    public Star primary;
//
//}