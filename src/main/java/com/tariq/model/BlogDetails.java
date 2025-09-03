package com.tariq.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "BLOGS")
public class BlogDetails {
    @Id
    private String id;
    private LocalDate postDate;
    private String content;
    @Column(name = "AUTHOR")
    private String author;
}
