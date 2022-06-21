package com.example.firstproject.entity;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity //db가 해당 객체를 인식가능
@RequiredArgsConstructor //기본 생성자 무시하는 것.
@AllArgsConstructor
@ToString
public class Article {

    @Id //대표값 지정.
    @GeneratedValue //1,2,3 자동생성 어노테이션
    private Long id;

    @Column
    private String title;
    @Column
    private String content;


}
