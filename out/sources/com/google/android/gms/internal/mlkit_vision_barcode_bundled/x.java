package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class x extends kg.a {
    public static final Parcelable.Creator<x> CREATOR = new d1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30303b;

    public x(String str, String str2) {
        this.f30302a = str;
        this.f30303b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f30302a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.u(parcel, 2, this.f30303b, false);
        kg.c.b(parcel, iA);
    }
}
