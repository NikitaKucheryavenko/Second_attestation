package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name="answers")
public class Answer extends AuditModel {
    @Id
    @GeneratedValue(generator = "question_generator")
    @SequenceGenerator(name="question_generator", sequenceName = "answer_sequence",initialValue = 1000)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(columnDefinition = "text")
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name="question_id",nullable = false)
    @OnDelete(action= OnDeleteAction.CASCADE) //если удалится родитель вопрос, то и ответы его тоже
    @JsonIgnore
    private Question question;

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

}
