package com.google.android.gms.internal.clearcut;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class u5 extends a implements t5 {
    u5(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }

    @Override // com.google.android.gms.internal.clearcut.t5
    public final void d1(r5 r5Var, eg.f fVar) {
        Parcel parcelL3 = l3();
        y0.b(parcelL3, r5Var);
        y0.c(parcelL3, fVar);
        m3(1, parcelL3);
    }
}
