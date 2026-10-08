package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* JADX INFO: loaded from: classes.dex */
public class y extends SeekBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f9092a;

    public y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p007NuL.m.K);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f9092a.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f9092a.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f9092a.g(canvas);
    }

    public y(Context context, AttributeSet attributeSet, int i15) {
        super(context, attributeSet, i15);
        u0.a(this, getContext());
        z zVar = new z(this);
        this.f9092a = zVar;
        zVar.c(attributeSet, i15);
    }
}
