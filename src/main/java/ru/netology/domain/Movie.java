package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Movie {
    private int id;
    private String name;
    private String imageUrl;
    private String genre;

public Movie(int i, String numberFive, String s, String horrors) {
    }
}
