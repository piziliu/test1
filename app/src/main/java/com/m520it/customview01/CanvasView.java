package com.m520it.customview01;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by liulei on 2017/7/12.
 */

public class CanvasView extends View {
    public CanvasView(Context context) {
        super(context);
    }

    public CanvasView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // 创建一个辅助类 确定屏幕的一个区域(左,上,右,下四个参数)
        RectF rectf = new RectF(100, 100, 200, 200);
        // 创建一个画笔类 ,可以设置颜色线条宽度等
        Paint paint = new Paint();
        // 设置字体大小
        paint.setTextSize(60);
        // 画布类-->画椭圆
        canvas.drawOval(rectf, paint);
        canvas.drawText("自定义控件,画布类画文字", 0, 100, paint);
        // Arc 圆弧
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(rectf, 45, 90, false, paint);
        // Bitmap 位图类-->通过位图工厂编码资源获取
        //Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher);
        //canvas.drawBitmap(bitmap,0,0,paint);
        // 也可以  新建一个位图
        Bitmap newBitmap = getBitmap();
    }

    private Bitmap getBitmap() {
        Bitmap bitmap = Bitmap.createBitmap(400, 400, Bitmap.Config.ARGB_8888);
        //使用一个画布类进行绘制修改
        Canvas canvas = new Canvas(bitmap);
        // 创建画笔类
        Paint paint = new Paint();
        // 设置画笔颜色
        paint.setColor(Color.BLUE);
        // 画一个矩形
        canvas.drawRect(0, 0, 100, 100, paint);
        // 设置叠加效果
        paint.setXfermode(new PorterDuffXfermode((PorterDuff.Mode.DST_OUT)));
        paint.setColor(Color.GREEN);
        canvas.drawRect(50, 50, 200, 200, paint);
        return bitmap;
    }
}
