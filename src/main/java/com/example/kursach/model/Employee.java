package com.example.kursach.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "second_name")
    private String secondName;
    private String position;
    private Double salary;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "event_id")
    private Event event;

}
