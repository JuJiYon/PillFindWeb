package com.example.model;

import javax.persistence.*;

@Entity
@Table(name = "drug_info")  
public class drug_info {

    @Id  // 기본 키 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // 자동 증가 설정
    @Column(name = "drug_num", nullable = false, unique = true)
    private int drugNum;  // 약물 ID (primary key)

    @Column(name = "drug_name", nullable = false)
    private String drugName;  // 약물 이름

    @Column(name = "formulation_num")
    private int formulationNum;  // 제형 번호

    @Column(name = "formulation")
    private String formulation;  // 제형

    @Column(name = "shape_num")
    private int shapeNum;  // 모양 번호

    @Column(name = "shape")
    private String shape;  // 모양

    @Column(name = "color_num")
    private int colorNum;  // 색상 번호

    @Column(name = "color")
    private String color;  // 색상

    @Column(name = "separating_line_num")
    private int separatingLineNum;  // 구분선 번호

    @Column(name = "separating_line")
    private String separatingLine;  // 구분선

    @Column(name = "efficiency", columnDefinition = "TEXT")
    private String efficiency;  // 효능

    @Column(name = "caution", columnDefinition = "TEXT")
    private String caution;  // 주의사항

    @Lob
    @Column(name = "image")
    private byte[] image;  // 약물 이미지 (BLOB 타입)

    // 기본 생성자
    public Pill() {}

    // Getter 및 Setter
    public int getDrugNum() {
        return drugNum;
    }

    public void setDrugNum(int drugNum) {
        this.drugNum = drugNum;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public int getFormulationNum() {
        return formulationNum;
    }

    public void setFormulationNum(int formulationNum) {
        this.formulationNum = formulationNum;
    }

    public String getFormulation() {
        return formulation;
    }

    public void setFormulation(String formulation) {
        this.formulation = formulation;
    }

    public int getShapeNum() {
        return shapeNum;
    }

    public void setShapeNum(int shapeNum) {
        this.shapeNum = shapeNum;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getColorNum() {
        return colorNum;
    }

    public void setColorNum(int colorNum) {
        this.colorNum = colorNum;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSeparatingLineNum() {
        return separatingLineNum;
    }

    public void setSeparatingLineNum(int separatingLineNum) {
        this.separatingLineNum = separatingLineNum;
    }

    public String getSeparatingLine() {
        return separatingLine;
    }

    public void setSeparatingLine(String separatingLine) {
        this.separatingLine = separatingLine;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

    public String getCaution() {
        return caution;
    }

    public void setCaution(String caution) {
        this.caution = caution;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
}


   

