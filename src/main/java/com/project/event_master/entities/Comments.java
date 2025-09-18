package com.project.event_master.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "comments")
public class Comments {

    // ATTRIBUTES ------------------------------------------------------------------

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String text;

    @ManyToOne
    private UserEntity author;

    @ManyToOne
    private EventEntity event;

    // DEFAULT CONSTRUCTORS --------------------------------------------------------

    public Comments() {}

    public Comments(Long id, String text, UserEntity author, EventEntity event) {
        this.id = id;
        this.text = text;
        this.author = author;
        this.event = event;
    }

    // GETTERS AND SETTERS ---------------------------------------------------------

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public UserEntity getAuthor() {
        return author;
    }

    public void setAuthor(UserEntity author) {
        this.author = author;
    }

    public EventEntity getEvent() {
        return event;
    }

    public void setEvent(EventEntity event) {
        this.event = event;
    }

    // TO STRING -------------------------------------------------------------------

    @Override
    public String toString() {
        return "Comments [id=" + id + ", text=" + text + ", author=" + author + ", event=" + event + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text, author, event);
    }

    // HASH CODE AND EQUALS --------------------------------------------------------

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Comments other = (Comments) obj;
        return Objects.equals(id, other.id) && Objects.equals(text, other.text) && Objects.equals(author, other.author)
                && Objects.equals(event, other.event);
    }

}