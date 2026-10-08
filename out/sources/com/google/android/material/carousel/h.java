package com.google.android.material.carousel;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f35032d = {1};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f35033e = {1, 0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f35034c = 0;

    @Override // com.google.android.material.carousel.c
    public e g(wi.a aVar, View view) {
        boolean z15;
        int iC = aVar.c();
        if (aVar.g()) {
            iC = aVar.b();
        }
        RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
        float f15 = ((ViewGroup.MarginLayoutParams) qVar).topMargin + ((ViewGroup.MarginLayoutParams) qVar).bottomMargin;
        float measuredHeight = view.getMeasuredHeight();
        if (aVar.g()) {
            f15 = ((ViewGroup.MarginLayoutParams) qVar).leftMargin + ((ViewGroup.MarginLayoutParams) qVar).rightMargin;
            measuredHeight = view.getMeasuredWidth();
        }
        float fD = d() + f15;
        float fMax = Math.max(c() + f15, fD);
        float f16 = iC;
        float fMin = Math.min(measuredHeight + f15, f16);
        float fA = c6.a.a((measuredHeight / 3.0f) + f15, fD + f15, fMax + f15);
        float f17 = (fMin + fA) / 2.0f;
        int[] iArrA = f35032d;
        float f18 = 2.0f * fD;
        if (f16 <= f18) {
            iArrA = new int[]{0};
        }
        int[] iArrA2 = f35033e;
        if (aVar.e() == 1) {
            iArrA = c.a(iArrA);
            iArrA2 = c.a(iArrA2);
        }
        int[] iArr = iArrA2;
        int[] iArr2 = iArrA;
        float f19 = f15;
        int iMax = (int) Math.max(1.0d, Math.floor(((f16 - (d.i(iArr) * f17)) - (d.i(iArr2) * fMax)) / fMin));
        int iCeil = (int) Math.ceil(f16 / fMin);
        int i15 = (iCeil - iMax) + 1;
        int[] iArr3 = new int[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            iArr3[i16] = iCeil - i16;
        }
        a aVarC = a.c(f16, fA, fD, fMax, iArr2, f17, iArr, fMin, iArr3);
        this.f35034c = aVarC.e();
        boolean zI = i(aVarC, aVar.a());
        int i17 = aVarC.f34988d;
        if (i17 == 0 && aVarC.f34987c == 0 && f16 > f18) {
            aVarC.f34987c = 1;
            z15 = true;
        } else {
            z15 = zI;
        }
        if (z15) {
            aVarC = a.c(f16, fA, fD, fMax, new int[]{aVarC.f34987c}, f17, new int[]{i17}, fMin, new int[]{aVarC.f34991g});
        }
        return d.d(view.getContext(), f19, iC, aVarC, aVar.e());
    }

    @Override // com.google.android.material.carousel.c
    public boolean h(wi.a aVar, int i15) {
        if (i15 >= this.f35034c || aVar.a() < this.f35034c) {
            return i15 >= this.f35034c && aVar.a() < this.f35034c;
        }
        return true;
    }

    boolean i(a aVar, int i15) {
        int iE = aVar.e() - i15;
        boolean z15 = iE > 0 && (aVar.f34987c > 0 || aVar.f34988d > 1);
        while (iE > 0) {
            int i16 = aVar.f34987c;
            if (i16 > 0) {
                aVar.f34987c = i16 - 1;
            } else {
                int i17 = aVar.f34988d;
                if (i17 > 1) {
                    aVar.f34988d = i17 - 1;
                }
            }
            iE--;
        }
        return z15;
    }
}
