package com.google.android.libraries.places.widget.internal.placedetails.photoviewer;

import android.content.Context;
import android.content.res.TypedArray;

/* JADX INFO: loaded from: classes4.dex */
final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f34632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f34633b;

    public j(Context context, int i15) {
        this.f34632a = context;
        this.f34633b = i15;
    }

    private final float c(int i15, int i16) {
        int[] iArr = fi.j.f64103a;
        Context context = this.f34632a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(this.f34633b, iArr);
        float dimension = typedArrayObtainStyledAttributes.getDimension(i15, context.getResources().getDimensionPixelSize(i16));
        typedArrayObtainStyledAttributes.recycle();
        return dimension;
    }

    public final float a() {
        return c(fi.j.f64107e, fi.c.f64035c);
    }

    public final float b() {
        return c(fi.j.f64106d, fi.c.f64034b);
    }
}
