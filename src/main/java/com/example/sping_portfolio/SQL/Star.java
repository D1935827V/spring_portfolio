package com.example.sping_portfolio.SQL;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
public class Star {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NonNull
    @Size(min = 2, max = 30, message = "Teacher Name")
    private String Teacher_Name;

    @NonNull
    @Size(min = 1, max = 5, message = "Add a rating")
    private int rating;


    public Star(String name, String store, Integer rating){
        this.Teacher_Name = Teacher_Name;
        this.rating = rating;
    }

}