package com.m520it.customview01;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by liulei on 2017/7/12.
 */

public class AdvanceCanvasView extends View {
    public AdvanceCanvasView(Context context) {
        super(context);
    }

    public AdvanceCanvasView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setStrokeWidth(5);
        canvas.save();
        canvas.scale(0.5f,0.5f,100,100);
        paint.setColor(Color.RED);
        canvas.drawCircle(100,100,100,paint);
        canvas.restore();
        canvas.drawCircle(100,100,100,paint);
    }
}
