package com.m520it.customview01;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by liulei on 2017/7/12.
 */

public class PathView extends View {
    public PathView(Context context) {
        super(context);
    }

    public PathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = new Path();
        // 直线
        path.lineTo(100, 100);
        // 曲线
        path.quadTo(200, 200, 300, 400);
        // 三阶曲线
        path.rCubicTo(130, 50, 200, 200, 300, 100);
        // 创建一个画笔类
        Paint paint = new Paint();
        paint.setStrokeWidth(10);
        // path的Style未fill时,画不出来path
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawPath(path, paint);
    }
}
