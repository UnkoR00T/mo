package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends kg.a {
    public static final Parcelable.Creator<w> CREATOR = new b1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f30286b;

    public w(String str, String str2) {
        this.f30285a = str;
        this.f30286b = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        String str = this.f30285a;
        int iA = kg.c.a(parcel);
        kg.c.u(parcel, 1, str, false);
        kg.c.u(parcel, 2, this.f30286b, false);
        kg.c.b(parcel, iA);
    }
}
