package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;

/* JADX INFO: loaded from: classes4.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f35112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ColorStateList f35113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ColorStateList f35114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ColorStateList f35115d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f35116e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final lj.l f35117f;

    private b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i15, lj.l lVar, Rect rect) {
        i6.i.d(rect.left);
        i6.i.d(rect.top);
        i6.i.d(rect.right);
        i6.i.d(rect.bottom);
        this.f35112a = rect;
        this.f35113b = colorStateList2;
        this.f35114c = colorStateList;
        this.f35115d = colorStateList3;
        this.f35116e = i15;
        this.f35117f = lVar;
    }

    static b a(Context context, int i15) {
        i6.i.b(i15 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i15, ri.l.I2);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(ri.l.J2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(ri.l.L2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(ri.l.K2, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(ri.l.M2, 0));
        ColorStateList colorStateListA = ij.c.a(context, typedArrayObtainStyledAttributes, ri.l.N2);
        ColorStateList colorStateListA2 = ij.c.a(context, typedArrayObtainStyledAttributes, ri.l.S2);
        ColorStateList colorStateListA3 = ij.c.a(context, typedArrayObtainStyledAttributes, ri.l.Q2);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(ri.l.R2, 0);
        lj.l lVarM = lj.l.b(context, typedArrayObtainStyledAttributes.getResourceId(ri.l.O2, 0), typedArrayObtainStyledAttributes.getResourceId(ri.l.P2, 0)).m();
        typedArrayObtainStyledAttributes.recycle();
        return new b(colorStateListA, colorStateListA2, colorStateListA3, dimensionPixelSize, lVarM, rect);
    }

    int b() {
        return this.f35112a.bottom;
    }

    int c() {
        return this.f35112a.top;
    }

    void d(TextView textView) {
        e(textView, null, null);
    }

    void e(TextView textView, ColorStateList colorStateList, ColorStateList colorStateList2) {
        lj.h hVar = new lj.h();
        lj.h hVar2 = new lj.h();
        hVar.setShapeAppearanceModel(this.f35117f);
        hVar2.setShapeAppearanceModel(this.f35117f);
        if (colorStateList == null) {
            colorStateList = this.f35114c;
        }
        hVar.g0(colorStateList);
        hVar.n0(this.f35116e, this.f35115d);
        if (colorStateList2 == null) {
            colorStateList2 = this.f35113b;
        }
        textView.setTextColor(colorStateList2);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f35113b.withAlpha(30), hVar, hVar2);
        Rect rect = this.f35112a;
        textView.setBackground(new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }
}
