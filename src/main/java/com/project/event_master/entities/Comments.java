package com.project.event_master.entities;

public class Comments {

    // ATTRIBUTES
    Long id;
    String text;
    UserEntity author;
    EventEntity event;
    
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
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((text == null) ? 0 : text.hashCode());
        result = prime * result + ((author == null) ? 0 : author.hashCode());
        result = prime * result + ((event == null) ? 0 : event.hashCode());
        return result;
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
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (text == null) {
            if (other.text != null)
                return false;
        } else if (!text.equals(other.text))
            return false;
        if (author == null) {
            if (other.author != null)
                return false;
        } else if (!author.equals(other.author))
            return false;
        if (event == null) {
            if (other.event != null)
                return false;
        } else if (!event.equals(other.event))
            return false;
        return true;
    }
    
}
