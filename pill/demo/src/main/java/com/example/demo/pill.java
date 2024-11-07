package com.yourpackage.model;  // 패키지 경로

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name = "pills")  // 데이터베이스의 테이블 이름을 지정
public class Pill {

    @Id  // 기본 키 설정
    @Column(name = "pill_id", nullable = false, unique = true)
    private String pillId;  // 약물 ID (primary key)

    @Column(name = "name", nullable = false)
    private String name;  // 약물 이름

    @Column(name = "description")
    private String description;  // 약물 설명

    @Column(name = "side_effects")
    private String sideEffects;  // 약물 부작용

    // 기본 생성자 (JPA는 기본 생성자가 필요합니다)
    public Pill() {
    }

    // 모든 필드를 포함한 생성자
    public Pill(String pillId, String name, String description, String sideEffects) {
        this.pillId = pillId;
        this.name = name;
        this.description = description;
        this.sideEffects = sideEffects;
    }

    // Getter 및 Setter 메서드
    public String getPillId() {
        return pillId;
    }

    public void setPillId(String pillId) {
        this.pillId = pillId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSideEffects() {
        return sideEffects;
    }

    public void setSideEffects(String sideEffects) {
        this.sideEffects = sideEffects;
    }

    @Override
    public String toString() {
        return "Pill{" +
                "pillId='" + pillId + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", sideEffects='" + sideEffects + '\'' +
                '}';
    }
}
