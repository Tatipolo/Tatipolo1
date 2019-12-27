package com.company;

public enum Color {
    RED("rgb (255,0,0)"),
    GREEN("rgb (0,255,0)"),
    BLACK("rgb (0,0,0)" );
    private String value;

    Color(String color) {   // только приватный конструктор
        this.value = color;

    }

    public String getValue() {
        return this.value;
    }

}
