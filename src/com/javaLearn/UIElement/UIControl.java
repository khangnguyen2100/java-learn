package com.javaLearn.UIElement;

public class UIControl {
    private boolean isEnabled = true;

    protected void disable() {
        isEnabled = false;
    }

    private boolean isEnabled() {
        return isEnabled;
    }
}
