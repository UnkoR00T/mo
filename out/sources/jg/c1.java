package jg;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iC = kg.b.C(parcel);
        Bundle bundleA = null;
        f fVar = null;
        int iV = 0;
        gg.c[] cVarArr = null;
        while (parcel.dataPosition() < iC) {
            int iT = kg.b.t(parcel);
            int iN = kg.b.n(iT);
            if (iN == 1) {
                bundleA = kg.b.a(parcel, iT);
            } else if (iN == 2) {
                cVarArr = (gg.c[]) kg.b.k(parcel, iT, gg.c.CREATOR);
            } else if (iN == 3) {
                iV = kg.b.v(parcel, iT);
            } else if (iN != 4) {
                kg.b.B(parcel, iT);
            } else {
                fVar = (f) kg.b.g(parcel, iT, f.CREATOR);
            }
        }
        kg.b.m(parcel, iC);
        return new b1(bundleA, cVarArr, iV, fVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i15) {
        return new b1[i15];
    }
}
