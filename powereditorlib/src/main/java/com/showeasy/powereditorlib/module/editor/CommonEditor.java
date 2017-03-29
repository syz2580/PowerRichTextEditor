package com.showeasy.powereditorlib.module.editor;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

import com.showeasy.powereditorlib.listener.EditorListener;

/**
 * Created by showeasy on 2017/3/27.
 */

public class CommonEditor extends EditText implements ISimpleEditor {

    private EditorListener mListener = null;

    public CommonEditor(Context context) {
        super(context);
        init();
    }

    public CommonEditor(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CommonEditor(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {

    }

    @Override
    public void setEditorListener(EditorListener listener) {
        mListener = listener;
    }
}
