package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.internal.n;
import ij.c;
import lj.h;
import ri.b;
import ri.d;
import ri.k;
import ri.l;
import u5.a;

/* JADX INFO: loaded from: classes4.dex */
public class MaterialDivider extends View {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f35220f = k.f174092z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f35221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f35222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f35223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f35224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f35225e;

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.f173924s);
    }

    public int getDividerColor() {
        return this.f35223c;
    }

    public int getDividerInsetEnd() {
        return this.f35225e;
    }

    public int getDividerInsetStart() {
        return this.f35224d;
    }

    public int getDividerThickness() {
        return this.f35222b;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        int i15;
        super.onDraw(canvas);
        boolean z15 = getLayoutDirection() == 1;
        int i16 = z15 ? this.f35225e : this.f35224d;
        if (z15) {
            width = getWidth();
            i15 = this.f35224d;
        } else {
            width = getWidth();
            i15 = this.f35225e;
        }
        this.f35221a.setBounds(i16, 0, width - i15, getBottom() - getTop());
        this.f35221a.draw(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i15, int i16) {
        super.onMeasure(i15, i16);
        int mode = View.MeasureSpec.getMode(i16);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i17 = this.f35222b;
            if (i17 > 0 && measuredHeight != i17) {
                measuredHeight = i17;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    public void setDividerColor(int i15) {
        if (this.f35223c != i15) {
            this.f35223c = i15;
            this.f35221a.g0(ColorStateList.valueOf(i15));
            invalidate();
        }
    }

    public void setDividerColorResource(int i15) {
        setDividerColor(a.d(getContext(), i15));
    }

    public void setDividerInsetEnd(int i15) {
        this.f35225e = i15;
    }

    public void setDividerInsetEndResource(int i15) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i15));
    }

    public void setDividerInsetStart(int i15) {
        this.f35224d = i15;
    }

    public void setDividerInsetStartResource(int i15) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i15));
    }

    public void setDividerThickness(int i15) {
        if (this.f35222b != i15) {
            this.f35222b = i15;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i15) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i15));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(Context context, AttributeSet attributeSet, int i15) {
        int i16 = f35220f;
        super(pj.a.d(context, attributeSet, i15, i16), attributeSet, i15);
        Context context2 = getContext();
        this.f35221a = new h();
        TypedArray typedArrayI = n.i(context2, attributeSet, l.f174145g3, i15, i16, new int[0]);
        this.f35222b = typedArrayI.getDimensionPixelSize(l.f174177k3, getResources().getDimensionPixelSize(d.F));
        this.f35224d = typedArrayI.getDimensionPixelOffset(l.f174169j3, 0);
        this.f35225e = typedArrayI.getDimensionPixelOffset(l.f174161i3, 0);
        setDividerColor(c.a(context2, typedArrayI, l.f174153h3).getDefaultColor());
        typedArrayI.recycle();
    }
}
