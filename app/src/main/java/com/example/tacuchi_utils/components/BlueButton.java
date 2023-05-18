package com.example.tacuchi_utils.components;

import android.content.Context;
import android.graphics.Color;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;

public class BlueButton extends AppCompatButton {
    public BlueButton(@NonNull Context context) {
        super(context);

        this.setBackgroundColor(Color.BLUE);

        this.setTextColor(Color.WHITE);
    }
}