package com.showeasy.powereditorlib.editor;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by showeasy on 2017/3/27.
 */

public class CommonEditor extends EditText implements IEditor {
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

}
