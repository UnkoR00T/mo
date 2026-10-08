package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends kg.a {
    public static final Parcelable.Creator<t> CREATOR = new n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f30232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f30233b;

    public t(double d15, double d16) {
        this.f30232a = d15;
        this.f30233b = d16;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        double d15 = this.f30232a;
        int iA = kg.c.a(parcel);
        kg.c.h(parcel, 1, d15);
        kg.c.h(parcel, 2, this.f30233b);
        kg.c.b(parcel, iA);
    }
}
