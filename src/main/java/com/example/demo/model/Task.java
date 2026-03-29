package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity 
@Data   
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Title is mandatory") // Khali nahi hona chahiye
    @Size(min = 3, max = 50, message = "Title should be between 3 and 50 characters")
    private String title;

    private String description;
    private boolean completed;

    // Getters and Setters (unhe mat chhedna, wo waise hi rahenge)
}