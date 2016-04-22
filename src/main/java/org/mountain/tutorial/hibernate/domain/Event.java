package org.mountain.tutorial.hibernate.domain;


import java.util.Date;

/**
 * @author yubo
 */
public class Event {

    public Event() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    private Long id;
    private String title;
    private Date date;
}
