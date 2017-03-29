package com.showeasy.powereditorlib.listener;

import com.showeasy.powereditorlib.span.Span;

/**
 * Created by showeasy on 2017/3/29.
 */

public interface ToolbarListener {

    public <V> void onItemClicked(Class<V> spanClazz, V value);

}
