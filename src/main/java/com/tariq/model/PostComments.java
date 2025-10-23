package com.tariq.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Table (name = "COMMENTS")
@Entity
@Data
public class PostComments {
    @Id
    private String userId;

    private String userName;

    private String comment;

    private String liked;
    @ElementCollection
    @OneToMany
    private List<PostComments> reply;

}
