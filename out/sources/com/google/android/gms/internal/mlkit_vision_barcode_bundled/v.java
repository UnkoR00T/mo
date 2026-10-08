package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends kg.a {
    public static final Parcelable.Creator<v> CREATOR = new a1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30274b;

    public v(int i15, String str) {
        this.f30273a = i15;
        this.f30274b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int i16 = this.f30273a;
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, i16);
        kg.c.u(parcel, 2, this.f30274b, false);
        kg.c.b(parcel, iA);
    }
}
