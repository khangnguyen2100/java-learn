package com.javaLearn.UIElement;

public class TextBox extends UIControl {
    private String text;

    public void setText(String newText) {
        this.text = newText;
    }

    public String getText() {
        return this.text;
    }

    public void clearText(String newText) {
        this.text = "";
    }

    public long limit;
    public long length;
    public boolean isFocused;
}
