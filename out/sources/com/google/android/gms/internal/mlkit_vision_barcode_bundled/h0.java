package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        t0 t0Var = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            if (kg.b.n(iT) != 1) {
                kg.b.B(parcel, iT);
            } else {
                t0Var = (t0) kg.b.g(parcel, iT, t0.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new g0(t0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new g0[i15];
    }
}
