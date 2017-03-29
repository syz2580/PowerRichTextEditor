package com.showeasy.powereditorlib.module.toolbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.HorizontalScrollView;

import com.showeasy.powereditorlib.PEConstants;
import com.showeasy.powereditorlib.R;
import com.showeasy.powereditorlib.listener.ToolbarListener;
import com.showeasy.powereditorlib.span.BoldSpan;
import com.showeasy.powereditorlib.span.Span;
import com.showeasy.powereditorlib.view.CheckableImageView;

/**
 * Created by showeasy on 2017/3/29.
 */

public class DefaultToolbar extends HorizontalScrollView implements IToolbar, View.OnClickListener {

    private static final String TAG_SIZE = "size";
    private static final String TAG_COLOR = "color";
    private static final String TAG_SIMPLE = "simple";

    private ToolbarListener mListener;

    private CheckableImageView mImgBold;
    private CheckableImageView mImgItalic;
    private CheckableImageView mImgUnderline;
    private CheckableImageView mImgFontBg;
    private CheckableImageView mImgBullet;
    private CheckableImageView mImgNumber;

    public DefaultToolbar(Context context) {
        super(context);
        init(context);
    }

    public DefaultToolbar(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public DefaultToolbar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.toolbar_default, this, true);

        //样式
        mImgBold = (CheckableImageView) view.findViewById(R.id.img_bold);
        mImgBold.setTag(TAG_SIMPLE);
        mImgBold.setOnClickListener(this);
        mImgItalic = (CheckableImageView) view.findViewById(R.id.img_italic);
        mImgItalic.setTag(TAG_SIMPLE);
        mImgItalic.setOnClickListener(this);
        mImgUnderline = (CheckableImageView) view.findViewById(R.id.img_underline);
        mImgUnderline.setTag(TAG_SIMPLE);
        mImgUnderline.setOnClickListener(this);
        mImgFontBg = (CheckableImageView) view.findViewById(R.id.img_bg_color);
        mImgFontBg.setTag(TAG_SIMPLE);
        mImgFontBg.setOnClickListener(this);
        mImgBullet = (CheckableImageView) view.findViewById(R.id.img_bullet);
        mImgBullet.setTag(TAG_SIMPLE);
        mImgBullet.setOnClickListener(this);
        mImgNumber = (CheckableImageView) view.findViewById(R.id.img_number);
        mImgNumber.setTag(TAG_SIMPLE);
        mImgNumber.setOnClickListener(this);
    }

    @Override
    public void setToolbarListener(ToolbarListener listener) {
        mListener = listener;
    }

    @Override
    public <V> void onSpanInSelectionChanged(Class<Span<V>> clazz, V value) {

    }

    @Override
    public void onClick(View v) {
        if (v.getTag().equals(TAG_SIMPLE) && v instanceof CheckableImageView) {
            int id = v.getId();
            if (id == R.id.img_bold) {
                if (null != mListener) {
                    mListener.onItemClicked(PEConstants.BOLD, mImgBold.isChecked());
                }
            } else if (id == R.id.img_italic) {
                if (null != mListener) {
                    mListener.onItemClicked(PEConstants.ITALIC, mImgItalic.isChecked());
                }
            } else if (id == R.id.img_underline) {
                if (null != mListener) {
                    mListener.onItemClicked(PEConstants.UNDERLINE, mImgUnderline.isChecked());
                }
            } else if (id == R.id.img_bg_color) {
                if (null != mListener) {
                    mListener.onItemClicked(PEConstants.BGCOLOR, mImgFontBg.isChecked());
                }
            } else if (id == R.id.img_bullet) {
                if (null != mListener) {
                    mListener.onItemClicked(PEConstants.BULLET, mImgBullet.isChecked());
                }
                mImgNumber.setChecked(false);
            } else if (id == R.id.img_number) {
                if (null != mListener) {
                    mListener.onItemClicked(PEConstants.NUMBER, mImgNumber.isChecked());
                }
                mImgBullet.setChecked(false);
            }
        }
    }
}
