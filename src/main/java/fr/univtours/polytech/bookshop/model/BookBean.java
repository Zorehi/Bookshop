package fr.univtours.polytech.bookshop.model;

import java.io.Serializable;

import jakarta.persistence.*;
import jakarta.transaction.TransactionScoped;
import jakarta.xml.bind.annotation.XmlRootElement;

@Entity(name = "BOOK")
@XmlRootElement
public class BookBean implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String author;
    private Float price;
    private String currency;
    @Transient
    private Integer ratings_count;
    @Transient
    private Double ratings_average;
    @Transient
    private Float converted_price;
    @Transient
    private String author_image;
    @Transient
    private String first_sentence;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getRatings_count() {
        return ratings_count;
    }

    public void setRatings_count(Integer ratings_count) {
        this.ratings_count = ratings_count;
    }

    public Double getRatings_average() {
        return ratings_average;
    }

    public void setRatings_average(Double ratings_average) {
        this.ratings_average = ratings_average;
    }

    public Float getConverted_price() { return converted_price; }

    public void setConverted_price(Float converted_price) {this.converted_price = converted_price;}
    public String getAuthor_image() {
        return author_image;
    }

    public void setAuthor_image(String author_image) {
        this.author_image = author_image;
    }

    public String getFirst_sentence() {
        return first_sentence;
    }

    public void setFirst_sentence(String first_sentence) {
        this.first_sentence = first_sentence;
    }
}
