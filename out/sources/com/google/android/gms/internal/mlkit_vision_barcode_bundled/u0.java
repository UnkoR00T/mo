package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class u0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        boolean zO = false;
        boolean zO2 = false;
        boolean zO3 = false;
        float fR = 0.0f;
        byte[] bArrB = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                zO = kg.b.o(parcel, iT);
            } else if (iN == 2) {
                bArrB = kg.b.b(parcel, iT);
            } else if (iN == 3) {
                zO2 = kg.b.o(parcel, iT);
            } else if (iN == 4) {
                fR = kg.b.r(parcel, iT);
            } else if (iN != 5) {
                kg.b.B(parcel, iT);
            } else {
                zO3 = kg.b.o(parcel, iT);
            }
        }
        kg.b.m(parcel, iC);
        return new t0(zO, bArrB, zO2, fR, zO3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new t0[i15];
    }
}
