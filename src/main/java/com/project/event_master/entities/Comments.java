package com.project.event_master.entities;

import java.util.Objects;

public class Comments {

    // ATTRIBUTES
    private Long commentsId;
    private String text;
    private UserEntity author;
    private EventEntity event;

    // BUILDER PATTERN
    public static class Builder {
        
        private Long commentsId;
        private String text;
        private UserEntity author;
        private EventEntity event;

        public Builder commentsId(Long commentsId) {
            this.commentsId = commentsId;
            return this;
        }

        public Builder text(String text) {
            this.text = text;
            return this;
        }

        public Builder author(UserEntity author) {
            this.author = author;
            return this;
        }

        public Builder event(EventEntity event) {
            this.event = event;
            return this;
        }

        public Comments build() {
            return new Comments(this);
        }
    }

    // BUILDER CONSTRUCTORS
    private Comments(Builder builder) {
        this.commentsId = builder.commentsId;
        this.text = builder.text;
        this.author = builder.author;
        this.event = builder.event;
    }
    
    // // DEFAULT CONSTRUCTORS
    // public Comments() {}
    // public Comments(Long id, String text, UserEntity author, EventEntity event) {
    //     this.id = id;
    //     this.text = text;
    //     this.author = author;
    //     this.event = event;
    // }

    // GETTERS & SETTERS
    public Long getCommentsId() {
        return commentsId;
    }
    public void setCommentsId(Long id) {
        this.commentsId = id;
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
        return "Comments [id=" + commentsId + ", text=" + text + ", author=" + author + ", event=" + event + "]";
    }

    // HASH CODE & EQUALS
    @Override
    public int hashCode() {
        return Objects.hash(commentsId, text, author, event);
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
        return Objects.equals(commentsId, other.commentsId) && Objects.equals(text, other.text) && Objects.equals(author, other.author)
                && Objects.equals(event, other.event);
    }

}
