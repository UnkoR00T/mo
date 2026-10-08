package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends kg.a {
    public static final Parcelable.Creator<s> CREATOR = new m0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f30226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f30228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f30229d;

    public s(int i15, String str, String str2, String str3) {
        this.f30226a = i15;
        this.f30227b = str;
        this.f30228c = str2;
        this.f30229d = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        int i16 = this.f30226a;
        int iA = kg.c.a(parcel);
        kg.c.m(parcel, 1, i16);
        kg.c.u(parcel, 2, this.f30227b, false);
        kg.c.u(parcel, 3, this.f30228c, false);
        kg.c.u(parcel, 4, this.f30229d, false);
        kg.c.b(parcel, iA);
    }
}
