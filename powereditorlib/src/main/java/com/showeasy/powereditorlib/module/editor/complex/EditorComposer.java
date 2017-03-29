package com.showeasy.powereditorlib.module.editor.complex;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

import com.showeasy.powereditorlib.listener.EditorListener;

/**
 * Created by showeasy on 2017/3/27.
 */

public class EditorComposer extends RecyclerView implements IComplexEditor {

    private EditorListener mListener = null;

    public EditorComposer(Context context) {
        super(context);
    }

    public EditorComposer(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public EditorComposer(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public void setEditorListener(EditorListener listener) {
        mListener = listener;
    }
}
