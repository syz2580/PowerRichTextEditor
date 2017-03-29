package com.showeasy.powereditorlib.module.toolbar;

import com.showeasy.powereditorlib.listener.ToolbarListener;
import com.showeasy.powereditorlib.span.Span;

/**
 * Created by showeasy on 2017/3/29.
 */

public interface IToolbar {

    public void setToolbarListener(ToolbarListener listener);

    public <V> void onSpanInSelectionChanged(Class<Span<V>> clazz, V value);

}
