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

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    //绘制一些简单的形状

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // 画圆
        // 创建一个画笔类
        Paint paint = new Paint();
        // 给画笔设置颜色
        paint.setColor(Color.RED);
        // 设置抗锯齿效果
        paint.setAntiAlias(true);
        // 设置透明度
        paint.setAlpha(10);
        // 设置样式
        paint.setStyle(Paint.Style.STROKE);
        //设置边的宽度,笔划宽度
        paint.setStrokeWidth(10);
        // 通过画布类画圆
        canvas.drawCircle(250,250,200,paint);
    }
}
