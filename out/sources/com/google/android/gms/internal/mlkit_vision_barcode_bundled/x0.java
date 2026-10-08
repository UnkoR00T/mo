package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class x0 extends kg.a {
    public static final Parcelable.Creator<x0> CREATOR = new y0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f30304a;

    public x0(float[] fArr) {
        this.f30304a = fArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        float[] fArr = this.f30304a;
        int iA = kg.c.a(parcel);
        kg.c.j(parcel, 1, fArr, false);
        kg.c.b(parcel, iA);
    }
}
