package cn.edu.gdmec.s07131018.canvas1;

import android.R.color;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class MyView extends View {

	public MyView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	protected void onDraw(Canvas canvas){
		super.onDraw(canvas);
		canvas.drawColor(Color.DKGRAY);
		Paint paint = new Paint();
		paint.setColor(Color.BLACK);
		canvas.drawCircle(100, 100, 50, paint);
		paint.setColor(Color.GREEN);
		paint.setStrokeWidth(10);
		canvas.drawRect(new Rect(100, 200, 200, 200), paint);
		paint.setTextSize(40);
		paint.setColor(Color.BLUE);
		canvas.drawText("Hello World", 300, 300, paint);
	}
}
