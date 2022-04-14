package com.cos.demoblog.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity     // User클래스가 자동으로 MySQL에 테이블이 생성됨.
public class User {
    @Id // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 프로젝트에서 연결된 DB의 넘버링 전략을 따라간다.
    private int id;     // 시퀀스(Oracle), auto_increment(MySQL)
    private String userName;    // 아이디
    private String password;
    private String email;
    private Timestamp createDate;

}
