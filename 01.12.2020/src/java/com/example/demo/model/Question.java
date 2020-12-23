package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="questions")
public class Question extends AuditModel{
    @Id
    @GeneratedValue(generator = "question_generator")
    @SequenceGenerator(name="question_generator", sequenceName = "Question_sequence",initialValue = 1000)
    private Long id; //генератор первичного ключа

    @Column(columnDefinition = "text") //еще две колонки
    private String title;

    @Column(columnDefinition = "text")
    private String description;

    public Long getId() {
        return id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
