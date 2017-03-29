package com.showeasy.powereditorlib;

import com.showeasy.powereditorlib.listener.EditorListener;
import com.showeasy.powereditorlib.listener.ToolbarListener;
import com.showeasy.powereditorlib.module.editor.IEditor;
import com.showeasy.powereditorlib.module.toolbar.IToolbar;

/**
 * Created by showeasy on 2017/3/29.
 */

public class PowerEditor implements ToolbarListener, EditorListener{

    private IEditor mEditor;

    private IToolbar mToolbar;

    public PowerEditor() {

    }

    public PowerEditor(IEditor editor, IToolbar toolbar) {
        setEditor(editor);
        setToolbar(toolbar);
    }

    public void setEditor(IEditor editor) {
        mEditor = editor;
        mEditor.setEditorListener(this);
    }

    public void setToolbar(IToolbar toolbar) {
        mToolbar = toolbar;
        mToolbar.setToolbarListener(this);
    }
}
