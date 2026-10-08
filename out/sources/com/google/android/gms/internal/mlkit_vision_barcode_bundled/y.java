package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends kg.a {
    public static final Parcelable.Creator<y> CREATOR = new e1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f30313c;

    public y(String str, String str2, int i15) {
        this.f30311a = str;
        this.f30312b = str2;
        this.f30313c = i15;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f30311a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.u(parcel, 2, this.f30312b, false);
        kg.c.m(parcel, 3, this.f30313c);
        kg.c.b(parcel, iA);
    }
}
