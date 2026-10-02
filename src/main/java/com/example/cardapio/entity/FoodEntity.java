package com.example.cardapio.entity;

@Table(name = "foods")
@Entity(name = "foods")
public class FoodEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;
}
