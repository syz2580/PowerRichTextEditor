package com.showeasy.powereditorlib.listener;

import com.showeasy.powereditorlib.span.Span;

/**
 * Created by showeasy on 2017/3/29.
 */

public interface ToolbarListener {

    public <V> void onItemClicked(Span<V> span, V value);

}
