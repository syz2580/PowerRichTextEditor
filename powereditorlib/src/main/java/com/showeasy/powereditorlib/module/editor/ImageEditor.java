package com.showeasy.powereditorlib.module.editor;

import com.showeasy.powereditorlib.listener.EditorListener;

/**
 * Created by showeasy on 2017/3/27.
 */

public class ImageEditor implements ISimpleEditor {

    private EditorListener mListener = null;

    @Override
    public int length() {
        return 0;
    }

    @Override
    public void setEditorListener(EditorListener listener) {
        mListener = listener;
    }
}
