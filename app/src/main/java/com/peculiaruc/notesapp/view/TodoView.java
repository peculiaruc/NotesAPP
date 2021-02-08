package com.peculiaruc.notesapp.view;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

public class TodoView extends ConstraintLayout {
    public TodoView(@NonNull Context context) {
        super(context);
    }

    public TodoView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TodoView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public TodoView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
