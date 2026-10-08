package km;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"AppCompatCustomView"})
public class c extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f111393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f111394b;

    public c(Context context) {
        super(context);
        this.f111393a = 0;
        this.f111394b = 0;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        canvas.translate(this.f111394b / 2, this.f111393a / 2);
        super.draw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i15, int i16) {
        super.onMeasure(i15, i16);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int iMax = Math.max(measuredWidth, measuredHeight);
        if (measuredWidth > measuredHeight) {
            this.f111393a = measuredWidth - measuredHeight;
            this.f111394b = 0;
        } else {
            this.f111393a = 0;
            this.f111394b = measuredHeight - measuredWidth;
        }
        setMeasuredDimension(iMax, iMax);
    }
}
