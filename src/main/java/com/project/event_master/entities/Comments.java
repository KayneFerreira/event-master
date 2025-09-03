package com.project.event_master.entities;

import java.util.Objects;

public class Comments {

    // ATTRIBUTES
    private Long id;
    private String text;
    private UserEntity author;
    private EventEntity event;
    
    // CONSTRUCTORS
    public Comments() {}
    public Comments(Long id, String text, UserEntity author, EventEntity event) {
        this.id = id;
        this.text = text;
        this.author = author;
        this.event = event;
    }

    // GETTERS & SETTERS
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

    // TO STRING
    @Override
    public String toString() {
        return "Comments [id=" + id + ", text=" + text + ", author=" + author + ", event=" + event + "]";
    }

    // HASH CODE & EQUALS
    @Override
    public int hashCode() {
        return Objects.hash(id, text, author, event);
    }
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
