package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        boolean zO = false;
        v0 v0Var = null;
        x0 x0Var = null;
        boolean zO2 = false;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                v0Var = (v0) kg.b.g(parcel, iT, v0.CREATOR);
            } else if (iN == 2) {
                x0Var = (x0) kg.b.g(parcel, iT, x0.CREATOR);
            } else if (iN == 3) {
                zO = kg.b.o(parcel, iT);
            } else if (iN != 4) {
                kg.b.B(parcel, iT);
            } else {
                zO2 = kg.b.o(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new e0(v0Var, x0Var, zO, zO2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new e0[i15];
    }
}
