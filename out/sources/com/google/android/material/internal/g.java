package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.l0;

/* JADX INFO: loaded from: classes4.dex */
public class g extends l0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f35398r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Rect f35399s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Rect f35400t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f35401v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected boolean f35402w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    boolean f35403x;

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f35398r;
        if (drawable != null) {
            if (this.f35403x) {
                this.f35403x = false;
                Rect rect = this.f35399s;
                Rect rect2 = this.f35400t;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.f35402w) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.f35401v, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f15, float f16) {
        super.drawableHotspotChanged(f15, f16);
        Drawable drawable = this.f35398r;
        if (drawable != null) {
            drawable.setHotspot(f15, f16);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f35398r;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f35398r.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f35398r;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f35401v;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f35398r;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.l0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z15, int i15, int i16, int i17, int i18) {
        super.onLayout(z15, i15, i16, i17, i18);
        this.f35403x = z15 | this.f35403x;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i15, int i16, int i17, int i18) {
        super.onSizeChanged(i15, i16, i17, i18);
        this.f35403x = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f35398r;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f35398r);
            }
            this.f35398r = drawable;
            this.f35403x = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f35401v == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i15) {
        if (this.f35401v != i15) {
            if ((8388615 & i15) == 0) {
                i15 |= 8388611;
            }
            if ((i15 & 112) == 0) {
                i15 |= 48;
            }
            this.f35401v = i15;
            if (i15 == 119 && this.f35398r != null) {
                this.f35398r.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f35398r;
    }

    public g(Context context, AttributeSet attributeSet, int i15) {
        super(context, attributeSet, i15);
        this.f35399s = new Rect();
        this.f35400t = new Rect();
        this.f35401v = 119;
        this.f35402w = true;
        this.f35403x = false;
        TypedArray typedArrayI = n.i(context, attributeSet, ri.l.f174279x1, i15, 0, new int[0]);
        this.f35401v = typedArrayI.getInt(ri.l.f174295z1, this.f35401v);
        Drawable drawable = typedArrayI.getDrawable(ri.l.f174287y1);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f35402w = typedArrayI.getBoolean(ri.l.A1, true);
        typedArrayI.recycle();
    }
}
