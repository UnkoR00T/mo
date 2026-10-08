package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* JADX INFO: loaded from: classes.dex */
public class w extends RatingBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f9083a;

    public w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p007NuL.m.J);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i15, int i16) {
        super.onMeasure(i15, i16);
        Bitmap bitmapB = this.f9083a.b();
        if (bitmapB != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmapB.getWidth() * getNumStars(), i15, 0), getMeasuredHeight());
        }
    }

    public w(Context context, AttributeSet attributeSet, int i15) {
        super(context, attributeSet, i15);
        u0.a(this, getContext());
        u uVar = new u(this);
        this.f9083a = uVar;
        uVar.c(attributeSet, i15);
    }
}
