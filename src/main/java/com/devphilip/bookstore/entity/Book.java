package com.devphilip.bookstore.entity;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;

/**
 * Class to represent book entity.
 *
 * @author philip
 */
@Data
@JsonAutoDetect
public class Book {

    private String isbn;
    private String title;
    private String author;
    private Float price;

}
