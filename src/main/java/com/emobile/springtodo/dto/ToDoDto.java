//package com.emobile.springtodo.dto;
//
//import jakarta.validation.constraints.NotBlank;
//import jakarta.validation.constraints.Size;
//
//import java.io.Serializable;
//
//public class ToDoDto implements Serializable {
//    private static final long serialVersionUID = 1L;
//
//    private Long id;
//
//    @NotBlank(message = "Title is mandatory")
//    @Size(max = 100, message = "Title must not exceed 100 characters")
//    private String title;
//
//    @Size(max = 500, message = "Description must not exceed 500 characters")
//    private String description;
//
//    private boolean completed; // был Boolean
//
//    public ToDoDto() {
//    }
//
//    public ToDoDto(Long id, String title, String description, boolean completed) {
//        this.id = id;
//        this.title = title;
//        this.description = description;
//        this.completed = completed;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public boolean isCompleted() {
//        return completed;
//    }
//
//    public void setCompleted(boolean completed) {
//        this.completed = completed;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//}
package com.emobile.springtodo.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import java.io.Serializable;

public class ToDoDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    @NotBlank(message = "Title is mandatory")
    @Size(max = 100, message = "Title must not exceed 100 characters")
    private String title;

    @Size(max = 500, message = "Description must not exceed 500 characters")
    private String description;

    private Boolean completed;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Boolean getCompleted() { return completed; }
    public void setCompleted(Boolean completed) { this.completed = completed; }
}

