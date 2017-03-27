package com.showeasy.powereditorlib.span;

/**
 * Created by showeasy on 2017/3/27.
 */

public interface Span<V> {

    public Span<V> newSpan(V value);

    public V getValue();

}
