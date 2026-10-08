package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes4.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final b f35118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b f35119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final b f35120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final b f35121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final b f35122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final b f35123f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final b f35124g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Paint f35125h;

    c(Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(ij.b.f(context, ri.b.f173922q, i.class.getCanonicalName()), ri.l.f174288y2);
        this.f35118a = b.a(context, typedArrayObtainStyledAttributes.getResourceId(ri.l.C2, 0));
        this.f35124g = b.a(context, typedArrayObtainStyledAttributes.getResourceId(ri.l.A2, 0));
        this.f35119b = b.a(context, typedArrayObtainStyledAttributes.getResourceId(ri.l.B2, 0));
        this.f35120c = b.a(context, typedArrayObtainStyledAttributes.getResourceId(ri.l.D2, 0));
        ColorStateList colorStateListA = ij.c.a(context, typedArrayObtainStyledAttributes, ri.l.E2);
        this.f35121d = b.a(context, typedArrayObtainStyledAttributes.getResourceId(ri.l.G2, 0));
        this.f35122e = b.a(context, typedArrayObtainStyledAttributes.getResourceId(ri.l.F2, 0));
        this.f35123f = b.a(context, typedArrayObtainStyledAttributes.getResourceId(ri.l.H2, 0));
        Paint paint = new Paint();
        this.f35125h = paint;
        paint.setColor(colorStateListA.getDefaultColor());
        typedArrayObtainStyledAttributes.recycle();
    }
}
