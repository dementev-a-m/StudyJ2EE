package ru.adementev.entity;

import javax.persistence.*;

/**
 * Created by Антон Дементьев on 06.09.2017.
 */
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id",nullable = false)
    private long id;
    @Column(name = "title",length = 50,nullable = false)
    private String title;
    @OneToMany
    private Author author;
    @Column(name = "price",length= 20, scale = 2)
    private double price;
    @Column(name = "description", length = 250)
    private String description;
    @Column(name = "number",length = 25)
    private String number;

    public Book() {
    }

    public Book(String title, double price, String description) {
        this.title = title;
        this.price = price;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
