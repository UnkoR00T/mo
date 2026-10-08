package com.google.android.material.carousel;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f34996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f34997b;

    enum a {
        CONTAINED,
        UNCONTAINED
    }

    static int[] a(int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i15 = 0; i15 < length; i15++) {
            iArr2[i15] = iArr[i15] * 2;
        }
        return iArr2;
    }

    public static float b(float f15, float f16, float f17) {
        return 1.0f - ((f15 - f17) / (f16 - f17));
    }

    public float c() {
        return this.f34997b;
    }

    public float d() {
        return this.f34996a;
    }

    a e() {
        return a.CONTAINED;
    }

    void f(Context context) {
        float fH = this.f34996a;
        if (fH <= 0.0f) {
            fH = d.h(context);
        }
        this.f34996a = fH;
        float fG = this.f34997b;
        if (fG <= 0.0f) {
            fG = d.g(context);
        }
        this.f34997b = fG;
    }

    public abstract e g(wi.a aVar, View view);

    public abstract boolean h(wi.a aVar, int i15);
}
