package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends kg.a {
    public static final Parcelable.Creator<n> CREATOR = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String[] f30159b;

    public n(int i15, String[] strArr) {
        this.f30158a = i15;
        this.f30159b = strArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, this.f30158a);
        kg.c.v(parcel, 2, this.f30159b, false);
        kg.c.b(parcel, iA);
    }
}
