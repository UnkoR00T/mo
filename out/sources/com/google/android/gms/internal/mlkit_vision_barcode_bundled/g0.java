package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends kg.a {
    public static final Parcelable.Creator<g0> CREATOR = new h0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final t0 f29725a;

    public g0(t0 t0Var) {
        this.f29725a = t0Var;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i15) {
        t0 t0Var = this.f29725a;
        int iA = kg.c.a(parcel);
        kg.c.t(parcel, 1, t0Var, i15, false);
        kg.c.b(parcel, iA);
    }
}
