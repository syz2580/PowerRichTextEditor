package com.showeasy.powereditorlib.module.toolbar;

import com.showeasy.powereditorlib.listener.ToolbarListener;
import com.showeasy.powereditorlib.span.Span;

/**
 * Created by showeasy on 2017/3/29.
 */

public class DefaultToolbar implements IToolbar {

    private ToolbarListener mListener;

    @Override
    public void setToolbarListener(ToolbarListener listener) {
        mListener = listener;
    }

    @Override
    public <V> void onSpanInSelectionChanged(Class<Span<V>> clazz, V value) {

    }
}
