package com.showeasy.powereditorlib.module.editor;

import com.showeasy.powereditorlib.listener.EditorListener;

/**
 * Created by showeasy on 2017/3/27.
 */

public interface IEditor {

    public int length();

    public void setEditorListener(EditorListener listener);
}
